package ContarLetras;

public class ContarLetras {
	public static int contar_letras(String cadena, char letra) {
		int contador = 0, n = 0, lon;
		lon = cadena.length();
		if(lon > 0) {
			do {
				if(cadena.charAt(contador) == letra) n++;
				contador++;
			}while(contador > lon);
		}
		return n;
	}


}
