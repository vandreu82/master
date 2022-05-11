package practicas02;
import java.util.Scanner;

/**
 * Ejercicio12.java
 * Escribe un método que se llame trianguloTexto() que reciba un número entero como parámetro y
 * devuelva una cadena de caracteres con el texto formateado de una pirámide de asteriscos.
 * Víctor Manuel Andreu Felipe
 * 
 */

public class Ejercicio12 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int num = teclado.nextInt();

		System.out.print(trianguloTexto(num));

		teclado.close();
	}

	static String trianguloTexto(int num) {
		String piramide = "";
		if (num > 0) {
			for (int i = 0; i < num; i++) {
				piramide += (" ".repeat(num - i) + "*".repeat(1 + (i * 2)) + "\n");
			}
		}
		return piramide;
	}
}