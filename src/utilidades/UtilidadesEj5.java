package utilidades;


import java.util.Scanner;
import ejercicio5.Password;

public class UtilidadesEj5 {

	Scanner sc = new Scanner(System.in);
	Password pass = new Password();

	public void crearObjeto() {

		int longitud=0;
		do {
			try {
		System.out.println("Introduzca cuantas contraseñas quieres generar: ");
		longitud = Integer.parseInt(sc.nextLine());
			}catch (NumberFormatException e) {
				System.out.println("Error en la introducción de la longitud: " + e.getMessage());
			}
		}while(longitud==0);
		

		String[] passArray = new String[longitud];

		for (int i = 0; i < passArray.length; i++) {
			String passC;
			do {
				passC = crearPass();
				passArray[i] = passC;
			} while (passC == null);
			System.out.println("Contraseña generada: " + passC + "   esFuerte: " + pass.esFuerte(passC));
			
			

		}
		System.out.println("\nHas creado " + passArray.length + " contraseñas: ");
		for (int j = 0; j < passArray.length; j++) {
			
			System.out.println("Contraseña " + (j + 1) + ": " + passArray[j]);
		}
	}

	public String crearPass() {
		String passGen = null;
		try {
			System.out.println("Introduzca la longitud de la contraseña: ");
			int longitudPass = Integer.parseInt(sc.nextLine());

			if (longitudPass > 10) {
				passGen = pass.generarPassword(longitudPass);
			} else {
				System.out.println("La longitud mínima tiene que ser mayor que 10.");

			}
		} catch (NumberFormatException e) {
			System.out.println("Error en la introducción de la longitud: " + e.getMessage());
		}

		return passGen;
	}

}
