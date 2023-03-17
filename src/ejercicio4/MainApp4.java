package ejercicio4;

public class MainApp4 {

	public static void main(String[] args) {

		Utilidades utl = new Utilidades();
		Operaciones op = new Operaciones();
		int opcion;

		try {
			utl.abrirScanner();
			utl.imprimirMenu();

			do {

				opcion = utl.seleccionarOpcion();

				op.realizarOperacion(opcion);
				
			} while (opcion >=1 && opcion<9);
			utl.cerrarScanner();
			

		} catch (Exception e) {

		}

	}

}
