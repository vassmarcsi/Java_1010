
public class for_osztok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Írj olyan programot, amely kiírja a paraméterként megadott szám osztóit!
		// Ha a szám prím, errol is tájékoztassa a felhasználót! A megoldáshoz
		// használj for-ciklust!

		int szam = Integer.parseInt(args[0]);

		System.out.print("A szám osztói: ");
		int szamlalo = 0;
		for (int i = 1; i <= szam; i++) {
			if (szam % i == 0) {
				System.out.print(i + " ");
				szamlalo++;
			}
		}

		if (szamlalo == 2)
			System.out.println("\nA " + szam + " prímszám.");

	}

}
