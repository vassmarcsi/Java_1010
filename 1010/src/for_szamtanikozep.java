
public class for_szamtanikozep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Készíts programot, amely a paraméterben megadott tetszoleges számú
		//paraméternek számítja ki a számtani közepét!
		
		int osszeg = 0;
				
		for (int i = 0; i < args.length; i++)
		{
			osszeg += Integer.parseInt(args[i]);
			System.out.print(args[i] + " " );
		}
		
		double atlag = (double) osszeg / args.length;
		
		System.out.println("\nA számok számtani közepe: " + atlag);

	}

}
