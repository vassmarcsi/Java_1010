
public class paros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Írj programot, mely kiírja egymás mellé az 1 és 20 közé eso páros számokat!

		for (int i = 1; i < 20; i = i + 2) {
			System.out.print(i + 1 + " ");
		}
		
		System.out.println("\nMásik megoldás: ");

		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0)
				System.out.print(i + " ");
		}

	}

}
