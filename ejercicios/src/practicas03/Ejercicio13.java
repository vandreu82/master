package practicas03;
import java.util.Scanner;

/**
 * Ejercicio13.java
 * Escribe un programa que calcule las soluciones de una 
 * ecuación de segundo grado de la forma ax2 + bx + c = 0.
 * Víctor Manuel Andreu Felipe
 * 
 */

public class Ejercicio13 {
	static double d;

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("\nIntroduce el valor de a: ");
		double a = teclado.nextDouble();
		
		System.out.print("Introduce el valor de b: ");
		double b = teclado.nextDouble();
		
		System.out.print("Introduce el valor de c: ");
		double c = teclado.nextDouble();

		int evaluacion = evaluarDiscriminante(a, b, c);

		if (evaluacion == 1) {
			System.err.print("ERROR. La ecuación es degenerada");
			teclado.close();
			return;
		}
		if (evaluacion == 2) {
			double r = -c / b;
			System.out.print("La solución es:\n x = " + r);
			teclado.close();
			return;
		}
		if (evaluacion == 3) {
			double x1 = (-(b) - Math.sqrt(d)) / (2 * a);
			double x2 = (-(b) + Math.sqrt(d)) / (2 * a);
			System.out.println("La solución es:\nx1 = " + x1);
			System.out.println("x2 = " + x2);
		}
		if (evaluacion == 4) {
			System.err.print("ERROR. La ecuacion no tiene solucion real");
		}
		teclado.close();
	}

	static int evaluarDiscriminante(double a, double b, double c) {
		d = Math.pow(b, 2) - 4 * a * c;
		int evaluacion = 0;

		if (a == 0 && b == 0) {
			evaluacion = 1;
			return evaluacion;
		} else if (a == 0 && b != 0) {
			evaluacion = 2;
			return evaluacion;
		} else if (d >= 0) {
			evaluacion = 3;
			return evaluacion;
		} else if (d < 0) {
			evaluacion = 4;
			return evaluacion;
		}
		return evaluacion;
	}
}