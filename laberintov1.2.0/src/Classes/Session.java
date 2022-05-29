package Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException; // Import the IOException class to handle errors

public class Session {
	private User user = new User();
	private boolean logged;

	// CONSTRUCTOR DE LA CLASE
	public Session() {
		logged = false;
	}

	public boolean isLogged() {
		return logged;
	}

	public User getUser() {
		return user;
	}

	public void login() {

		System.out.println("\nINICIO DE SESION\n");
		String user = Interface.getString("Usuario: ");
		String password = Interface.getString("Password: ");
		if (user.length() > 0 && password.length() > 0) {
			User currentUser = Database.login(user, password);
			if (currentUser != null) {
				this.logged = true;
				this.user = currentUser;
				System.out.println("\nSesion iniciada con exito");
				LogEvent.writeLine("Sesion iniciada con exito" + " - " + "Usuario:" + " - " + user + "\n");
			}
		}
		if (logged == false) {

			System.out.println("\nUsuario o password incorrectos");
			LogEvent.writeLine("Inicio de sesion incorrecto" + " - " + "Usuario:" + " - " + user + "\n");
		}

	}

	public void signup() {

		String dataUser[] = new String[Config.fields.length];

		dataUser[0] = Interface.getString(Config.fields[0] + ": ");
		if (!utils.validateUsername(dataUser[0])) {
			System.out.println("El usuario no cumple con el formato");
			LogEvent.writeLine("Registro fallido" + " - " + "Usuario" + "\n");

			return;
		} else if (Database.checkUser(dataUser[0])) {
			System.out.println("El nombre de usuario ya existe");
			LogEvent.writeLine("Registro fallido" + " - " + "Usuario ya existe" + "\n");
			return;
		}

		dataUser[1] = Interface.getString(Config.fields[1] + ": ");
		if (!utils.validatePassword(dataUser[1])) {
			System.out.println(
					"La contrasena tiene que tener 8 caracteres, contener una mayuscula, una minuscula , y un caracter especial.");
			LogEvent.writeLine("Registro fallido" + " - " + "Error contrase�a" + "\n");
			return;
		}

		dataUser[2] = Interface.getString(Config.fields[2] + ": ");
		if (!utils.validateName(dataUser[2])) {
			System.out.println("Tienes que poner tu nombre");
			LogEvent.writeLine("Registro fallido" + " - " + "Error nombre" + "\n");
			return;
		}

		dataUser[3] = Interface.getString(Config.fields[3] + ": ");
		if (!utils.validateNif(dataUser[3])) {
			System.out.println("El nif debe de empezar con un numero y tiene que terminar con una letra");
			LogEvent.writeLine("Registro fallido" + " - " + "Error Nif" + "\n");
			return;
		}

		dataUser[4] = Interface.getString(Config.fields[4] + ": ");
		if (!utils.validateEmail(dataUser[4])) {
			System.out.println("El email no cumple con el formato");
			LogEvent.writeLine("Registro fallido" + " - " + "Error email" + "\n");
			return;
		}

		dataUser[5] = Interface.getString(Config.fields[5] + ": ");

		dataUser[6] = Interface.getString(Config.fields[6] + ": ");
		if (!utils.validateDate(dataUser[6])) {
			System.out.println("La fecha no cumple con el formato");
			LogEvent.writeLine("Registro fallido" + " - " + "Error fecha" + "\n");
			return;

		}
		dataUser[0] = user.username;
		dataUser[1] = user.password;
		dataUser[2] = user.fullName;
		dataUser[3] = user.nif;
		dataUser[4] = user.email;
		dataUser[5] = user.address;
		dataUser[6] = user.birthdate;

		boolean access = Database.signup(dataUser);

		if (access) {
			System.out.println("El usuario se ha registrado correctamente");
			LogEvent.writeLine("Registro correcto" + " - " + "Usuario:" + " - " + dataUser[0] + "\n");

			dataUser[0] = user.username;
			dataUser[1] = user.password;
			dataUser[2] = user.fullName;
			dataUser[3] = user.nif;
			dataUser[4] = user.email;
			dataUser[5] = user.address;
			dataUser[6] = user.birthdate;
		} else {
			System.out.println("El usuario no se ha registrado correctamente");
			LogEvent.writeLine("Registro fallido" + " - " + "Usuario:" + " - " + dataUser[0] + "\n");
		}

	}

