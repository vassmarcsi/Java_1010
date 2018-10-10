
public class for_hanyszor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Írj programot, mely két paraméterrel muködik. Az elso egy karakterlánc, a
		//második pedig egy szám, amely azt adja meg, hányszor íródjon ki
		//lépcsozetesen a képernyore az elso paraméter.
		
		String szoveg = args[0];
		int hanyszor = Integer.parseInt(args[1]);
		
		for (int i = 1; i <= hanyszor; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(szoveg + " ");				
			}
			System.out.println();
			
		}

	}

}
