package practicas02;
import java.util.Scanner;

/**
 * Ejercicio19.java
 * Escribe un método llamado contarCaracteresPalabrasLineas() que reciba un texto como parámetro 
 * y devuelva como resultado un código que codifique, de alguna manera, la siguiente información:
 * Víctor Manuel Andreu Felipe
 *
 */

public class Ejercicio19 {
	static Scanner teclado = new Scanner(System.in);
	static String texto = "";

	public static void main(String[] args) {

		System.out.print("Introduce un texto: ");
		texto = teclado.nextLine();

		System.out.println("1 Número de caracteres");
		System.out.println("2 Número de palabras");
		System.out.println("3 Número de líneas");
		System.out.print("\nTeclea una opcion: ");

		int eleccion = teclado.nextInt();

		interpretarCodigo(contarCaracteresPalabrasLineas(texto), eleccion);
	}

	static String contarCaracteresPalabrasLineas(String texto) {
		String[] palabras = texto.split("[, ?.@\t\n]+");
		int contadorPalabras = 0;
		int contadorCaracteres = 0;
		int contadorLineas = 0;
		for (int j = 0; j < palabras.length; j++) {
			if (palabras[j].length() > 0) {
				contadorPalabras = (palabras.length);
				contadorCaracteres = texto.length();
			}
		}

		for (int j = 0; j < texto.length(); j++) {
			if (texto.charAt(j) == '\n') {
				contadorLineas++;
			}
		}

		return contadorCaracteres + "-" + contadorPalabras + "-" + contadorLineas;
	}

	static void interpretarCodigo(String codigoCifrado, int eleccion) {
		String[] codigoDescifrado = codigoCifrado.split("-");
		switch (eleccion) {
		case 1:
			System.out.println("Total de caracteres: " + codigoDescifrado[0]);
			break;
		case 2:
			System.out.println("Total de palabras: " + codigoDescifrado[1]);
			break;
		case 3:
			System.out.println("Total de lineas: " + codigoDescifrado[2]);
			break;
		}
	}
}