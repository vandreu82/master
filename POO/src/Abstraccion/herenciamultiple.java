package Abstraccion;

public class HerenciaMultiple {
	public static void main(String [] args) {
		// Codigo a ejecutar
		Frankenstein monstruo = new Frankenstein();
		monstruo.sonidoAnimal();
		monstruo.dormir();
	}
}

class Frankestein extends Animal implements Persona {
	public void sonidoAnimal() {
		System.out.println("Uuuuurrggh uuuuuurgh");

	}
}