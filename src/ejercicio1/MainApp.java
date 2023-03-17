
package ejercicio1;

import javax.swing.JOptionPane;

		/*Escribe un programa, utilizando para ello el paradigma de POO, que juegue con el usuario a adivinar
		 *  un número. 
		 *  Debe cumplir los siguientes requerimientos:
		 *  - El ordenador debe generar un número entre 1 y 500, y el usuario tiene que intentar adivinarlo.
		 *  - Cada vez que el usuario introduce un valor, el ordenador debe decirle al usuario si el numero 
		 * que tiene que adivinar es mayor o menor que el que ha introducido el usuario.
		 * 	- Cuando consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
		 * ha intentado adivinar el número.
		 * 	- Si el usuario introduce algo que no es un numero, debe indicarlo en pantalla, y al contarlo como un 
		 * intento indicando que no ha conseguido reconocer la entrada lanzando la excepción InputMismatchException.*/

		public class MainApp {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				Juego juego1 = new Juego();
				JOptionPane.showMessageDialog(null, "Bienvenido al juego Adivina el número secreto.");
				juego1.adivinador();

			
			
		


	}

}
