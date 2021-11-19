













/**Static String contarCaracteresPalabrasLineas(String texto) {
	int caracteres = 0, palabras = 0, lineas = 1;
	String[] words = texto.split("[ \t\n]+");
	

	for(int i = 0; i < words.length; i++) {
		if(wods[i].length() > 0) {
			palabras++;
			caracteres += words[i].length();
		}
	}
	for(int i=0;i < texto.length(); i++) {
		if(texto.charAt(i) == '\n') {
			lineas++;
		}
	}
	return caracteres + "-0" + palabras + "-" + lineas;
}

Static String interpretarCodigo(String codigo, int opcion) {
	String[] valores = codigo.split("-");
	String[] tipos = {"caracteres", "palabras", "lineas"};
	return valores[opcion -1] + " " + tipos[opcion -1];
}
**/


