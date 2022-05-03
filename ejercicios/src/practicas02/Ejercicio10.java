package practicas02;

import java.util.Scanner;

/** 
    Escribe un programa simple que pida tres datos de tipo entero por teclado, los guarde y los muestre ordenados por pantalla.
    Documenta el programa con comentarios aclaratorios adicionales si se considera necesario.
**/
public class Ejercicio10 {
	public static void main (String []args) {
		Scanner teclado = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		
		System.out.println("Introduce el primer numero");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo numero");
		num2 = teclado.nextInt();
		System.out.println("Introduce el tercer numero");
		num3 = teclado.nextInt();
		
		int aux;
		
		if (num1 > num2) {
			aux = num1;
			num1 = num2;
			num2 = aux;
		}
		
		if (num2 > num3) {
			aux = num2;
			num2 = num3;
			num3 = aux;
		}
		
		if(num2 < num1) {
			aux = num2;
			num2 = num1;
			num1 = aux;
		}
		
		System.out.println("Los numeros introducidos ordenados son: " + num1 + ", " + num2 + " y " + num3);
	}
}