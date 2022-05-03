package autoevaluacion01;
/**
 * 
 * 
 */

import java.util.Scanner;

public class autoevaluacion1 {
    public static void main(String argumentos[]) {     
        Scanner teclado = new Scanner(System.in);
		//teclado es un canal de entrada por teclado a través de un Scanner.
    	//  Necesita importar el paquete java.util
        int num;             
		//Declara una variable numérica que después se mostrará en pantalla.    adssaddsaasdsdaasd
        
        num = 1;
		// Fija la variable num en 1
        System.out.println("Hola, Soy un modesto ");
        System.out.print("programa de ordenador...\n");
        System.out.println("Mi número de orden es el " + num + " por ser el primero.");
        // Saluda al usuario y muestra la variable num, que según el código siempre será 1.
        System.out.println("Escribe dos números...\n");
        int dato1 = teclado.nextInt();
        int dato2 = teclado.nextInt();
        // Entrada de datos
        System.out.println("Dato1: " + dato1);
        System.out.println("Dato2: " + dato2);
        // Muestra al usuario los datos introducidos
        String mensaje = "";
        if (dato1 == dato2) {
            mensaje = "Ninguno de los dos es mayor... ";
        }
        if (dato1 > dato2) {
            mensaje = "El mayor es: " + dato1;
        }
        if (dato2 > dato1) {
            mensaje = "El mayor es: " + dato2;
		// Compara ambos datos y muestra en pantalla si son iguales y cual de los dos es el mayor.
        }
        System.out.println(mensaje);
    }
}