package Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Labyrinth {
	private boolean encontrado;
	private boolean encontradoaux;
	private char[][] map;
	private String filename;
	private boolean loaded;
	private int startI, startJ, endI, endJ;
	private ArrayList<Coordinate> path = new ArrayList<Coordinate>();
	ArrayList<Coordinate> pathaux = new ArrayList<Coordinate>();

	public Labyrinth() {

		loaded = false;

	}

	public void loadLabyrinth() throws IOException, InterruptedException {
		startI = -1;
		startJ = -1;
		endI = -1;
		endJ = -1;

		File[] files = listDirectory();

		System.out.println("Laberintos\n -------------");
		for (int i = 0; i < files.length; i++) {

			System.out.println(i + 1 + "- " + files[i].getName());

		}

		System.out.println("0- Cancelar\n");
		int option = Interface.getInt("Selecciona opcion:");
		if (option == 0) {

			return;

		}
		if (option < 0 || option > files.length) {
			System.out.println("La opcion introducida no es valida");
			return;

		}

		ArrayList<String> lines = readLabyrinth(files[option - 1].getName());
		int rows = lines.size();
		int cols = lines.get(0).length();
		map = new char[rows][cols];

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = lines.get(i).charAt(j);
			}
		}
		filename = files[option - 1].getName(); // Falta terminar pasos 8 y 9
		loaded = true;
		System.out.println(filename + " se ha cargado correctamente");
		LogEvent.writeLine("Cargar laberinto" + " - " + filename + "\n");
	}

	public File[] listDirectory() throws IOException {

		File[] files = new File[0];
		try {

			files = new File(Config.labyrinthsPath).listFiles();

		} catch (Exception e) {

			System.err.println("No se ha podido acceder al directorio de laberintos");

		}

		return files;

	}

	private ArrayList<String> readLabyrinth(String filename) {
		ArrayList<String> users = new ArrayList<String>();
		try {
			File myObj = new File(Config.labyrinthsPath + filename);
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				users.add(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Ha ocurrido un error.");
			e.printStackTrace();
		}

		return users;
	}

	public void showMap() {

		if (!loaded) {
			LogEvent.writeLine("No se ha cargado laberinto" + " - " + filename + "\n");
			System.err.println("\nDEBE CARGAR ANTES UN LABERINTO");

			return;

		} else if (encontrado) {
			char[][] map2 = new char[map[0].length][map[0].length];
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map.length; j++) {
					map2[i][j] = map[i][j];

					for (int k = 0; k < path.size(); k++) {
						if (i == path.get(k).i && j == path.get(k).j) {
							if (path.get(k).direction == 1) {
								map2[i][j] = '^';
							} else if (path.get(k).direction == 2) {
								map2[i][j] = '<';
							} else if (path.get(k).direction == 3) {
								map2[i][j] = '>';
							} else if (path.get(k).direction == 4) {
								map2[i][j] = 'v';
							}
						}
					}

				}

			}

			for (int i = 0; i < map2.length; i++) {
				System.out.println();
				for (int j = 0; j < map2[i].length; j++) {
					if (startI == i && startJ == j) {
						System.out.print("E ");
					} else if (endI == i && endJ == j) {
						System.out.print("S ");

					} else {
						System.out.print(map2[i][j] + " ");
					}

				}
			}
			LogEvent.writeLine("Mostrar laberinto" + " - " + filename + "\n");
			System.out.println("\nPasos: " + path.size() + "\n");

			for (int i = 0; i < path.size(); i++) {
				System.out.print("(" + path.get(i).i + "," + path.get(i).j + ") ");
				if (path.get(i).direction == 1) {
					System.out.println("Arriba");
				} else if (path.get(i).direction == 2) {
					System.out.println("Izquierda");
				} else if (path.get(i).direction == 3) {
					System.out.println("Derecha");
				} else if (path.get(i).direction == 4) {
					System.out.println("Abajo");
				} else if (i == path.size() - 1) {

					System.out.println("Fin");
				}
			}

		} else {

			for (int i = 0; i < map.length; i++) {
				System.out.println();
				for (int j = 0; j < map[i].length; j++) {
					if (startI == i && startJ == j) {
						System.out.print("E ");
					} else if (endI == i && endJ == j) {
						System.out.print("S ");

					} else {
						System.out.print(map[i][j] + " ");
					}

				}
			}
			LogEvent.writeLine("Mostrar laberinto" + " - " + filename + "\n");

		}
		path.clear();
	}

	public void setEntranceExit() {

		if (loaded == false) {
			System.out.println("Error");
			LogEvent.writeLine("Error al establecer casillas" + " - " + "Debe cargar antes un laberinto" + "\n");
		} else {
			System.out.println("Introduce las coordenadas de entrada: ");
			System.out.println("Entrada 1: ");
			int entradaI = Interface.getInt();
			System.out.println("Entrada 2: ");
			int entradaJ = Interface.getInt();

			if (entradaI < 0 || entradaJ < 0) {
				System.out.println("Error");
				LogEvent.writeLine(
						"Error al establecer casillas" + " - " + "Entrada" + "  " + entradaI + " , " + entradaJ + "\n");
				return;
			}
			if (map[entradaI][entradaJ] == '#') {
				System.out.println("Error");
				LogEvent.writeLine(
						"Error al establecer casillas" + " - " + "Entrada" + "  " + entradaI + " , " + entradaJ + "\n");
				return;
			}
			if (entradaI >= map.length || entradaJ >= map.length) {
				System.out.println("Las coordenadas estan fuera de la matriz");
				LogEvent.writeLine(
						"Error al establecer casillas" + " - " + "Entrada" + "  " + entradaI + " , " + entradaJ + "\n");
				return;

			}

			System.out.println("Introduce las coordenadas de salida: ");
			System.out.println("Salida 1: ");
			int salidaI = Interface.getInt();
			System.out.println("Salida 2: ");
			int salidaJ = Interface.getInt();

			if (entradaJ < 0 || salidaJ < 0) {
				System.out.println("Error");
				LogEvent.writeLine(
						"Error al establecer casillas" + " - " + "Salida" + "  " + entradaJ + " , " + salidaJ + "\n");
				return;

			}
			if (salidaI >= map.length && salidaJ >= map.length) {
				System.out.println("Las coordenadas estan fuera de la matriz");
				LogEvent.writeLine(
						"Error al establecer casillas" + " - " + "Salida" + "  " + salidaI + " , " + salidaJ + "\n");
				return;
			}

			if (map[salidaI][salidaJ] == '#') {
				System.out.println("Error");
				LogEvent.writeLine(
						"Error al establecer casillas" + " - " + "Salida" + "  " + salidaI + " , " + salidaJ + "\n");
				return;
			}

			if (salidaI == entradaI && salidaJ == entradaJ) {
				System.out.println("Error");
				LogEvent.writeLine(
						"Error al establecer casillas" + " - " + "Salida" + "  " + salidaI + " , " + salidaJ + "\n");
				return;
			}

			if (entradaI < map.length && entradaJ < map.length || salidaI < map.length && salidaJ < map.length) {
				System.out.println("Las casillas se han seleccionado correctamente");
				LogEvent.writeLine("Casillas establecidas con exito" + " - " + "Entrada" + "  " + entradaI + " , "
						+ entradaJ + " / " + "Salida" + "  " + salidaI + " , " + salidaJ + "\n");
			} else {
				LogEvent.writeLine("Error al establecer casillas" + " - " + "Entrada" + "  " + entradaI + " , "
						+ entradaJ + " / " + "Salida" + "  " + salidaI + " , " + salidaJ + "\n");
			}
			path.clear();
			endI = salidaI;
			endJ = salidaJ;
			startI = entradaI;
			startJ = entradaJ;

		}

	}

	public void menu4() {
		if (!loaded) {
			System.err.println("\nDebe cargar un laberinto.");
			LogEvent.writeLine("Error al acceder" + " - " + " Debe cargar un laberinto " + "\n");
			return;
		}
		if (startI == endI && startJ == endJ) {
			System.err.println("\nDebe establecer las casillas de entrada y salida");
			LogEvent.writeLine(
					"Error al acceder" + " - " + " Debe establecer las casillas de entrada y salida " + "\n");
			return;
		}
		int option = Interface.getInt(Config.menu4);
		LogEvent.writeLine("Acceso a buscar caminos" + "\n");

		switch (option) {

		case 1:

			if (encontrado = findFistpatch()) {

				System.out.println("\nCamino encontrado");
				showMap();
			} else {
				System.out.println("\nCamino no encontrado...");

			}
			break;

		case 2:

			if (encontrado = findShortpatch()) {
				System.out.println("\nCamino encontrado");
				showMap();
			} else {
				System.out.println("\nCamino no encontrado...");

			}
			break;
		}
	}

	private boolean findFistpatch() {
		boolean found = false;

		path = new ArrayList<Coordinate>();
		Coordinate startCell = new Coordinate();
		startCell.i = startI;
		startCell.j = startJ;
		startCell.direction = 0;

		path.add(startCell); // Primer elemento del path

		while (!found && path.size() > 0) { // Algoritmo
			// Incrementar la direccion del ultimo elemento del path
			path.get(path.size() - 1).direction++;
			if (path.get(path.size() - 1).direction <= 4) {

				Coordinate nextCell = getNextCell(path.get(path.size() - 1));
				if (checkCell(nextCell)) { // COMPROBAR CASILLA VALIDA
					path.add(nextCell);

					if (nextCell.i == endI && nextCell.j == endJ) {
						found = true;
					}
				}

			} else {
				path.remove(path.size() - 1); // borramos el ultimo elemento
			}

		}
		LogEvent.writeLine("Primer camino" + " - " + "Cantidad de pasos:" + " " + path.size() + "\n");
		return found;

	}

	private boolean findShortpatch() {

		boolean found = false;
		path = new ArrayList<Coordinate>();
		pathaux = new ArrayList<Coordinate>();

		Coordinate startCell = new Coordinate();
		startCell.i = startI;
		startCell.j = startJ;
		startCell.direction = 0;

		path.add(startCell); // Primer elemento del path

		while (!path.isEmpty()) { // Algoritmo
			// Incrementar la direccion del ultimo elemento del path
			path.get(path.size() - 1).direction++;
			if (path.get(path.size() - 1).direction <= 4) {

				Coordinate nextCell = getNextCell(path.get(path.size() - 1));
				if (checkCell(nextCell)) { // COMPROBAR CASILLA VALIDA
					path.add(nextCell);

					if (nextCell.i == endI && nextCell.j == endJ) {
						found = true;
						if (pathaux.isEmpty()) {
							for (int k = 0; k < path.size(); k++) {
								Coordinate aux = new Coordinate();
								aux.i = path.get(k).i;
								aux.j = path.get(k).j;
								aux.direction = path.get(k).direction;

								pathaux.add(aux);
							}
						}

						if (pathaux.size() > path.size()) {
							pathaux = new ArrayList<Coordinate>();
							for (int k = 0; k < path.size(); k++) {
								Coordinate aux = new Coordinate();
								aux.i = path.get(k).i;
								aux.j = path.get(k).j;
								aux.direction = path.get(k).direction;

								pathaux.add(aux);
							}
						}
					}
				}
			} else {

				path.remove(path.size() - 1);
			}
		}
		if (!pathaux.isEmpty()) {
			for (int k = 0; k < pathaux.size(); k++) {
				Coordinate aux = new Coordinate();
				aux.i = pathaux.get(k).i;
				aux.j = pathaux.get(k).j;
				aux.direction = pathaux.get(k).direction;

				path.add(aux);
			}
		}
		LogEvent.writeLine("Camino mas corto" + " - " + "Cantidad de pasos:" + " " + path.size() + "\n");

		return found;
	}

	private Coordinate getNextCell(Coordinate currentCoord) {
		Coordinate nextCoord = new Coordinate();
		nextCoord.i = currentCoord.i;
		nextCoord.j = currentCoord.j;
		nextCoord.direction = 0;

		if (currentCoord.direction == 1) { // Es la posicion arriba
			nextCoord.i--;
		} else if (currentCoord.direction == 2) { // Posicion izquierda
			nextCoord.j--;
		} else if (currentCoord.direction == 3) { // derecha
			nextCoord.j++;

		} else if (currentCoord.direction == 4) { // abajo
			nextCoord.i++;
		}

		return nextCoord;

	}

	private boolean checkCell(Coordinate cell) {

		if (map[cell.i][cell.j] == '#') { // COMPROBAR SI ES UNA PARED
			return false;
		}

		for (int i = 0; i < path.size(); i++) {
			if (path.get(i).i == cell.i && path.get(i).j == cell.j) {
				return false;

			}
		}
		return true;
	}

}
