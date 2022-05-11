package practicas03;
/**
 * Ejercicio01.java
 * Crea un método dentro de la clase principal que se llame mostrarMultiplos1() que se encargue de hacer todo lo hace hace el programa.
 * Consiste en poner todas las instrucciones, anterirmente en main(), dentro del método pedido.
 * Llama al método creado desde main() para que el programa siga haciendo lo mismo.
 * Víctor Manuel Andreu Felipe 
 * 
 */

public class Ejercicio01 {
	public static void main(String argumentos[]) {
		mostrarMultiplos1();
	}

	public static void mostrarMultiplos1() {
		
		final int TOPE = 16;
		int mult;
		int i;

		mult = 0;
		i = 0;

		System.out.println("\t Múltiplos de 2\n");

		while (mult < TOPE) {
			mult = i * 2;
			System.out.println("\t  " + '#' + (i + 1) + '\t' + mult);
			++i;
		}
	}
}