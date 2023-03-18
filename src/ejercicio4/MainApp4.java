package ejercicio4;

import utilidades.UtilidadesEj4;

public class MainApp4 {

	public static void main(String[] args) {
		
		//Creamos objetos de las clases
		UtilidadesEj4 utl = new UtilidadesEj4();
		Operaciones op = new Operaciones();
		
		
		int opcion;
		
		//Llamamos a utilidades para iniciar programa y imprimir menu de opciones
		utl.abrirScanner();
		utl.imprimirMenu();
		
		//Abrimos un bucle para que no salga del programa hasta que el usuario lo solicite
		do {
			//Llamamos a utilidades para solicitar la operacion a realizar y guardamos en una variable
			opcion = utl.seleccionarOpcion();
			//Llamamos a operaciones para realizar la operacion seleccionada
			op.realizarOperacion(opcion);

		} while (opcion >= 1 && opcion < 9);
		
		//llamamos a utilidades para cerrar programa
		utl.cerrarScanner();

	}

}
