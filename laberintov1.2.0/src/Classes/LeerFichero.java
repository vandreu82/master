package Classes;

	import java.io.File;  // Import the File class
	import java.io.FileNotFoundException;  // Import this class to handle errors
	import java.util.Scanner; // Import the Scanner class to read text files

	public class LeerFichero {
	  public static void main(String[] args) {
	    try {
	      File myObj = new File("\"/T.Javamolina/git/Practicas/Practicas/practica 4/laberinto1/assets/files\";");
	      Scanner myReader = new Scanner(myObj);
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        System.out.println(data);
	      }
	      myReader.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	  }
	}


