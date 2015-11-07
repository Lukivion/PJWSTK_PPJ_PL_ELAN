package cw9;

public class MainSE {

	public static void main(String[] args) {
		//zadanie 1
		for(int i = 0; i <= 100; i+=2)
		{
				System.out.print(i + ", ");
		}
		//
		rozdeli();
		//zadanie 2
		/* int s = 0 ;
		 for ( int i = 1 ; i <= 10 ; i++)
		 {
		     s = s + i;
		     System.out.print(s + ", ");
		 }
		*/
		int s = 0 ;
		int i = 1; 
		while (i <= 10)
		 {
			
		     s = s + i;
		     System.out.print(s + ", ");
		     i++;
		 }
		//
		rozdeli();
		//
		int[] tab1 = {3, 2, 1, 4, 6};
		int[] tab2 = {1, 2, 4, 3, 4, 5};
		int count = 0;
		for (int n = 0; n < tab1.length; n++)
		{
			for (int k = 0; k < tab2.length ; k++)
				if (tab1[n] == tab2[k])
				{
					count++;
				}
			if (count > 1) System.out.println(tab1[n] + ", raz " + count);
			else if (count == 1 ) System.out.println(tab1[n]);
			count = 0;
		}
		//
		rozdeli();
		//zadanie 4
		for (int b = 1; b <= 10; b++)
		{
			for (int l = 1; l <= 10; l++)
			{
				System.out.print(l*b + "\t ");
			}
			System.out.println();
				
		}
		rozdeli();
		//zadanie 5
		String star = "";
		String space = "";
		int width = 13;
		for(int z = 0; z < width; z++)
		{
			star += "+ ";
		}
		for(int f = 0; f < width; f++)
		{
			System.out.println(space + star);
			star  = star.substring(2);
			space += "-";
		}
		star += "+ ";
		space = space.substring(1);
		for(int u = 0; u < width - 1; u++)
		{
			star += "+ ";
			space = space.substring(1);
			System.out.println(space + star);
		}

	}
	

	public static void rozdeli()
	{
		System.out.println("\n ====================================");
	}
}
