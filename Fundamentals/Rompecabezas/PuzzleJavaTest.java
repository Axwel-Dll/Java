package fundamentals;

import java.util.ArrayList;

public class PuzzleJavaTest {

	public static void main(String[] args) {
		
		PuzzleJava puzzle = new PuzzleJava();
		
		int[] array = {3,5,1,2,7,9,8,13,25,32};
		ArrayList<Integer> resultado = puzzle.sumArr(array);
		System.out.println(resultado);
		
		puzzle.printNombres();
		
		puzzle.letrasAlfabeto();
		
		puzzle.numAleatorio();
		
		puzzle.numerosRandom();
		
		puzzle.cadenaAleatoria();
		
		puzzle.cadenaAleatoria2();
	}

}
