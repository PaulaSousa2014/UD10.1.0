package customizedException;

public class MyExceptionEx3 extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7867880898926269564L;
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
			message = "Es par.";
			break;
		case 2:
			message = "Els impar.";
			break;
		}

		return message;
	}
}
