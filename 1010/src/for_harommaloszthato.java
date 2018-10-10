
public class for_harommaloszthato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Módosítsuk az elozo programot úgy, hogy ne az 1 és 20 közé eso páros,
		//hanem a paraméterként megadott két szám közé eso 3-mal osztható
		//számokat listázzuk ki!
		
		int elso = Integer.parseInt(args[0]);
		int masodik = Integer.parseInt(args[1]);
		
		for (int i = elso; i < masodik ; i++) 
		{
			if (i % 3 == 0)
				System.out.print(i + " ");
		}
	}

}
