package customizedException;

/*
 * 
 * Creación de una clase con una excepción personalizada.
 * 
 * */

public class MyException extends Exception {
	private int exceptionCode;

	public MyException(int error) {
		super();
		this.exceptionCode = error;
	}

	public MyException() {
		super();
	}

	// Sobrescribo el metodo getMessage para tener un mensaje customizado
	@Override
	public String getMessage() {
		String message = "";

		switch (exceptionCode) {
		case 1:
			message = "El numero introducido no es par.";
			break;
		case 2:
			message = "El numero introducido esta fuera del rango solicitado.";
			break;
		}

		return message;
	}
}
