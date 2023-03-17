package customizedException;

/*
 * 
 * Creación de una clase con una excepción personalizada.
 * 
 * */

public class MyExceptionMessage extends Exception {

	public MyExceptionMessage(String errorMessage) {
		super(errorMessage);

	}

}
