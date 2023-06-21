package dia2;

import java.util.Scanner;

public class tarea2 {

	//Confeccionar una clase que permita ingresar tres valores por teclado. Luego mostrar el mayor y el menor
public static void main(String[] arg) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Bienvenido, vamos a comparar tres numeros, favor de Ingresar el primer numero ; ");
		int numero1 = (int) input.nextFloat();
		
		System.out.println("Favor de Ingresar el segundo numero ; ");
		int numero2 = (int) input.nextFloat();
		
		System.out.println("Favor de Ingresar el tercer numero ; ");
		int numero3 = (int) input.nextFloat();
		
		int mayor = numero1;
        if (numero2 > mayor) {
            mayor = numero2;
        }
        if (numero3 > mayor) {
            mayor = numero3;
        }
	
        int menor = numero1;
        if (numero2 < menor) {
            menor = numero2;
        }
        if (numero3 < menor) {
            menor = numero3;
        }
        
        
        System.out.println("El mayor valor es: " + mayor);
        System.out.println("El menor valor es: " + menor);
     
}

	
}