package practicas02;
import java.util.Scanner;

/**
    Escribe un programa simple que pida un número entero y a partir de él cree en pantalla de texto un cuadrado de asteriscos con ese tamaño de lado.
    Los asteriscos sólo se verán en el borde del cuadrado.
    Un ejemplo para 5 sería:

*   *   *   *   *

*               *

*               *

*               *

*   *   *   *   *

    Documenta el programa con comentarios aclaratorios adicionales.
**/
public class Ejercicio17 {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(System.in);
		String dibujo = "";
		System.out.print("Introduce la cantidad de asteriscos de cada: \n");
		int cantidad = keyboard.nextInt();
		
		for(int i = 1; i <= cantidad; i++) {

			for(int j = 1; j <= cantidad; j++) {
				//if (i > 1 && i < cantidad && j >1 && j < cantidad) {
				//Cambiar el orden del dibujo.
				if  (i == 1 || i == cantidad || j == 1 || j == cantidad) {
					dibujo += "* ";
				} else {
					dibujo += "  ";
				}
			}
			
			dibujo += "\n";
			}
		
		
		System.out.println("\n" + dibujo);
	}
}	

