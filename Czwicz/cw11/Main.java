package cw11;

import utilCMeth.UM;

public class Main {
	
	public static void main(String[] args)
	{
		
		//zadanie 1
		{
		 String [] slowa = {"Ala", "kota", "ma", "ma", "a", "kot", "Alę"};
		 UM.swparr(slowa, 2, 1);
		 UM.swparr(slowa, 3, 5);
		 UM.swparr(slowa, 4, 3);
		 UM.prarr(slowa);
		 //
		 UM.bW();
		}
		 //zadanie 2
		{ 
		 char[] ak = {'A','l','a','m','a','k','o','t','a'};
		 int count = 0;
		 for (int i = 0; i < ak.length; i++)
			 if ((ak[i] - 'a') == 0 )
				 count++;			 
		 UM.prl("Litera 'a' wystąpila " + count + " razy");
		 //
		 UM.bW();
		}
		 //zadanie 3
		{ 
		 int[] arr = new int[20];
		 UM.randyarr(arr);
		 UM.prarru(arr);
		 UM.bWm();
		 UM.movearrRfromPos(arr, 10);
		 arr[10] = -1;
		 UM.prarru(arr);
		 UM.bWm();
		 UM.movearrRtoPos(arr, 10);
		 UM.prarru(arr);
		 //
		 UM.bW();
		}
		 //zadanie 4
		{
		 int[] arr1 = new int[10];
		 int[] arr2 = new int[10];
		 int[] arr3 = new int[10];
		 UM.randyarr(arr1);
		 UM.randyarr(arr2);
		 UM.randyarr(arr3);
		 int[][] neo = {arr1, arr2, arr3};
		 UM.prneo(neo);
		 //
		 UM.bW();
		}
		 //zadanie 5
		{
			int[][] neo = new int[8][8];
			UM.randyneo(neo);
			UM.prneo(neo);
			int[] arr = new int[(neo.length*2)];
			UM.copydiag(neo, arr);
			UM.bWm();
			UM.prarr(arr);
			UM.prl(UM.comparratl(arr, 3) ? "Tak" : "Nie");
		}
				 
		 
		 
	}
}
