package practicas02;
/**

    Escribe un programa simple que escriba todos los múltiplos de 3 comprendidos entre 1 y 3000.
    Opcionalmente, haz variantes en el mismo programa, resolviendolo con diferentes tipos de bucles; incluso utilizando break y continue. 
    Documenta el programa con comentarios aclaratorios adicionales.
**/
public class Ejercicio15 {
	public static void main (String [] args) {
		int acu = 1;
		while (acu <= 1000) {
			System.out.println("3x " + acu + " = " + (3*acu));
			acu++;
		}
		
		/*for(int acu = 1; acu <= 1000;acu++) {
			System.out.println("3x " + acu + " = " + (3*acu));
		}*/
	}
}