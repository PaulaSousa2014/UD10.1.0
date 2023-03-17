package customizedException;

public class MyExceptionEx3 extends Exception{
	private int exceptionCode;

	public MyExceptionEx3(int error) {
		super();
		this.exceptionCode = error;
	}

	public MyExceptionEx3() {
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
