package cw11;

import utilCMeth.UM;

public class MainSE {

	public static void main(String[] args) {
		//zadanie 4
		{
		int[] arr1 = new int[random(1, 10)];
		int[] arr2 = new int[random(1, 10)];
		int[] arr3 = new int[random(1, 10)];
		randomarr(arr1, 0, 100);
		randomarr(arr2, 0, 100);
		randomarr(arr3, 0, 100);
		printarr(arr1);
		printarr(arr2);
		printarr(arr3);
		UM.bW();
		int[][] neo = {arr1, arr2, arr3};
		printneo(neo); 
		}
		//zadanie 5
		{
		UM.bW();
		int[][] neo = new int[8][8];
		randomneo(neo);
		printneo(neo);
		UM.bW();
		int[] arr = new int[neo.length*2];
		recorddiag(neo, arr);
		printarr(arr);
		}
			
	}
	
	private static void recorddiag(int[][] neo, int[] arr) {
		int index = 0;
		for(int i = 0; i < neo.length; i++)
			{
				arr[index] = neo[i][i];
				index++;
			}
		
		for(int i = 0; i < neo.length; i++)
			{
				arr[index] = neo[i][neo.length - 1 - i];
				index++;
			}	
	}
	
	private static int random(int min, int max)
	{
		return(min + (int)(Math.random()*((max - min) + 1)));
	}
	
	private static void randomarr(int[] arr, int min, int max)
	{
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = random(min, max);
		}
	}
	
	private static void printarr(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + "\t ");
		}
		System.out.println();
	}
	
	private static void printneo(int[][] neo)
	{
		for(int i = 0; i < neo.length; i++)
		{
			printarr(neo[i]);
		}
	}
	
	private static void randomneo(int[][] neo)
	{
		for(int i = 0; i < neo.length; i++)
		{
			randomarr(neo[i], 0, 20);
		}
		
	}
	
}
