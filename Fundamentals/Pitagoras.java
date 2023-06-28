package test1;

public class Pitagoras {
	public static void main(String[] args) {

        double hipotenusa = calcularHipotenusa(3, 4);
        System.out.println("La hipotenusa es: " + hipotenusa);
		
	}
	
    public static double calcularHipotenusa(int catetoA, int catetoB) {
    	return Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
    }
    
}
