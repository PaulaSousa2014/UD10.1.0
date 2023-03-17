package ejercicio4;

import java.util.Scanner;

public class Utilidades {
	
	int operacion;
	
	Scanner sc = new Scanner(System.in);

	public void abrirScanner() {

		Scanner sc = new Scanner(System.in);
		System.out.println("************BIENVENIDO A LA CALCULADORA*************\n");
		imprimirMenu();

	}

	public int imprimirMenu() {

		System.out.println("Menú de operaciones disponibles:\n" + "1. Sumar;\n" + "2. Restar;\n" + "3. Multiplicar;\n"
				+ "4. Dividir;\n" + "5. Calcular potencia;\n" + "6. Calcular raiz cuadrada;\n" + "7. Calcular raiz cúbica;\n"
				+ "8. Imprimir menú de operaciones disponibles;\n" + "9. Salir del programa.\n");

		System.out.println("Introduzca el número de la opcion que deseas realizar: ");

		return operacion = Integer.parseInt(sc.nextLine());
		

	}
	
	public int solicitarNum() {
		System.out.println("Introduzca un numero: ");
		return Integer.parseInt(sc.nextLine());
	}

}
