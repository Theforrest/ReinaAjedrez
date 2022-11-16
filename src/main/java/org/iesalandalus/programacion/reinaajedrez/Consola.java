package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.utilidades.Entrada;

public final class Consola {
	
	private Consola() {
		
	}
	
	public static void mostrarMenu() {
		System.out.println("1. Crear reina por defecto. \n2. Crear reina personalizada. \n3. Mover reina. \n4 Salir.");
	}
	public static int elegirOpcionMenu() {
		int i;
		do {
		System.out.println("Eliga una opcion del menu (1-5)");
		mostrarMenu();
		i = Entrada.entero();
		} while (i <= 0 || i >= 6);
		return i;
	}
	public static Color elegirColor() {
		int i;
		do {
		System.out.println("Eliga color blanco o negro");
		System.out.println("1. Blanco. \n2. Negro.");
		i = Entrada.entero();
		} while (i <= 0 || i >= 3);
		return Color.values()[i-1];
	}
	public static void mostrarMenuDirecciones() {
		System.out.println("1. Norte. \n2. Noreste. \n3. Este. \n4. Sureste. \n5. Sur. \n6. Suroeste. \n7. Oeste. \n8. Noroeste.");

	}
	
	public static Direccion elegirDireccion() {
		int i;
		do {
		System.out.println("Eliga una opcion del menu (1-8)");
		mostrarMenuDirecciones();
		i = Entrada.entero();
		} while (i <= 0 || i >= 9);
		return Direccion.values()[i-1];
	}
	public static int elegirPasos() {
		int i;
		System.out.println("Eliga el número de pasos");
		i = Entrada.entero();
		return i;
	}
	
	public static void despedirse() {
		System.out.println("Bye bye.");
	}
}
