package practicas02;
/**

    Escribe un programa simple que pida un número entero positivo por teclado.
    Calcule el factorial del número y muestre el resultado.
    El programa sólo debe admitir números positivos y el cero. El factorial de 0 es 1 por convenio.
    Documenta el programa con comentarios aclaratorios adicionales si se considera necesario.
**/

import java.util.Scanner;

public class Ejercicio18 {
	public static void main (String [] args) {
		Scanner keyboard = new Scanner(System.in);
		int total = 1;
		
		System.out.println("Introduce un numero: ");
		int num = keyboard.nextInt();
		
		if(num < 0) {
			System.err.println("Los numeros negativos no son validos");
			System.err.println("FIN DEL PROGRAMA");
			return;
		}
		if(num == 0) {
			System.out.println("El factorial de 0 es 1.");
			return;
		} else {
			for (int i = 1; i <= num; i++) {
				total = i * num;
				/**if(i < num) {
					operacion += i + " x ";
				} else {
					
				}**/
			}
			System.out.println("El factorial de " + num + " es " + total);
			
		}
	}
}