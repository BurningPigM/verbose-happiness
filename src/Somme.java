/*
 * Created by Mickaël Carpené
 * Repo: https://github.com/BurningPigM/verbose-happiness
 * 
 */
public class Somme {

	public static void main(String[] args) {
		System.out.println("Somme de 1 et 5: " + somme(1,5));
		System.out.println("Soustraction de 1 et 5: " + soustraction(1,5));
		System.out.println("Multiplication de 2 et 5: " + multiplication(2,5));
	}
	
	
	public static int somme(int a, int b) {
		return a+b;
	}

	public static int soustraction(int a, int b) {
		return a-b;
	}
	
	public static int multiplication(int a, int b) {
		return a*b;
	}
}
