import java.util.Scanner;

public class nombre1 {
	public static void main(String[] args) {	
		Scanner teclado = new Scanner(System.in);
		String nombre1, nombre2;
		int edad1, edad2;
		System.out.println("Introduce el nombre");
		nombre1 = teclado.next();
		System.out.println("Introduce la edad");
		edad1 = teclado.nextInt();
		System.out.println("Introduce el nombre");
		nombre2 = teclado.next();
		System.out.println("Introduce la edad");
		edad2 = teclado.nextInt();
		System.out.println(nombre1 + " tiene " + edad1);
		System.out.print(nombre2 + " tiene " + edad2);
	}
}