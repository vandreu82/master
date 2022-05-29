package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {

	// private String passwordDB = "12345";

	public static User login(String User, String password) {

		password = utils.encryptMd5(password);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/labyrinth", "root", "12345");
			Statement stmt = conn.createStatement();

			ResultSet rs = stmt
					.executeQuery("select * from users where username='" + User + "' and password='" + password + "'");
			while (rs.next()) {

				int idUser = rs.getInt("id");
				String usernameUser = rs.getString("username");
				String nameUser = rs.getString("name");
				String birthdateUser = rs.getString("birthdate");

				User userlogin = new User(idUser, usernameUser, nameUser, rs.getString("nif"), rs.getString("email"),
						rs.getString("address"), utils.formatDateEU(birthdateUser), rs.getString("role"),
						rs.getString("password"));

				return userlogin;

			}
			rs.close();
			conn.close();
			stmt.close();
		} catch (Exception e) {
			System.err.println("Error: " + e);
		}
		return null;
	}

	public static boolean checkUser(String username) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/labyrinth", "root", "12345");
			Statement stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery("select * from users where username='" + username + "'");

			while (rs.next()) {
				return true;
			}

			rs.close();
			conn.close();
			stmt.close();
		} catch (Exception e) {
			System.err.println("Error: " + e);
		}
		return false;
	}
	public static boolean checkNif(String nif) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/labyrinth", "root", "12345");
			Statement stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery("select * from users where nif='" + nif + "'");

			while (rs.next()) {
				return true;
			}

			rs.close();
			conn.close();
			stmt.close();
		} catch (Exception e) {
			System.err.println("Error: " + e);
		}
		return false;
	}
	
	public static boolean checkEmail(String email) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/labyrinth", "root", "12345");
			Statement stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery("select * from users where email='" + email + "'");

			while (rs.next()) {
				return true;
			}

			rs.close();
			conn.close();
			stmt.close();
		} catch (Exception e) {
			System.err.println("Error: " + e);
		}
		return false;
	}

	public static boolean signup(String[] dataUser) {

		String plantilla = "INSERT INTO users (username, password, name, nif, email, address, birthdate, role) "
				+ "VALUES ('<<username>>', '<<password>>', '<<name>>', '<<nif>>', '<<email>>', '<<address>>', '<<birthdate>>', '<<role>>');";

		String insert = plantilla.replaceAll("<<username>>", dataUser[0])
				.replaceAll("<<password>>", utils.encryptMd5(dataUser[1])).replaceAll("<<name>>", dataUser[2])
				.replaceAll("<<nif>>", dataUser[3]).replaceAll("<<email>>", dataUser[4])
				.replaceAll("<<address>>", dataUser[5]).replaceAll("<<birthdate>>", utils.formatDateSQL(dataUser[6]))
				.replaceAll("<<role>>", "User");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/labyrinth", "root", "12345");
			Statement stmt = conn.createStatement();

			stmt.executeUpdate(insert);

			stmt.close();
			conn.close();
			return true;
		} catch (Exception e) {
			System.err.println("Error: " + e);
			return false;
		}
	}

	public static boolean ModifyUsers(String[] dataUser, int id) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/labyrinth", "root", "12345");
			Statement stmt = conn.createStatement();

			String query = "UPDATE users SET name = '" + (dataUser[2]) + 
					"'," + "password = '" + utils.encryptMd5(dataUser[1]) + 
					"', " + "nif = '" + (dataUser[3]) + "', " 
					+ "email = '" + (dataUser[4]) + "' " + "where id = " + (id) + ";";

		

			stmt.executeUpdate(query);
			conn.close();
			stmt.close();
			return true;
		} catch (Exception e) {
			System.err.println("Error: " + e);
			return false;
		}

	}

	public static void deleteUser(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/labyrinth", "root", "12345");
			Statement stmt = conn.createStatement();

			String query = "delete from users where id = " + (id) + ";";

		

			stmt.executeUpdate(query);
			conn.close();
			stmt.close();
			
		} catch (Exception e) {
			System.err.println("Error: " + e);
			
		}

	}
}