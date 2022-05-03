package practicas02;
import java.util.Scanner;

/** 
    Escribe un programa simple que lea una serie de números enteros por teclado e indique cuál es el mayor de todos
    ellos.No se deben guardar los datos introducidos; sólo debe ir guardándose el que vaya siendo mayor.
    Cada vez que se lee un dato el programa pregunta si se quiere seguir. Se debe pulsar la tecla S para seguir.
    Documenta el programa con comentarios aclaratorios adicionales si se considera necesario.
**/
public class Ejercicio13 {
	public static void main (String []args) {
		Scanner teclado = new Scanner(System.in);
		
		int mayor = Integer.MIN_VALUE;
		int actual;
		String continuar = "";
		
		do {
			System.out.print("Introduce un número :  ");
			actual = teclado.nextInt();
			teclado.nextLine();
			if (actual>mayor)  {
				mayor=actual;
				}
			System.out.print("¿Deseas seguir?(s)  ");
			continuar = teclado.nextLine();
		}
		while (continuar.trim().equalsIgnoreCase("S"));
		
		System.out.println("\nEl mayor es: " + mayor);
	}
}