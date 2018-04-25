
public class Main {

	public static void main(String[] args) {
		int resultSomme, resultSoustraction;
		int a = 4;
		int b = 2;
		resultSomme = calculSomme(4,2);
		resultSoustraction = Soutract(4,2);
		System.out.println("Somme de : "+a+"+"+b+" = " + resultSomme + "\n");
		System.out.println("Soustraction de : "+a+"-"+b+" = " + resultSoustraction);
	}

	public static int calculSomme(int a, int b) {
		int somme;
		somme = a + b;
		return somme;
	}

	public static int Soutract(int a, int b) {
		int somme;
		somme = a - b;
		return somme;
	}
}
