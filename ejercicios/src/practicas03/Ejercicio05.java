package practicas03;
import java.util.Scanner;

/**
 * Ejercicio05.java
 * Escribe un programa para calcular los salarios semanales de empleados 
 * a los que se les paga 15 euros por hora hasta el limite de las 35 horas. 
 * Cada hora por encima de 35 se considerará extra y se paga a 22 €.
 * Víctor Manuel Andreu Felipe
 * 
 */

public class Ejercicio05 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String res = "";

		do {
			System.out.println("¿Cuantas horas trabaja esta persona?");
			double horas = Double.parseDouble(teclado.nextLine());
			double salario = calcularSalario(horas);
			System.out.println("Su salario semanal es de " + salario + " €");

			System.out.println("¿Desea volver a ralizar la operacion? S/n");
			res = teclado.nextLine();
		} while (res.toUpperCase().equals("S"));

		teclado.close();
	}
	
	public static double calcularSalario(double horas) {

		double salario;
		if (horas <= 35) {
			salario = horas * 15;
		} else {
			salario = 35 * 15 + (horas - 35) * 22;
		}
		return salario;
	}

}