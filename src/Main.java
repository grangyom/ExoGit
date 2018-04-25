import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int resultSomme, resultSoustraction;
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez deux nombres entier :");
		a = sc.nextInt();
		b = sc.nextInt();
		resultSomme = calculSomme(a,b);
		resultSoustraction = calculSoustraction(a,b);
		System.out.println("Somme de : "+a+"+"+b+" = " + resultSomme + "\n");
		System.out.println("Soustraction de : "+a+"-"+b+" = " + resultSoustraction);
	}

	public static int calculSomme(int a, int b) {
		int resultSomme;
		resultSomme = a + b;
		return resultSomme;
	}

	public static int calculSoustraction(int a, int b) {
		int resultSoustraction;
		resultSoustraction = a - b;
		return resultSoustraction;
	}
}
