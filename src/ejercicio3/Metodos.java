package ejercicio3;

import java.util.Random;

import customizedException.MyExceptionEx3;

public class Metodos {
	private int number;
	
	
	public void numberGenerator() throws MyExceptionEx3 {
		
		System.out.println("Generando número aleatorio...");
		Random random = new Random();
		number = random.nextInt(999);
		System.out.println("El número aleatorio generado es "+number+".");
		
		checkOdd(number);
	}
	
	public void checkOdd(int number) throws MyExceptionEx3 {
		if(number%2==0) {
			throw new MyExceptionEx3(1);
		}else {
			throw new MyExceptionEx3(2);
		}
	}

}
