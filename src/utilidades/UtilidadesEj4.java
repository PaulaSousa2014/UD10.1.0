package utilidades;

import java.util.Scanner;

/*
 * 
 * Creamos la clase utilidades para realizar la interaccion con el usuario a traves de Scanner
 * 
 * */


public class UtilidadesEj4 {
	


		
		int operacion;
		
		Scanner sc = new Scanner(System.in);
		
		
		//Creamos un metodo para inicializar el programa con un mensaje de bienvenida
		public void abrirScanner() {

			//He imprimido algunos mensajes con color  utilizando las secuencias de escape ANSI 
			System.out.println(""
					+ "\033[33m===================================================\033[0m\n"
					+ "\033[32m************BIENVENIDO A LA CALCULADORA************\033[0m\n"
					+ "\033[33m===================================================\033[0m");
			

		}

		//Creamos un metodo para imprimir el menu por separado para que pueda ser llamado 
		//por el usuario las veces que necesite
		public void imprimirMenu() {

			System.out.println("\033[32mMenú de operaciones disponibles:\n" 
								+ "1. Sumar;\n" 
								+ "2. Restar;\n" 
								+ "3. Multiplicar;\n"
								+ "4. Dividir;\n" 
								+ "5. Calcular potencia;\n" 
								+ "6. Calcular raiz cuadrada;\n" 
								+ "7. Calcular raiz cúbica;\n"
								+ "8. Imprimir menú de operaciones disponibles;\n" 
								+ "9. Salir del programa.\033[0m\n");
		}
		
		//Creamos un metodo para seleccionar la opcion del menu y controlamos las excepciones
		//por introducir un formato no numerico
		public int seleccionarOpcion() {
			
			int seleccion=9;
			System.out.println("Seleccione una opción del menú: ");
			
			try {
			seleccion=Integer.parseInt(sc.nextLine());
			}catch(NumberFormatException e) {
				System.out.println("Error en la seleccion de operación. Error detectado: "+ e.getMessage());
			}
			return  seleccion;
			

		}
		
		//Creamos un metodo para solicitar un opeerando y controlamos la excepcion por una posible
		//introduccion de dato no numerico
		public int solicitarNum() {
			int num=0;
			
			System.out.println("Introduzca un numero: ");
			
			try {
			num=Integer.parseInt(sc.nextLine());
			}catch(NumberFormatException e) {
				System.out.println("Error en el dato introducido. Error detectado: "+e.getMessage());
			}
			return num;
		}
		
		//Creamos un metodo para cerrar el programa para que el usuario pueda llamarlo cuando ya
		//no quiera operar
		public void cerrarScanner() {
			System.out.println(""
					+ "\033[33m==================================================\033[0m\n"
					+ "\033[32m********Gracias por usar la calculadora.**********\033[0m\n"
					+ "\033[33m==================================================\033[0m");
			sc.close();
		}

	}


