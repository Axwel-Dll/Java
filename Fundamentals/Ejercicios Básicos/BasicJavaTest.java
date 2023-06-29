package fundamentals;

import java.util.Arrays;

public class BasicJavaTest {

	public static void main(String[] args) {
		BasicJava test = new BasicJava();
		test.printTo255(); // Imprimir 1 - 255
		
		test.printImparTo255(); // Imprimir los Números Impares Entre 1 - 255
		
		test.printSum(); // Imprimir la Suma 0 - 255
		
		test.recorrerArr(); // Recorrer un Arreglo
		
		test.max(); // Encontrar el Máximo
		
		test.avg(); // Obtener el Promedio
		
		test.arrImpar(); // Arreglo con Números Impares
		
	    int[] arr = {1,3,5,7}; 
	    test.mayoresY(arr, 3); // Mayor que Y
	    
	    test.alCuadrado(); // Valores al Cuadrado
	    
	    test.removeNegatives(); // Eliminar Números Negativos
	    
	    
	    int arreglo[] = {1,5,10,-2};
	    System.out.println(Arrays.toString(test.maxMinAvg(arreglo))); // Mínimo, Máximo y Promedio
	    
	    int x[] = {1,5,10,7,-2};
	    test.cambiandoValores(x); // Cambiando los Valores del Arreglo
	    
	}

}
