package Classes;

public class Config{
public static final String version = "v1.2.0";	
public static final String filePath = "./assets/files/";
public static final String usersFile="/users.txt";
public static final String log="/Syslog.txt";
public static final String labyrinthsPath= "./assets/labyrinths/";
public static final int miliseconds = 2000;

public static final String welcome = "MI LABERINTO(" +version +") \nEsto es un programa que muestra un laberinto.";

public static final String unLoggedMenu = "\n\n\tMENU\n"+
										"--------------------\n"+
										"1 Iniciar sesion\n"+
										"2 Registro\n"+
										"0 Salir\n"+
										"Elige una opcion: ";

public static final String LoggedMenu ="\n\n\tMENU\n"+
										"1 Cargar laberinto\n"+
										"2 Ver laberinto actual\n"+
										"3 Establecer casillas de entrada y salida\n"+
										"4 Buscar caminos\n"+
										"5 Ver usuario actual\n"+
										"6 Cerrar sesion\n"+
										"7 Modificar Usurario\n"+
										"8 Eliminar Usuario\n"+
										"0 Salir\n\n"+
										"Elige una opcion: ";

public static final String menu4= "\n\n\tSelecciona un camino\n"+
								"-----------------------------------\n"+
								"1 El primer camino posible\n"+
								"2 El camino mas corto\n"+
								"0 Cancelar";

								
		
public static final String goodbye = "FIN DEL PROGRAMA";

public static final String[] fields = {"Nombre de usuario","Password","Nombre completo","DNI/NIF","Email","Direccion","Fecha de nacimiento"};

}

