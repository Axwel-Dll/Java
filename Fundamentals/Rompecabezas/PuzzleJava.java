package fundamentals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class PuzzleJava {

	public ArrayList<Integer> sumArr(int[] array) {
		ArrayList<Integer> mayores = new ArrayList<Integer>();
		int sum = 0;
		for (var i = 0; i < array.length; i++) {
			sum += array[i];
			if (array[i] > 10) {
				mayores.add(array[i]);
			}
		}
		System.out.println("Total suma: " + sum);
		return mayores;
	}

	public void printNombres() {
		String nombres[] = { "Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa" };
		ArrayList<String> lista1 = new ArrayList<String>(); // nombres
		ArrayList<String> lista2 = new ArrayList<String>(); // nombres con mas de 5 caracteres

		for (int i = 0; i < nombres.length; i++) {
			lista1.add(nombres[i]);
			if (nombres[i].length() > 5) {
				lista2.add(nombres[i]);
			}
		}
		System.out.println(lista1);
		System.out.println("Nombres con mas de 5 caracteres: " + lista2);
	}

	public void letrasAlfabeto() {
		ArrayList<String> alfabeto = new ArrayList<String>();
		for (char letra = 'A'; letra <= 'Z'; letra++) {
			alfabeto.add(Character.toString(letra));
		}
		System.out.println(alfabeto);
		Collections.shuffle(alfabeto);
		System.out.println(alfabeto);

		System.out.println("Primera letra " + alfabeto.get(0));
		System.out.println("Ultima letra: " + alfabeto.get(25));
		String sample = alfabeto.get(0);

		if ("AEIOU".indexOf(sample) > 0) {
			System.out.println("La primera letra es una vocal");
		}
	}

	public void numAleatorio() {
		ArrayList<Integer> numRandom = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			int num = ThreadLocalRandom.current().nextInt(55, 101);
			numRandom.add(num);
		}
		System.out.println(numRandom);
	}

	public void numerosRandom() {
		ArrayList<Integer> numRandom2 = new ArrayList<Integer>();
		int min = 101;
		int max = 55;
		for (int i = 0; i < 10; i++) {
			int num2 = ThreadLocalRandom.current().nextInt(55, 101);
			numRandom2.add(num2);
			if (num2 < min) {
				min = num2;
			}
			if (num2 > max) {
				max = num2;
			}
		}
		Collections.sort(numRandom2);
		System.out.println(numRandom2);
		System.out.println("numero mas pequeño es: " + min);
		System.out.println("numero mas grande es: " + max);
	}

	public void cadenaAleatoria() {
		Random random = new Random();
		StringBuilder randomString = new StringBuilder();
		String caracteres = "abcdefghijklmnopqrstuvwxyz0123456789";
		for (int i = 0; i < 5; i++) {
			randomString.append(caracteres.charAt(random.nextInt(caracteres.length())));
		}
		String cadena = randomString.toString();
		System.out.println(cadena);
	}

	public void cadenaAleatoria2() {
		Random random = new Random();
		StringBuilder randomString = new StringBuilder();
		ArrayList<String> randomList = new ArrayList<String>();
		String caracteres = "abcdefghijklmnopqrstuvwxyz0123456789";
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				randomString.append(caracteres.charAt(random.nextInt(caracteres.length())));
			}
			String cadena = randomString.toString();
			randomList.add(cadena);
			randomString.setLength(0);
		}
		System.out.println(randomList);
	}
} // fin PuzzleJava
