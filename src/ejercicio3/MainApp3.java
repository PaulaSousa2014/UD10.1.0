package ejercicio3;

import customizedException.MyExceptionEx3;

public class MainApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Metodos m = new Metodos();
			m.numberGenerator();
			
		}catch (MyExceptionEx3 e) {
				System.out.println( e.getMessage());
		}
	}

}
