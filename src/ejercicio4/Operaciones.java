package ejercicio4;

import utilidades.UtilidadesEj4;

public class Operaciones {

	int num1;
	int num2;
	double resultado;

	UtilidadesEj4 utl = new UtilidadesEj4();

	public void realizarOperacion(int seleccion) {

		switch (seleccion) {
		case 1:
			System.out.println("Has seleccionado sumar.");
			num1 = utl.solicitarNum();
			num2 = utl.solicitarNum();
			System.out.println(num1 + num2);
			break;
		case 2:
			System.out.println("Has seleccionado restar.");
			num1 = utl.solicitarNum();
			num2 = utl.solicitarNum();
			System.out.println(num1 - num2);
			break;
		case 3:
			System.out.println("Has seleccionado multiplicación.");
			num1 = utl.solicitarNum();
			num2 = utl.solicitarNum();
			System.out.println(num1 * num2);
			break;
		case 4:
			System.out.println("Has seleccionado división.");
			num1 = utl.solicitarNum();
			num2 = utl.solicitarNum();
			System.out.println(num1 / num2);
			break;
		case 5:
			System.out.println("Has seleccionado calcular potencia.");
			num1 = utl.solicitarNum();
			num2 = utl.solicitarNum();
			System.out.println(Math.pow(num1, num2));
			break;
		case 6:
			System.out.println("Has seleccionado calcular raíz cuadrada.");
			num1 = utl.solicitarNum();
			System.out.println(Math.sqrt(num1));
			break;
		case 7:
			System.out.println("Has seleccionado calcular raíz cubica.");
			num1 = utl.solicitarNum();
			System.out.println(Math.cbrt(num1));
			break;
		case 8:
			utl.imprimirMenu();
			break;
		case 9:
			break;


		// Si no entra ninguna opcion saltara el error TypeNotPresentExcetion
		default:
			System.out.println("No has introducido una opción valida.");
		}

		

	}

}
