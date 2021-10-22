import java.util.Scanner;

/**
    Escribe un programa simple que, en un bucle continuo, pida un número con varios decimales, los que quiera el usuario.
    Después pregunta a cuantos decimales se quiere redondear.
    Seguidamente muestra el resultado redondeado, teniendo en cuenta que no hay que cortar, hay que redondear.
    Debe haber algún medio de terminar el bucle continuo de entrada de datos.
    Puede resolverse utilizando el método Math.rint(…) que redondea al entero mayor o igual que corresponde al número double recibido como argumento.
    Un ejemplo sería:

Número leído: 23.23456

Decimales: 3

Valor mostrado: 23.235  

Calculado con algo parecido a: Math.rint(23.23456*1000)/1000

Observa que 1000 es 103. Se pide que se calcule con un bucle.

    Documenta el programa con comentarios aclaratorios adicionales si se considera necesario.

	**/ 

public class Ejercicio16 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double numDecimales;
		int decimales = 0;
		double multi;
		double redondeado;
		String seguir = "s";
		
		while (seguir.trim().equalsIgnoreCase("S")) {
			System.out.println("Introduce un número decimal : ");
			numDecimales = teclado.nextDouble();
			teclado.nextLine();
			
			System.out.println("Número de decimales a redondear: ");
			decimales = teclado.nextInt();
			teclado.nextLine();
			
			multi = Math.pow(10, decimales);
			redondeado = Math.rint( numDecimales * multi ) / multi;
			System.out.println("El número redondeado es : "+ redondeado);
			System.out.println("¿Desea continuar? (s)");
			seguir = teclado.nextLine();
		}
		
	}
}