package practicas01;
/**
 * 

Saludos.java
 * Programa simple que muestra varios mensajes en la consola del sistema.
 *  vmaf - 08/10/2020
 */

import java.util.Scanner; // Importa el paquete java.util

public class Saludos {
	public static void main(String[] args) {
		/* teclado es un canal de entrada por teclado a traves de un Scanner.
		   Necesita importar el paquete java.util
		 */
		Scanner teclado = new Scanner(System.in);

		int numOrden;			// declara una variable numérica de tipo entero
		String nombre = "";		// Cadena de caracteres

		// Configura y muestra mensajes de bienvenida.
		numOrden = 1 ;//Almacena en memora el valor 1 para la variable num0rden
		System.out.println("Hola,");//Saca por pantalla una línea
		System.out.print("Soy un modesto ");//Saca por pantalla un texto, sin cambiar de línea
		System.out.print("programa de ordenador...\n");//Continua la línea anterior y cambia de línea
		System.out.println("Bienvenido al Curso.\t" + "Este es el saludo nÂº " + numOrden);//Saca por pantalla una lína espaciada con un tabulado a mitad de la misma
		numOrden++;//incrementa en 1 el valor de num0rden 
		System.out.println("Bienvenido a Java.\t" + "Este es el saludo nÂº " + numOrden);//Saca por pantalla el contenido de num0rden
		System.out.println("\nFin programa..."); //Cambia de línea para dejar un espacio vertical y sacar el mensaje de fin del programa en pantalla.
	}
}