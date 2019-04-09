package br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.exceptions;

public class NonSupportedFunctionalEntity extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	final Class<?> metamodelClass;
	
	public NonSupportedFunctionalEntity(Class<?> metamodelClass) {
		this.metamodelClass = metamodelClass;
	}
	
	@Override
	public String getMessage() {
		return "JobBuilderNotFound for class: "
				+ metamodelClass.getName()
				+ "\n"
				+ super.getMessage();
	}
	
}
