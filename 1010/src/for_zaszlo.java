
public class for_zaszlo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Írj programot, amely kirajzolja az amerikai zászlót! (A bal felso sarokban
		//csillagok, a többi részen kötojelek.) A megoldáshoz használj egymásba
		//ágyazott ciklusokat!
		
		for (int i = 0; i < 13; i++)
		{
			for (int j = 0; j < 40; j++)
			{
				if ((i < 5) && (j < 20))
					System.out.print("*");
				else
					System.out.print("-");
			}
			System.out.println();
		}

	}

}
