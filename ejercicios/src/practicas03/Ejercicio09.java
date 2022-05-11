package practicas03;
import java.util.Scanner;

/**
 * Ejercicio09.java
 * Escribe un método que se llame triangulo() que reciba un número entero
 * como parámetro y muestre por pantalla una pirámide de asteriscos.
 * Víctor Manuel Andreu Felipe
 */

public class Ejercicio09 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int num = teclado.nextInt();
		
		triangulo(num);
		
		teclado.close();
	}

	static void triangulo(int num) {
		if (num > 0) {
			for (int i = 0; i < num; i++) {
				System.out.print(" ".repeat(num - i));
				System.out.println("*".repeat(1 + (i * 2)));
			}
		}
	}
}