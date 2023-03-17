package ejercicio4;



public class MainApp4 {

	public static void main(String[] args) {
		
		
		Utilidades utl = new Utilidades();
		Operaciones op = new Operaciones();

		utl.abrirScanner();
		
		try {
			op.realizarOperacion(utl.imprimirMenu());
			
		}catch(Exception e) {
			
		}
		
	}

}
