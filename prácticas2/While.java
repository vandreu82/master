/* BUCLE WHILE */

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num = 0;
		
		while (num <= 10) {
			System.out.print("Introduce número");
			num = teclado.nextInt();
		}
	}
}