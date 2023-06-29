package fundamentals;

import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {

	public void printTo255(){
		for(int i=1; i<=255; i++) {
			System.out.println(i);
		}
	}
	public void printImparTo255() {
		for(int i=1; i<=255; i+=2) {
			System.out.println(i);
		}
	}
	public void printSum() {
		int sum = 0;
		for(int i=0; i<=255; i++) {
			sum+=i;
			System.out.println("Nuevo numero: " +i+" Suma: "+sum);
		}
	}
	public void recorrerArr() {
		int[] arr = {1,3,5,7,9,13};
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public void max() {
		int[] arr = {-3,-5,-7};
		int max = arr[0];
		for(var i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("valor maximo: "+max);
	}
	public void avg() {
		int[] arr = {2,10,3};
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("El promedio es: "+sum/arr.length);
	}
	public void arrImpar() {
		ArrayList<Integer> y = new ArrayList<Integer>();
		for(int i=1; i<=255; i+=2) {
			y.add(i);
		}
		System.out.println(y);
	}
	public void mayoresY(int[] arr, int y) {
		int contador = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > y) {
				contador++;
			}
		}
		System.out.println(contador);
	}
	public void alCuadrado() {
		int[] arr = {1,5,10,-2};
		for(int i=0; i<arr.length; i++) {
			arr[i] = arr[i] * arr[i];
		}
		System.out.println(Arrays.toString(arr));
	}
	public void removeNegatives() {
		int[] arr = {1,5,10,-2};
		for(var i=0; i<arr.length; i++) {
			if(arr[i] < 0) {
				arr[i] = 0;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	float[] maxMinAvg(int arreglo[]) {
		int min = arreglo[0];
		int max = arreglo[0];
		int sum = arreglo[0];
		for(int i=1; i<arreglo.length; i++) {
			if(arreglo[i] > max) {
				max = arreglo[i];
			}
			if(arreglo[i] < min) {
				min = arreglo[i];
			}
			sum+=arreglo[i];
		}
		float newArr[] = {max,min,(float)sum/arreglo.length};
		return newArr;
	}
	public void cambiandoValores(int[] x) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < x.length; i++){
            if(i == x.length - 1){
                arr.add(0);
            }
            else{
                arr.add(x[i+1]);
            }
        }
        System.out.println(arr);
	}
	
	
	
	
}
