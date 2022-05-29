
/**
 * Main.java
 * Programa principal del sistema para resolver un laberinto
 * DPI - 2021.11.29
 * version 0.1.0
 */

import java.io.IOException;

import Classes.Config;
import Classes.Database;
import Classes.Session;
import Classes.User;
import Classes.Interface;
import Classes.Labyrinth;
import Classes.LogEvent;

public class Main {
	public static Session session = new Session();
	public static Labyrinth laby = new Labyrinth();

	public static void main(String[] args) throws InterruptedException, IOException {

		LogEvent.writeLine("Inicio de programa" + "\n");
		System.out.println(Config.welcome);
		int option = -1;
		do {

			if (!session.isLogged()) {
				option = Interface.getInt(Config.unLoggedMenu);
				unloggedAction(option);
			}
			if (session.isLogged()) {
				option = Interface.getInt(Config.LoggedMenu);
				loggedAction(option);
			}
		} while (option != 0);

		System.out.println(Config.goodbye);
		LogEvent.writeLine("Fin de programa" + "\n");
	}

	// Acciones del menu Sin sesion iniciada
	public static void unloggedAction(int option) throws InterruptedException {
		switch (option) {
		case 1:
			session.login();
			Thread.sleep(Config.miliseconds);
			break;
		case 2:
			session.signup();
			break;
		}

	}

	// Acciones del menu CON sesion iniciada
	public static void loggedAction(int option) throws InterruptedException, IOException {
		switch (option) {
		case 1:
			laby.loadLabyrinth();
			Thread.sleep(Config.miliseconds);
			break;

		case 2:
			laby.showMap();
			;
			Thread.sleep(Config.miliseconds);
			break;

		case 3:
			laby.setEntranceExit();
			Thread.sleep(Config.miliseconds);
			break;

		case 4:
			laby.menu4();
			Thread.sleep(Config.miliseconds);
			break;

		case 5:
			session.showUser();
			Thread.sleep(Config.miliseconds);
			break;

		case 6:
			System.out.println("\nCERRANDO SESION");

			session.logout();

			laby = new Labyrinth();
			Thread.sleep(Config.miliseconds);

			break;

		case 7:
			session.ModifyUsers();
			Thread.sleep(Config.miliseconds);
			break;
			
		case 8:
			session.deleteUsers();
			Thread.sleep(Config.miliseconds);
			break;
		}
	}
}