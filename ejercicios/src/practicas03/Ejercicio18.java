package practicas03;
import java.util.Scanner;

/**
 * Ejercicio18.java
 * Escribe un método que se llame triangulo() que reciba un número entero
 * como parámetro y muestre por pantalla una pirámide de asteriscos.
 * Víctor Manuel Andreu Felipe
 *
 */

public class Ejercicio18 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce el lado a del triangulo");
		double a = teclado.nextDouble();
		
		System.out.println("Introduce el lado b del triangulo");
		double b = teclado.nextDouble();
		
		System.out.println("Introduce el lado c del triangulo");
		double c = teclado.nextDouble();

		System.out.println(tipoTriangulo(a, b, c));
		teclado.close();
	}

	public static String tipoTriangulo(double a, double b, double c) {
		if (!esTriangulo(a, b, c)) {
			return "Error";
		}
		
		if (a == b && a == c) {

			return "Equilatero";
		} else if (a == b || a == c || b == c) {

			return "Isósceles";
		} else {

			return "Escaleno";
		}
	}

	public static boolean esTriangulo(double a, double b, double c) {
		if (a + b < c || a + c < b || b + c < a) {
			return false;
		}
		return true;
	}

}