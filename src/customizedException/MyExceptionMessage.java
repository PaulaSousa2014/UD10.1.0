package customizedException;

/*
 * 
 * Creación de una clase con una excepción personalizada.
 * 
 * */

public class MyExceptionMessage extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyExceptionMessage(String errorMessage) {
		super(errorMessage);

	}

}
