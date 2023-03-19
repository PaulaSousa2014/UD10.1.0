package utilidades;

import ejercicio5.Password;
import java.util.Scanner;

import ejercicio5.Password;

public class UtilidadesEj5 {

	Scanner sc = new Scanner(System.in);
	Password pass = new Password();

	public void crearObjeto() {
	
		int longitud = Integer.parseInt(sc.nextLine());
		String[] passArray = new String[longitud];

		for (int i = 0; i < passArray.length; i++) {

			String passC=crearPass();
			if(passC!=null) {
				passArray[i] = passC;
				System.out.println("Contraseña generada: "+passC+"   esFuerte: "+pass.esFuerte(passC));	
				
			}
				
		}
		System.out.println("\nHas creado "+passArray.length+ " contraseñas: ");
		for (int j = 0; j < passArray.length; j++) {
	        System.out.println("Contraseña "+ (j+1)+": "+passArray[j]);
	    }
	}

	public String crearPass() {
		String passGen=null;
		System.out.println("Introduzca la longitud de la contraseña: ");
		int longitudPass = Integer.parseInt(sc.nextLine());
		
		if(longitudPass>10) {
			passGen= pass.generarPassword(longitudPass);
		}else {
			System.out.println("La longitud mínima tiene que ser mayor que 10.");
			
		}
		
		
		return passGen;
	}

}
