package cw9;

public class Main {

	public static void main(String[] args) {
		//zadanie 1
		para();
		//
		bW();
		//zadanie 2
		pentla();
		//
		bW();
		//zadanie 3
		poruwn();
		//
		bW();
		//zadanie 4
		tablicamno();
		//
		bW();
		//zadanie 5
		kleps(111);
		
	}

	private static void kleps(int mainhight) {
		gora(mainhight);
		dol(mainhight);
		
	}

	private static void dol(int mainhight) 
	{
			String pyramid = "* * ";
			int hight = mainhight;

				for (int i = hight-1; i > 0; i--) 
				{
					String position = "";

					for (int n = hight - 1 - 1; n > 0; n--)

					{
						position += " ";
					}
					hight--;
					System.out.println(position + pyramid);
					pyramid += "* ";
			    }
		
	}

	private static void gora(int mainhight) 
	{
				
			int hight = mainhight;
			String pyramid = "";
			
				for(int i = 0; i < hight; i++)
				{
					
					pyramid += "* ";
					
				}	
				
				for (int n = hight; n > 0 ; n--)
				{	
					
					String position = "";
					
						for(int f = hight; f < mainhight ; f++)
						{
							
							position += " ";
							
						}
						
						System.out.println(position + pyramid);
						hight--;
						pyramid = pyramid.substring(2);
						
				}
				
	}

		


	private static void tablicamno() 
	{
	
		for (int i = 1; i <= 10; i++)
		{
			for (int j = 1; j<=10 ; j++)
			{
				System.out.print(i*j + " ");
			}
			System.out.println();
		}
		
	}

	private static void poruwn() {
		int[] tab1 = {3, 3, 3, 3};
		int[] tab2 = {3, 3, 3, 3};
		
		for (int j = 0; j < tab1.length ; j++)
		{
			int count = 0;
				if ( chekni(tab1, j))
				{
					/*for (int i = 0; i < tab2.length; i++)
					{
							if (tab1[j] == tab2[i]) count++;
					}*/
					for (int i = 0; i< tab1.length; i++)
					{
						if (tab1[j] == tab2[i]) count++;
					}
				System.out.println("Porównóje liczbe : " + tab1[j] + ", znalazł : " + count);
				}
		}
		
	}

	private static boolean chekni(int[] tab1, int i) {
		for (int j = i; j > 0; j-- )
		{
			if (tab1[j] == tab1[i]) return(false);
		}
		return true;
	}

	private static void pentla() {
		int s = 0;
		int i = 1;
		while (i<=10)
		{
			s += i;
			i++;
			System.out.print(s + ", ");
		}
		
	}

	private static void bW() {
		System.out.println(" \n -=-=-=-=-=-=*0*-*0*-*0*=-=-=-=-=-=-");
		
	}

	private static void para() {
		for (int i = 0; i <= 100; i +=2) System.out.print(i + ", ");
		
	}

}
