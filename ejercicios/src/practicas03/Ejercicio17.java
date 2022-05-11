package practicas03;
import java.util.Scanner;

/**
 * Ejercicio17.java
 * Escribe un método llamado muestraCuadrado() que muestra un cuadrado en modo texto.
 *
 */

public class Ejercicio17 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce un número");
		int longitudCuadrado = Integer.parseInt(teclado.nextLine());

		System.out.println("Introduce el carácter con el que quieres dibujar el contorno");
		String caracterContorno = teclado.nextLine() + " ";

		String cuadrado = muestraCuadrado(caracterContorno, longitudCuadrado);

		System.out.println(cuadrado);

		teclado.close();
	}

	private static String muestraCuadrado(String caracterContorno, int longitud) {
		String cuadrado = "";

		for (int i = 0; i < longitud; i++) {
			cuadrado += caracterContorno;
		}
		cuadrado += "\n";

		for (int j = 0; j < longitud - 2; j++) {
			cuadrado += caracterContorno;

			for (int h = 0; h < longitud - caracterContorno.length(); h++) {
				cuadrado += "  ";
			}
			cuadrado += caracterContorno + "\n";
		}

		if (longitud != 1) {
			for (int k = 0; k < longitud; k++) {
				cuadrado += caracterContorno;
			}
		}

		return cuadrado;
	}

}