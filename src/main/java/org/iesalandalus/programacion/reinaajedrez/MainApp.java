package org.iesalandalus.programacion.reinaajedrez;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;

public class MainApp {

	private static  Reina reina;
	
	private static void ejecutarOpcion(int opcion) {
		
			switch (opcion) { 
		    case 1:
		    	crearReinaDefecto();
		    	mostrarReina();
		     break;
		    case 2:
		    	crearReinaColor();
		    	mostrarReina();
		     break;
		    case 3:
		    	mover();
		    	mostrarReina();
		     break;
		    case 4:
		    	Consola.despedirse();
		     break;
		    default:
			}
		
	}
	private static void crearReinaDefecto() {
		reina = new Reina();
	}
	private static void crearReinaColor() {
		reina = new Reina(Consola.elegirColor());
	}
	
	private static void mover() {
		try {
			reina.mover(Consola.elegirDireccion(), Consola.elegirPasos());
		} catch (OperationNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	private static void mostrarReina() {
		if (reina == null) {
			throw new NullPointerException("No hay reina creada.");
		}
		System.out.println(reina);
	}
	
	
	public static void main(String[] args) {
		int i;
		do {
			i = Consola.elegirOpcionMenu();
			ejecutarOpcion(i);
		} while (i != 4);
	}

}
