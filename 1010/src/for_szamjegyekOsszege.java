
public class for_szamjegyekOsszege {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Legyen a paraméter egy 100 és 9999 közé eso szám! Írasd ki a képernyore a
		// számjegyek összegét! A megoldáshoz használj ciklust!

		String szo = args[0];
		int hossz = szo.length();

		int szamjegyekosszege = 0;

		for (int i = 0; i < hossz; i++) {
			String temp = "" + szo.charAt(i);
			szamjegyekosszege += Integer.parseInt(temp);

		}

		System.out.println(szamjegyekosszege);

		// 2. megoldás
		szamjegyekosszege = 0;

		for (int i = 0; i < hossz; i++) {
			int temp = Integer.parseInt(Character.toString(szo.charAt(i)));
			szamjegyekosszege += temp;

		}

		System.out.println(szamjegyekosszege);

		// 3. megoldás


	}

}
