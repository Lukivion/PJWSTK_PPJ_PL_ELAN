package cw13;

import utilCMeth.UM;

public class Main 
{

	public static void main(String[] args) 
	{
		//zadanie 1
		{xoxo(8, 'x');}
		//
		UM.bW();
		//zadanie 2
		{
			int[][] neo = new int[5][5];
			UM.randyneo(neo, 0, 1);
			UM.prl(isDiagonal(neo));
			UM.prneo(neo);
			
		}
		//
		UM.bW();
		//zadanie 3
		{

			char [][] neo = 
				{
					{'S', 'a', 'm', 's', 'u', 'n', 'g'},
					{'N', 'o', 'k', 'i', 'a'},
					{'A', 'p', 'p', 'l', 'e'},
					{'B', 'l', 'a', 'c', 'k', 'B', 'e', 'r', 'r', 'y'},
					{'A', 'l', 'c', 'a', 't', 'e', 'l'} ,
					{'S', 'o', 'n', 'y'} ,
					{'J', 'o', 'l', 'l', 'a'}
				};
		prowerkaNaWshyw(neo);
		}
		//
		UM.bW();
		//zadanie 4
		{	
			char [][] neo = 
				{
					{'S', 'a', 'm', 's', 'u', 'n', 'g'},
					{'N', 'o', 'k', 'i', 'a'},
					{'A', 'p', 'p', 'l', 'e'},
					{'B', 'l', 'a', 'c', 'k', 'B', 'e', 'r', 'r', 'y'},
					{'A', 'l', 'c', 'a', 't', 'e', 'l'} ,
					{'S', 'o', 'n', 'y'} ,
					{'J', 'o', 'l', 'l', 'a'}
				};
			zaszyfrujMeniaPolnostiu(neo);
			UM.prneo(neo);
			UM.bWm();
			rozszyfrujMeniaPolnostiu(neo);
			UM.prneo(neo);
		}
		//
		UM.bW();
		//zadanie 5
		{
				for(int i = 0; i < 10; i++)
					zarandomNWD();
		}
	}

	private static void zarandomNWD() 
	{	
		int[] arr = new int[2];
		UM.randyarr(arr, 0, 100);
		UM.prarr(arr);
		
		if(arr[0] == 1 || arr[1] == 1)
		{
			arr[1] = 1;
		} else if(arr[0] == 0 || arr[1] == 0 || arr[0] == arr[1])
		{
			arr[1] = 0;
		} else while (arr[0]%arr[1] != 0)
		{
			if(arr[0] < arr[1])
				UM.swparr(arr, 1, 0);
			arr[0] -= arr[1];
		}
		UM.prarr(arr);
		UM.prl(arr[1]);
		UM.bWm();
	}

	private static void rozszyfrujMeniaPolnostiu(char[][] neo) {
		for (int i = 0; i < neo.length; i++)
			for (int j = 0; j < neo[i].length; j++)
				neo[i][j] -= i + j;
		
	}

	private static void zaszyfrujMeniaPolnostiu(char[][] neo) {
		for (int i = 0; i < neo.length; i++)
			for (int j = 0; j < neo[i].length; j++)
				neo[i][j] += i + j;
	}

	private static void prowerkaNaWshyw(char[][] neo) {
		
		for(int i = 0; i < neo.length; i++)
		{
			boolean[] kryt = UM.kryteriumy(neo[i]);
			UM.bWm();
			UM.pr("Ime: ");
			UM.prarr(neo[i]);
			UM.pr("Odpowiada na kryterium : ");
			for (int j = 0; j < kryt.length; j++)
			UM.pr((kryt[j]? j + 1 + " ": ""));
			UM.prl();
		}
	}

	private static boolean isDiagonal(int[][] neo) {
		for(int i = 0; i < neo.length; i++)
			if(neo.length != neo[i].length)
				return false;
		for(int i = 0; i < neo.length; i++)
			for(int j = 0; j < neo[i].length; j++)
				if (i != j && neo[i][j] != 0)
					return false;
		return true;
	}

	public static void xoxo(int bok, char value) 
	{
		char[][] neo = new char[bok][bok];
		char[] znak = new char[2];
		znak[0] = value;
		if (value - 'x' == 0)
			znak[1] = 'o';
		else
			znak[1] = 'x';
		
			for(int i = 0; i < bok ; i +=2)
			{
					UM.fillCol(neo, i, znak[0]);
				   
			}
			for(int i = 1; i < bok ; i +=2)
			{
					UM.fillCol(neo, i, znak[1]);
				   
			}
		UM.prneo(neo); 
		
	}

}
