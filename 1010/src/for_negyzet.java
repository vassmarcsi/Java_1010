
public class for_negyzet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Rajzoltass a képernyore csillagokkal olyan téglalapot, melynek magasságát
		//és szélességét paraméterben adhatjuk meg. Ha nem adunk meg
		//paramétereket, az alapértelmezett magasság és szélesség 5 csillag.
		
		int szelesseg, magassag;
		
		if (args.length < 2)
		{
			System.err.println("Nem adtál meg két számot, ezért 5*5-ös négyzetet csinálok.");
			szelesseg = 5;
			magassag = 5;
		}
		else
		{
			magassag = Integer.parseInt(args[0]);
			szelesseg = Integer.parseInt(args[1]);
		}
		
		for (int i = 0; i < magassag; i++) 
		{
			for (int j = 0; j < szelesseg; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
			
		

	}

}
