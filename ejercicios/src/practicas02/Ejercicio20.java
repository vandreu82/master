package practicas02;
import java.util.Scanner;

/**
 * Ejercicio20.java
 * Escribe un método que se llame bannerLetra() que recibe un carácter 
 * como parámetro y devuelve una cadena de caracteres con el texto, 
 * formateado sobre una matriz de 7x7, de la letra correspondiente al carácter recibido.
 * Víctor Manunel Andreu
 *
 */

public class Ejercicio20 {
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Introduce una o varias letras: ");
		String texto = teclado.nextLine().toUpperCase().trim();
		String banner = "";
		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) != ' ') {
				banner += bannerLetra(texto.charAt(i)) + "\n";
			}
		}
		System.out.print(banner);
		teclado.close();
	}
	static String bannerLetra(char letra) {
		return letras[letra - 'A'];
	}
	static String[] letras = {
		"   A   \n" +
		"  AAA  \n" +
		" AA AA \n" +
		"AA   AA\n" +
		"AAAAAAA\n" +
		"AA   AA\n" +
		"AA   AA\n",
		
		"BBBBBB \n" +
		"BB   BB\n" +
		"BB   BB\n" +
		"BBBBB  \n" +
		"BB   BB\n" +
		"BB   BB\n" +
		"BBBBBB \n" ,
		
		" CCCCCC\n" +
		"CC     \n" +
		"CC     \n" +
		"CC     \n" +
		"CC     \n" +
		"CC     \n" +
		" CCCCCC\n" ,
		
		"DDDDDD \n" +
		"DD   DD\n" +
		"DD   DD\n" +
		"DD   DD\n" +
		"DD   DD\n" +
		"DD   DD\n" +
		"DDDDDD \n" ,

		"EEEEEEE\n" +
		"EE     \n" +
		"EE     \n" +
		"EEEEEEE\n" +
		"EE     \n" +
		"EE     \n" +
		"EEEEEEE\n" ,
		
		"FFFFFFF\n" +
		"FF     \n" +
		"FF     \n" +
		"FFFFFFF\n" +
		"FF     \n" +
		"FF     \n" +
		"FF     \n" ,
		
		" GGGGGG\n" +
		"GG     \n" +
		"GG     \n" +
		"GG  GGG\n" +
		"GG   GG\n" +
		"GG   GG\n" +
		" GGGGG \n" ,
		
		"HH   HH\n" +
		"HH   HH\n" +
		"HH   HH\n" +
		"HHHHHHH\n" +
		"HH   HH\n" +
		"HH   HH\n" +
		"HH   HH\n" ,

		"IIIIIII\n" +
		"  III   \n" +
		"  III  \n" +
		"  III  \n" +
		"  III  \n" +
		"  III  \n" +
		"IIIIIII\n" ,
		
		"     JJ\n" +
		"     JJ\n" +
		"     JJ\n" +
		"     JJ\n" +
		"     JJ\n" +
		"JJ   JJ\n" +
		" JJJJJ \n" ,
		
		"KK   KK\n" +
		"KK  KK \n" +
		"KK KK  \n" +
		"KKK    \n" +
		"KK KK  \n" +
		"KK  KK \n" +
		"KK   KK\n" ,
		
		"LL     \n" +
		"LL     \n" +
		"LL     \n" +
		"LL     \n" +
		"LL     \n" +
		"LL     \n" +
		"LLLLLLL\n" ,
		
		"MM   MM\n" +
		"MMM MMM\n" +
		"MMMMMMM\n" +
		"MM M MM\n" +
		"MM   MM\n" +
		"MM   MM\n" +
		"MM   MM\n" ,
		
		"NN   NN\n" +
		"NNN  NN\n" +
		"NNNN NN\n" +
		"NNNNNNN\n" +
		"NN NNNN\n" +
		"NN  NNN\n" +
		"NN   NN\n" ,
		
		" OOOOO \n" +
		"OO   OO\n" +
		"OO   OO\n" +
		"OO   OO\n" +
		"OO   OO\n" +
		"OO   OO\n" +
		" OOOOO \n" ,
		
		"PPPPPP \n" +
		"PP   PP\n" +
		"PP   PP\n" +
		"PPPPPP \n" +
		"PP     \n" +
		"PP     \n" +
		"PP     \n" ,
		
		" QQQQQ \n" +
		"QQ   QQ\n" +
		"QQ   QQ\n" +
		"QQ   QQ\n" +
		"QQ  QQQ\n" +
		" QQQQQ \n" +
		"     QQ\n" ,
		
		"RRRRRR \n" +
		"RR   RR\n" +
		"RR   RR\n" +
		"RRRRRR \n" +
		"RR RR  \n" +
		"RR  RR \n" +
		"RR   RR\n" ,
		
		" SSSSSS\n" +
		"SS     \n" +
		"SS     \n" +
		" SSSSS \n" +
		"     SS\n" +
		"     SS\n" +
		"SSSSSS \n" ,
		
		"TTTTTTT\n" +
		"  TTT  \n" +
		"  TTT  \n" +
		"  TTT  \n" +
		"  TTT  \n" +
		"  TTT  \n" +
		"  TTT  \n" ,
		
		"UU   UU\n" +
		"UU   UU\n" +
		"UU   UU\n" +
		"UU   UU\n" +
		"UU   UU\n" +
		"UU   UU\n" +
		" UUUUU \n" ,
		
		"VV   VV\n" +	
		"VV   VV\n" +
		"VV   VV\n" +	
		"VV   VV\n" +	
		" VV VV \n" +	
		"  VVV  \n" +	
		"   V   \n" ,
		
		"WW   WW\n" +
		"WW   WW\n" +
		"WW   WW\n" +
		"WW W WW\n" +
		"WWWWWWW\n" +
		"WWW WWW\n" +
		"WW   WW\n" ,
		
		"XX   XX\n" +
		" XX XX \n" +
		"  XXX  \n" +
		"   X   \n" +
		"  XXX  \n" +
		" XX XX \n" +
		"XX   XX\n" ,
		
		"YY   YY\n" +
		"YYY YYY\n" +
		" YYYYY \n" +
		"  YYY  \n" +
		"  YYY  \n" +
		"  YYY  \n" +
		"  YYY  \n" ,
		
		"ZZZZZZZ\n" +
		"     ZZ\n" +
		"    ZZ \n" +
		"   ZZ  \n" +
		"  ZZ   \n" +
		" ZZ    \n" +
		"ZZZZZZZ\n" ,		
		};
	}