package ejercicio5;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Password {
	@Override
	public String toString() {
		return "Contraseña: " + pass;
	}

	protected int longitud;
	protected String pass;

	// constructor por defecto
	public Password() {

	}

	// constructor que recibe longitud
	public Password(int longitud) {
		this.longitud = longitud;
	}

	// Tener mas de 2 mayusculas, mas de 1 miniscula y mas de 5 numeros
	public boolean esFuerte(String pass) {

		char[] passArr = pass.toCharArray();
		ArrayList<Character> mayusculas = new ArrayList<Character>();
		ArrayList<Character> minusculas = new ArrayList<Character>();
		ArrayList<Character> numeros = new ArrayList<Character>();
		for (int i = 0; i < passArr.length; i++) {
			if (Character.isUpperCase(passArr[i])) {
				mayusculas.add(passArr[i]);
			} else if (Character.isLowerCase(passArr[i])) {
				minusculas.add(passArr[i]);
			} else if (Character.isDigit(passArr[i])) {
				numeros.add(passArr[i]);
			}
		}
		if (mayusculas.size() > 2 && minusculas.size() > 1 && numeros.size() > 5) {
			return true;
		}

		return false;
	}

	public String generarPassword(int longitud) {
		// Rango ASCII – alfanumérico (0-9, a-z, A-Z)
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789?¿¡!-_";

		SecureRandom random = new SecureRandom();
		StringBuilder sb = new StringBuilder();
		String pass = null;

		do {
			// receteamos variables
			sb.setLength(0);
			String passPrueba = null;
			for (int i = 0; i < longitud; i++) {
				int randomIndex = random.nextInt(chars.length());
				sb.append(chars.charAt(randomIndex));

			}
			passPrueba = sb.toString();


			if (esFuerte(passPrueba)) {
				pass = passPrueba;
				
			}
		} while (pass == null);

		return pass;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getPass() {
		return pass;
	}

}
