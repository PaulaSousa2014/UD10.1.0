package ejercicio2;

import javax.swing.JOptionPane;
import customizedException.MyException;

public class Main2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;

		/*
		 * Abrimos un try-catch para controlar error en caso que el usuario no realicce
		 * la operacion solicitada adecuadamente.
		 * 
		 */
		try {

			System.out.println("Inicializando prueba de excepción");

			num = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca un numero par de 0 a 5."));

			// Si introduce un numero que no es par, entrara la excepcion de codigo 1
			if (num % 2 != 0) {
				throw new MyException(1);

				// Si introduce un numero fuera del rango solicitado, entrara la excepción de
				// codigo 2
			} else if (num <= 0 || num > 5) {
				throw new MyException(2);

				// En caso correcto sigue el programa
			} else {
				System.out.println("¡Enhorabuena! Has introducido un numero correcto.");
			}

		} catch (MyException e) {
			System.out.println("Excepción capturada con mensaje: " + e.getMessage());

			// El bloque finally se realiza siempre. Saltando o no las excepciones
		} finally {
			System.out.println("Programa finalizado");
		}

	}

}
