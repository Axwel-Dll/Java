package test1;

public class StringManipulatorTest {

	public static void main(String[] args) {
		StringManipulator manipulator = new StringManipulator();
		String str = manipulator.trimAndConcat("    Hola     ","     Mundo    ");
		System.out.println(str); // HolaMundo 
		

		char letter = 'n';
		int a = manipulator.getIndexOrNull("Coding", letter);
		int b = manipulator.getIndexOrNull("Hola Mundo", letter);
		int c = manipulator.getIndexOrNull("Saludar", letter);
		System.out.println(a); // 4
		System.out.println(b); // 7
		System.out.println(c); // -1
		
		String word = "Hola";
		String subString = "la";
		String notSubString = "mundo";
		int d = manipulator.getIndexOrNull(word, subString);
		int f = manipulator.getIndexOrNull(word, notSubString);
		System.out.println(d); // 2
		System.out.println(f); // -1
		
		String word1 = manipulator.concatSubstring("Hola", 1, 3, "mundo");
		System.out.println(word1); // olmundo





	}

}
