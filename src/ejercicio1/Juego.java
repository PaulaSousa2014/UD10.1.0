package ejercicio1;

import java.util.Random;

import javax.swing.JOptionPane;

public class Juego {
	
	private int numero;
	private int intento;
	private int contador=0;
	
	
	//Metodo para generar el numero aleatorio de 1 a 500 a adivinar por el usuario
	public int generadorNumero() {
		Random random = new Random();
		 numero = random.nextInt(500) + 1;
		return numero;
	}

	//Metodo para pedir numero al usuario y comprobar si es mayor/menor o igual al generado aleatoriamente
	public void adivinador() {
		generadorNumero();
		do {
		intento = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero de 1 a 500"));
		contador++;
		if(intento<numero) {
			JOptionPane.showMessageDialog(null, "Has realizado tu intento numero "+contador+" . El número introducido es menor que el secreto.");
		}else if(intento>numero) {
			JOptionPane.showMessageDialog(null, "Has realizado tu intento numero "+contador+" . El número introducido es mayor que el secreto.");
		}else {
			JOptionPane.showMessageDialog(null, "¡Has adivinado el número secreto "+numero+" en "+contador+" intentos!\n¡Enhorabuena!");
		}
		}while(intento!=numero);
	}
}
