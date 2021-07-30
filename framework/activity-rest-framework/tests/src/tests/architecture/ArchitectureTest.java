package tests.architecture;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;
import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

import javax.ws.rs.Path;
import javax.ws.rs.ext.Provider;

import org.junit.runner.RunWith;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.junit.ArchUnitRunner;
import com.tngtech.archunit.lang.ArchRule;

@RunWith(ArchUnitRunner.class)
@AnalyzeClasses(packages = "br.usp.ffclrp.dcm.lssb.activityrest")
public class ArchitectureTest {
	
	
	@ArchTest
	public static ArchRule endpointsPackage =
			classes().that().areAnnotatedWith(Path.class)
					.should().resideInAPackage("..endpoints..");
	
	@ArchTest
	public static ArchRule providersPackage =
			classes().that().areAnnotatedWith(Provider.class)
					.should().resideInAPackage("..providers..");
	
	
	
	@ArchTest
	public static ArchRule rule = layeredArchitecture()
			.layer("rest interface").definedBy("..rest..")
			.layer("dto").definedBy("..representations..")
			.layer("job").definedBy("..jobmanagement..")
			.layer("persistence").definedBy("..dao..")
			
			.whereLayer("rest interface")
			.mayNotBeAccessedByAnyLayer()
			
			.whereLayer("job")
			.mayOnlyBeAccessedByLayers("rest interface")
			
			.whereLayer("persistence")
			.mayOnlyBeAccessedByLayers("rest interface");
	
	
	
	@ArchTest
	public static ArchRule restLayers = layeredArchitecture()
			.layer("endpoints").definedBy("..endpoints..")
			.layer("representations").definedBy("..representations..")
			.layer("messageBodyProviders").definedBy("..messagebodyparsers..")
			
			.whereLayer("messageBodyProviders")
			.mayNotBeAccessedByAnyLayer()
			
			.whereLayer("endpoints")
			.mayNotBeAccessedByAnyLayer()
			
			.whereLayer("representations")
			.mayOnlyBeAccessedByLayers("endpoints", "messageBodyProviders");
	
	@ArchTest
	public static ArchRule messageBodyParsersAreIsolated =
			noClasses()
					.that().resideInAPackage("..messagebodyparsers..")
					.should().accessClassesThat()
					.resideInAPackage(
							"br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel");
	
	
}