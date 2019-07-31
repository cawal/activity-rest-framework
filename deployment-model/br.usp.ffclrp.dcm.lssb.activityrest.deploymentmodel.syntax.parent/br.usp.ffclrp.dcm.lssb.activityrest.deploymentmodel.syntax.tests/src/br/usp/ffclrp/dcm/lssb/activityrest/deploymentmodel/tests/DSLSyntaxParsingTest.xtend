/*
 * generated by Xtext 2.18.0
 */
package br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.tests

import com.google.inject.Inject
import deploymentmodel.Deployment
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.eclipse.xtext.serializer.impl.Serializer

@ExtendWith(InjectionExtension)
@InjectWith(DSLSyntaxInjectorProvider)
class DSLSyntaxParsingTest {
	@Inject
	ParseHelper<Deployment> parseHelper
	@Inject 
	Serializer serializer
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			deployment { 
					of service "test-service" { api-version "1.1" }
					into container 'test-container' {
							base-url 'http://teste.com:80/basePath'
							description 'Nice description' 
						}
			}
		''')
		println(result.container.baseUrl)
		println(result.container.baseUrl.class)
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		println(serializer.serialize(result))
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
}
