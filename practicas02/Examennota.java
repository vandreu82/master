import java.util.Scanner;

/* Escribe un programa que pida por teclado un número con decimales que corresponda a una nota académica.
* El programa tiene que comprobar la nota y mostrar por pantalla si es:
*	
* INSUFICIENTE
* SUFICIENTE
* BIEN
* NOTABLE
* SOBRESALIENTE
*/
public class Examennota{
	public static void main(String [] args) {
		Scanner teclado = new Scanner(System.in);
		double nota;		
		String resultado = "Nota no válida";
		
		System.out.println("Introduce la nota");
		nota = teclado.nextDouble();
		
		if (nota >= 0 && nota < 5) {
			resultado = "La nota es: Insuficiente";
	
		} else if (nota >= 5 && nota < 6) {
			resultado = "La nota es: Suficiente";
			
		} else if (nota >= 6 && nota < 7) {
			resultado = "La nota es: Bien";
			
		} else if (nota >= 7 && nota < 9) {
			resultado = "La nota es: Notable";
			
		} else if (nota >= 9 && nota < 10) {
			resultado = "La nota es: Sobresaliente";
		}
		System.out.println(resultado);
		
	}
}