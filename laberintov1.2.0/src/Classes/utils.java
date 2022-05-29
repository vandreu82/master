package Classes;

import java.math.BigInteger;
import java.security.MessageDigest;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

public class utils {

	public static void main(String[] args) {

		System.out.println(validateDate("32/3/90"));
	}

	private static String regexname = ("^([a-zA-Z]{2,})( ([a-zA-Z]{2,}))*$");
	private static String regexUserName = ("^[A-Za-z]+((\\s)?((\\'|\\-|\\.)?([A-Za-z])+))*$");
	private static String regexpassword = ("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");
	private static String regexemail = ("^[\\w-\\+]+(\\.[\\w-\\+]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
	private static String regexDni = ("[0-9]{7,8}[A-Z a-z]");
	private static String regexFecha = ("^[0-9]{1,2}/[0-9]{1,2}/[0-9]{1,4}$");
	static DateTimeFormatter formatoSql = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	static DateTimeFormatter formatoEu = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	static String Date = ("dd/MM/yyyy");

	public static boolean validateUsername(String user) {

		return user.matches(regexUserName);

	}

	public static boolean validatePassword(String password) {

		return password.matches(regexpassword);

	}

	public static boolean validateName(String nombre) {
		return nombre.matches(regexname);

	}

	public static boolean validateEmail(String email) {

		return email.matches(regexemail);

	}

	public static boolean validateNif(String Dni) {

		return Dni.matches(regexDni);
	}

	public static boolean validateDate(String fecha) {

		return fecha.matches(regexFecha);

		/*
		 * TODO COMPROBAR FECHA SI ES VALIDA POR
		 * 
		 * 
		 * MESES DE 31 DIAS MESES DE 30 DIAS CASO DE FEBRERO**
		 * 
		 */

	}

	public static String encryptMd5(String password) {

		MessageDigest md;
		try {

			md = MessageDigest.getInstance("MD5");

			md.update(password.getBytes());

			String pwd = new BigInteger(1, md.digest()).toString(16);
			return pwd;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return password;

	}

	public static String formatDateEU(String DateSql) {

		LocalDate fecha = LocalDate.parse(DateSql, formatoSql);
		return fecha.format(formatoEu);

	}

	public static String formatDateSQL(String DateEu) {

		LocalDate fecha = LocalDate.parse(DateEu, formatoEu);
		return fecha.format(formatoSql);

	}

	public static int getAge(String Date) {

		return 0;

	}

}
