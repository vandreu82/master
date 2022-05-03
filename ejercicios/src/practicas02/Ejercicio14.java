package practicas02;
import java.util.Scanner;

/** 
    Escribe un programa simple que lea tantos números enteros positivos como se quiera mientras no sea un cero, que terminaría. 
    Cuando termina la entrada, se muestra, como resultado, la suma de todos los números leídos y su media aritmética.
    No hay que guardar los valores individualmente introducidos.
    Documenta el programa con comentarios aclaratorios adicionales si se considera necesario.
**/
public class Ejercicio14	{
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num = 100;
		int suma = 0;
		int contador = 0;
		
	while (num != 0) {
		System.out.println("Introduce un número: ");
		num = teclado.nextInt();
		if (num<0) {
			System.out.println("Los números negativos no son válidos.");
		} else {
		suma += num;
		contador++;
		}
	}
	System.out.println("La suma de todos los números es : " + suma);
	System.out.println("La media aritmética de todos los números es : " + (suma / contador));
	}
}