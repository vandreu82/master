package practicas02;
/**Escribe un programa simple que muestre tus iniciales en la pantalla de manera más o menos centrada. 
 * Compón cada inicial sobre una celda en pantalla de 7x7, como en el siguiente ejemplo:
 */

public class Ejercicio09 {
	public static void main(String[] args) {
		
		String iniciales = "";
		
		iniciales += "V      V   M     M\n";
		iniciales += "V      V   MM   MM\n";
		iniciales += " V    V    M M M M\n";
		iniciales += " V   V     M  M  M\n";
		iniciales += "  V V      M     M\n";
		iniciales += "  V V      M     M\n";
		iniciales += "   V       M     M";                                                
		
		System.out.print(iniciales);
	}
}