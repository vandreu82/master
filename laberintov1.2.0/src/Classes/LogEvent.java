package Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class LogEvent {

	// Metodo escribir usuario
	public static boolean writeLine(String newLine) {
		boolean success = false;

		try {
			FileWriter myWriter = new FileWriter(Config.filePath + Config.log, true);

			myWriter.write(getDateTime() + " - " + newLine);
			myWriter.close();
			success = true;
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		return success;
	}

	private static String getDateTime() {
		DateTimeFormatter fechaLog = DateTimeFormatter.ofPattern("yyyy/MM/dd  HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		return fechaLog.format(now);

	}

}
