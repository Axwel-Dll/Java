package test1;

public class StringManipulator {

	public String trimAndConcat(String cadena1, String cadena2) {
        return cadena1.trim().concat(cadena2.trim());
	}
	public int getIndexOrNull(String cadena, char letra) {
		return cadena.indexOf(letra);
	}
	public int getIndexOrNull(String cadena1, String cadena2) {
		return cadena1.indexOf(cadena2);
	}
	public String concatSubstring(String cadena1, int int1, int int2, String cadena2) {
		return cadena1.substring(int1,int2)+cadena2;
	}
}
