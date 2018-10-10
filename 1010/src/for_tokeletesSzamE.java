
public class for_tokeletesSzamE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Írj programot, amely a paraméterben megadott számról eldönti, hogy
		// tökéletes-e!
		// Segítség: egy szám tökéletes, ha a nálánál kisebb osztóinak összege
		// megegyezik önmagával.
		// pl. 6 osztói: 1+2+3=6;
		// 28 osztói: 1+2+4+7+14=28.

		int szam = Integer.parseInt(args[0]);

		System.out.print("A szám osztói: ");
		int osszeg = 0;
		for (int i = 1; i < szam; i++) {
			if (szam % i == 0) {
				System.out.print(i + " ");
				osszeg += i;
			}
		}

		if (szam == osszeg)
			System.out.println("\nA " + szam + " tökéletes szám.");
		else
			System.out.println("\nA " + szam + " nem tökéletes szám.");

	}

}
