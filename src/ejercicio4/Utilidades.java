package ejercicio4;

import java.util.Scanner;

public class Utilidades {
	
	int operacion;
	
	Scanner sc = new Scanner(System.in);

	public void abrirScanner() {

		Scanner sc = new Scanner(System.in);
		System.out.println(""
				+ "===================================================\n"
				+ "************BIENVENIDO A LA CALCULADORA************\n"
				+ "===================================================");
		

	}

	public void imprimirMenu() {

		System.out.println("Menú de operaciones disponibles:\n" + "1. Sumar;\n" + "2. Restar;\n" + "3. Multiplicar;\n"
				+ "4. Dividir;\n" + "5. Calcular potencia;\n" + "6. Calcular raiz cuadrada;\n" + "7. Calcular raiz cúbica;\n"
				+ "8. Imprimir menú de operaciones disponibles;\n" + "9. Salir del programa.\n");
	}
	
	public int seleccionarOpcion() {
		System.out.println("Seleccione una opción del menú: ");

		return  Integer.parseInt(sc.nextLine());
		

	}
	
	public int solicitarNum() {
		System.out.println("Introduzca un numero: ");
		return Integer.parseInt(sc.nextLine());
	}
	
	public void cerrarScanner() {
		System.out.println(""
				+ "==================================================\n"
				+ "********Gracias por usar la calculadora.**********\n"
				+ "==================================================");
		sc.close();
	}

}
