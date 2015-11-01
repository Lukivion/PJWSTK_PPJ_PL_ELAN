package utilCMeth;

public class UM 
{

	
	public static void bW()
	{
		prl("-=-=-=-=-=-=-=-=-=-=-*0*-*0*-*0*-*0*-*0*-*0*-*0*-*0*-=-=-=-=-=-=-=-=-=-=-");
	}
	
	public static void bWN()
	{
		prl();
		bW();
	}
	
	public static void bWmN()
	{
		prl();
		bWm();
	}
	
	public static void bWm()
	{
		prl("-=-*0*-=-");
	}
	
	public static void pr(String p)
	{
		System.out.print(p);
	}
	
	public static void prl()
	{
		System.out.println();
	}
	
	public static void prl(String p)
	{
		System.out.println(p);
	}
	
	public static void prd(int i) 
	{
		prl("Debug " + i);
	}
	
	public static void prarr(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
			pr(arr[i] + "\t ");
		prl();
	}
	
	public static void prneo(int[][] neo)
	{
			for(int i = 0; i < neo.length; i++)
			{
				prarr(neo[i]);
			}
	}
	
	public static double randy(int min, int max)
	{
		return(min + Math.random()*((max - min)+1));
	}
	
	public static void sortarr(int[] arr)
	{
		for (int j = 0; j < arr.length - 1; j++)
		{
			for(int i = j + 1; i < arr.length; i ++)
			if (arr[j] > arr[i])
			{
				swparr(arr, i, j);
			}
		}
	}
	
	public static int[][] sorttrueneo(int[][] neo)
	{

		sortarrhoriz(neo);
		return reverttrueneo(neo);
		
	}
	
	public static void sortneovert(int[][] neo)
	{
		sortarrhoriz(neo);
		sortarrvert(neo);
	}
	
	public static int[][] reverttrueneo(int[][] neo)
	{
		
		int[][] neo2 = new int[neo[0].length][neo.length];
			for (int k = 0; k < neo[0].length; k++)
	    	{
				for (int j = 0; j < neo.length; j++)
				{
					for(int i = j + 1; i < neo.length; i ++)
						if (neo[j][k] > neo[i][k])
						{
							swparrver(neo, i, j, k);
						}
					neo2[k][j] = neo[j][k];
				}
	    	}
		return neo2;
	}
	
	public static void sortarrvert(int[][] neo)
	{
		for (int k = 0; k < neo[0].length; k++)
    	{	
			for (int j = 0; j < neo.length; j++)
			{
				for(int i = j + 1; i < neo.length; i ++)
					if (neo[j][k] > neo[i][k])
					{
						swparrver(neo, i, j, k);
					}
			}
			prl();
    	}
	}
	
	public static void sortneototaly(int[][] neo)
	{

	}
	
	public static void sortarrhoriz(int[][] neo)
	{
		for (int k = 0; k < neo.length; k++)
    	{	
			for (int j = 0; j < neo[0].length - 1; j++)
			{
				for(int i = j + 1; i < neo[0].length; i ++)
					if (neo[k][j] > neo[k][i])
					{
						swparr(neo, i, j, k);
					}
			}
    	}
	}
	
	public static void swparr(int[][] arr, int i, int j, int pos)
	{
		int k = arr[pos][i];
		arr[pos][i] = arr[pos][j];
		arr[pos][j] = k;
	}
	
	public static void swparrver(int[][] arr, int i, int j, int pos)
	{
		int k = arr[i][pos];
		arr[i][pos] = arr[j][pos];
		arr[j][pos] = k;
	}
	
	public static void swparr(int[] arr, int i, int j)
	{
		int k = arr[i];
		arr[i] = arr[j];
		arr[j] = k;
	}
}
