
public class for_parameter {
	public static void main(String[] args) {
		// Írj programot, amely kiírja a felhasználó által adott összes paramétert!
		// Segítség: a paraméterek számát az args tömb hosszából tudjuk meg, amit
		// az args.length hivatkozás ad meg.

		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

	}
}
