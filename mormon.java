package dia2;

import java.util.Scanner;

public class mormon {

	//Crear una clase donde se ingrese el nombre de la persona y su edad, imprimirlo al final y saludar
public static void main(String[] arg) {
		
	Scanner scanner = new Scanner(System.in);
		
		System.out.println("¿Cual es tu nombre? : ");
		String nombre = scanner.nextLine();
		
		System.out.println("¿Cual es tu edad? : ");
		String edad = scanner.nextLine();
	
		System.out.println("Tienes" + edad);
		System.out.println("¡Hola " + nombre + "! Bienvenido/a.");
}
}