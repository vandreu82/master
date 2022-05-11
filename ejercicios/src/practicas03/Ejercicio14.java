package practicas03;
import java.util.Scanner;

/**
 * Ejercicio14.java
 * Escribe un método que se llame rombo2() que 
 * reciba un número entero como parámetro y devuelva una cadena de caracteres
 * con el texto formateado de un rombo de asteríscos.
 * Víctor Manuel Andreu Felipe
 *
 */

public class Ejercicio14 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un número impar: ");
		int num = teclado.nextInt();

		if (num % 2 != 0) {
			System.out.print(rombo2(num));
		} else {
			System.err.print("Solo se admiten números impares");
		}
		teclado.close();
	}
	static String rombo2(int num) {
		String parteAlta = "";
		String parteBaja = "";
		for (int i = 0; i < num / 2; i++) {
			parteAlta += (" ".repeat(num - i) + "*".repeat(1 + (i * 2)) + "\n");
		}
		for(int i = (num / 2); i >= 0; i--) {
			parteBaja += (" ".repeat(num - i) + "*".repeat(1 + (i * 2)) + "\n");
		}
		return parteAlta + parteBaja;
	}
}