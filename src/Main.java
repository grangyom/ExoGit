
public class Main {

	public static void main(String[] args) {
		int result;
		result = calculSomme(4,2);
		result = Soutract(4,2);
		System.out.println(result);
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
