package practicas03;
/**
 * Ejercicio11.java
 * Escribe un método que se llame banner() que muestra tus iniciales en la pantalla.
 * Víctor Manunel Andreu Felipe
 */

public class Ejercicio11 {
    public static void main(String[] args) {
        System.out.print(banner());
    }

    static String banner() {

        String inicial = "";
        		//	*******  *******  *******
        inicial += "V     V  M     M    AAA  \n";
        inicial += "V     V  MM   MM   A   A \n";
        inicial += " V   V   MMMMMMM  A     A\n";
        inicial += " V   V   M MMM M  A     A\n";
        inicial += " V   V   M  M  M  AAAAAAA\n";
        inicial += "  V V    M     M  A     A\n";
        inicial += "   V     M     M  A     A";

        return inicial;
    }
}