	public void ModifyUsers() {

		String dataUser[] = new String[Config.fields.length];

		dataUser[0] = user.username; // cambiar username

		dataUser[1] = Interface.getString(Config.fields[1] + ": ");
		if (!utils.validatePassword(dataUser[1])) {
			System.out.println(
					"La contrasena tiene que tener 8 caracteres, contener una mayuscula, una minuscula , y un caracter especial.");
			LogEvent.writeLine("Modificacion de password fallida" + " - " + "\n");
			return;

		}
		dataUser[2] = Interface.getString(Config.fields[2] + ": ");
		if (!utils.validateName(dataUser[2])) {
			System.out.println("Tienes que poner tu nombre");
			LogEvent.writeLine("Modificacion del nombre fallida" + " - " + "Error nombre" + "\n");
			return;
		}
		dataUser[3] = Interface.getString(Config.fields[3] + ": ");
		if (!utils.validateNif(dataUser[3])) {
			System.out.println("El nif debe de empezar con un numero y tiene que terminar con una letra");
			LogEvent.writeLine("Modificacion del dni fallida" + " - " + "Error Nif" + "\n");
			return;

		} else if (Database.checkNif(dataUser[3])) {
			System.out.println("El nif introducido esta registrado");
			return;

		}

		dataUser[4] = Interface.getString(Config.fields[4] + ": ");
		if (!utils.validateEmail(dataUser[4])) {
			System.out.println("El email no cumple con el formato");
			LogEvent.writeLine("Registro fallido" + " - " + "Error email" + "\n");
			return;
		} else if (Database.checkEmail(dataUser[4])) {
			System.out.println("Elemail introducido esta registrado");
			return;
		}
		dataUser[0] = user.username;
		dataUser[1] = user.password;
		dataUser[2] = user.fullName;
		dataUser[3] = user.nif;
		dataUser[4] = user.email;
		dataUser[5] = user.address;
		dataUser[6] = user.birthdate;

		boolean correctUpdate = Database.ModifyUsers(dataUser, user.id);

		if (correctUpdate) {
			System.out.println("El usuario se ha actualido correctamente");

			LogEvent.writeLine("Registro correcto" + " - " + "Usuario:" + " - " + dataUser[0] + "\n");

		} else {
			System.out.println("El usuario no se ha actualizado correctamente");
			LogEvent.writeLine("Registro fallido" + " - " + "Usuario:" + " - " + dataUser[0] + "\n");

		}

	}

	public void deleteUsers() {

		String password = Interface.getString(Config.fields[1] + ": ");

		if (password.length() > 0) {
			User currentUser = Database.login(user.username, password);
			if (currentUser != null) {
				Database.deleteUser(user.id);
				System.out.println("El usuario ha sido eliminado");
				logout();

			} else {
				System.out.println("La contrase�a no coincide");

			}
		}
	}

	private ArrayList<String> readAllUsers() {// METODO QUE LEE FICHERO DE USUARIOS
		ArrayList<String> users = new ArrayList<String>();
		try {
			File myObj = new File(Config.filePath + Config.usersFile);
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

	// Metodo escribir usuario
	private boolean writeUser(String newUser) {
		boolean success = false;

		try {
			FileWriter myWriter = new FileWriter(Config.filePath + Config.usersFile, true);
			myWriter.write(newUser);
			myWriter.close();
			success = true;
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		return success;
	}

	// Establecer datos de usuario
	private void setUser(String[] currentUser) {
		user.username = currentUser[0];
		user.fullName = currentUser[2];
		user.nif = currentUser[3];
		user.nif = currentUser[4];
		user.email = currentUser[5];
		user.address = currentUser[6];
		user.birthdate = currentUser[7];
		user.role = currentUser[8];
	}

	public void showUser() { // Metodo mostrar usuario con sesion iniciada

		System.out.println("\nUsuario actual\n---------------------");
		System.out.println("Nombre de usuario: " + user.username);
		System.out.println("Nombre: " + user.fullName);
		System.out.println("NIF: " + user.nif);
		System.out.println("Email: " + user.email);
		System.out.println("Direccion: " + user.address);
		System.out.println("Fecha de nacimiento: " + user.birthdate);
		System.out.println("Rol: " + user.role);

		LogEvent.writeLine("Mostrar Usuario actual:" + " - " + "Nombre usuario:" + " - " + user.username + " - "
				+ " Id:" + " " + user.id + "\n");

		Interface.toContinue();

	}

	public void logout() {
		LogEvent.writeLine("Cerrando sesion" + " - " + "Nombre usuario:" + " - " + user.username + "\n");
		logged = false;
		user = new User();

	}

}
