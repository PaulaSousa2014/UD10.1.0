package ejercicio4;

public class Operaciones {

	int num1;
	int num2;
	double resultado;

	Utilidades utl = new Utilidades();

	public double realizarOperacion(int seleccion) {
		switch (seleccion) {
		case 1:
			System.out.println("Has seleccionado sumar.");
			num1 = utl.solicitarNum();
			num2 = utl.solicitarNum();
			return num1 + num2;

		case 2:
			System.out.println("Has seleccionado restar.");
			num1 = utl.solicitarNum();
			num2 = utl.solicitarNum();
			return num1 - num2;

		case 3:
			System.out.println("Has seleccionado multiplicación.");
			num1 = utl.solicitarNum();
			num2 = utl.solicitarNum();
			return num1 * num2;
		case 4:
			System.out.println("Has seleccionado división.");
			num1 = utl.solicitarNum();
			num2 = utl.solicitarNum();
			return num1 / num2;
		case 5:
			System.out.println("Has seleccionado calcular potencia.");
			num1 = utl.solicitarNum();
			num2 = utl.solicitarNum();
			return Math.pow(num1, num2);
		case 6:
			System.out.println("Has seleccionado calcular raíz cuadrada.");
			num1 = utl.solicitarNum();
			return Math.sqrt(num1);
		case 7:
			System.out.println("Has seleccionado calcular raíz cubica.");
			num1 = utl.solicitarNum();
			return Math.cbrt(num1);
		case 8:
			utl.imprimirMenu();
		case 9:
			System.out.println("Gracias por usar nuestra calculadora.");
			break;

		// Si no entra ninguna opcion saltara el error TypeNotPresentExcetion
		default:
			throw new TypeNotPresentException("Operación no válida. ", new Throwable());
		}
		return resultado;
	}

}
