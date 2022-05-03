package practicas02;

import java.util.Scanner;

public class Ejercicio11 {
	 public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
		 
		 int anos;
		 double capi;
		 double capf;
		 double temp;
		 double tipo;
		 /*double r;*/
		 
		System.out.println("¿Cuanta pasta tienes?");
			capi = teclado.nextDouble();
		System.out.println("¿Que miseria de interés anual te proporciona tu inversión?");
			tipo = teclado.nextDouble()/100;
			/*r = tipo/100;*/
		System.out.println("¿Cuantos años de tu vida vas a perder en esto?");
			anos = teclado.nextInt();
			
		temp = 1 + tipo;
		capf = capi * Math.pow(temp, anos); 
		
		System.out.println("En todo este tiempo has ganado la ridícula cantidad de: "+ (capf - capi));
		System.out.println("Tu escaso capital final es de: "+ capf);
	 }
}