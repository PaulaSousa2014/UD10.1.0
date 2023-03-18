package ejercicio4;

import utilidades.UtilidadesEj4;

public class MainApp4 {

	public static void main(String[] args) {

		UtilidadesEj4 utl = new UtilidadesEj4();
		Operaciones op = new Operaciones();
		int opcion;

		utl.abrirScanner();
		utl.imprimirMenu();

		do {

			opcion = utl.seleccionarOpcion();

			op.realizarOperacion(opcion);

		} while (opcion >= 1 && opcion < 9);
		utl.cerrarScanner();

	}

}
