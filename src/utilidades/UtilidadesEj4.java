package utilidades;

import java.util.Scanner;


public class UtilidadesEj4 {
	


		
		int operacion;
		
		Scanner sc = new Scanner(System.in);

		public void abrirScanner() {

			//He imprimido algunos mensajes con color  utilizando las secuencias de escape ANSI 
			System.out.println(""
					+ "\033[33m===================================================\033[0m\n"
					+ "\033[32m************BIENVENIDO A LA CALCULADORA************\033[0m\n"
					+ "\033[33m===================================================\033[0m");
			

		}

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
		
		public void cerrarScanner() {
			System.out.println(""
					+ "\033[33m==================================================\033[0m\n"
					+ "\033[32m********Gracias por usar la calculadora.**********\033[0m\n"
					+ "\033[33m==================================================\033[0m");
			sc.close();
		}

	}


