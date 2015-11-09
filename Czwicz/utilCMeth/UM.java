package utilCMeth;


public class UM 
{

	//STRING SYSO
	
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
	
	public static void prl(int p)
	{
		System.out.println(p);
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
	
	public static void prarru(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
			pr(arr[i] + ", ");
		prl();
	}
	
	public static void prarr(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
			pr(arr[i] + "\t ");
		prl();
	}
	
	public static void prarr(String[] arr)
	{
		for(int i = 0; i < arr.length; i++)
			pr(arr[i] + " ");
		prl();
	}
	
	public static void prarr(char[] arr)
	{
		for(int i = 0; i < arr.length; i++)
			pr(arr[i] + " ");
		prl();
	}
	
	public static void prneo(int[][] neo)
	{
			for(int i = 0; i < neo.length; i++)
			{
				prarr(neo[i]);
			}
	}
	
	public static void prneo(char[][] neo)
	{
			for(int i = 0; i < neo.length; i++)
			{
				prarr(neo[i]);
			}
	}
	
	//RANDOM
	
	public static void randyarr(int[] arr, int min, int max)
	{
    		for (int i = 0; i < arr.length; i++)
    		{
    			arr[i] = (int) UM.randy(min, max);
    		}	
    }
	
	public static void randyneo(int[][] neo, int min, int max)
	{
		for (int j = 0; j < neo[0].length; j++)
    	{
    		for (int i = 0; i < neo.length; i++)
    		{
    			neo[i][j] = (int) UM.randy(min, max);
    		}
    	}
	}
	
	public static double randy(int min, int max)
	{
		return(min + Math.random()*((max - min)+1));
	}
	
	//SORTING
	
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
	
	//SWAPERS - MOVERS
	
	public static void swparr(int[][] arr, int i, int j, int pos)
	{
		int k = arr[pos][i];
		arr[pos][i] = arr[pos][j];
		arr[pos][j] = k;
	}
	
	public static void swparr(String[] arr, int i, int j )
	{
		String k = arr[i];
		arr[i] = arr[j];
		arr[j] = k;
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
	/*needs tweaks
	public static void movearrleft(int[] arr, int pos)
	{
		int[] num = {arr[arr.length - 1], pos};
		if(pos >= 1)
				for(;pos < arr.length; pos++)
				{
					arr[pos-1] = arr[pos];
				}
		arr[num[1]] = num[0];
	}
	*/
	public static void movearrRfromPos(int[] arr, int pos)
	{
		int m = arr.length - 2;
		if(pos >= 0 )
				for(; m >= pos; m--)
				{
					swparr(arr, m + 1, m);
				}
		
	}
	
	public static void movearrRtoPos(int[] arr, int pos)
	{
		if(pos >= 0 )
				for(; pos > 0; pos--)
				{
					swparr(arr, pos - 1, pos);
				}
		
	}

	//COMPARING
	
	public static int comparrttl(char[] arr)
	{
		int num = 0;
		int index = 0;
				for (int j = index + 1; j < arr.length; j++)
				{
					if (arr[index] == arr[j])
					{
						num++;
					}
					index++;
				}
			
		return(num);
	}
	
	public static int comparrttl(char[] arr, char o)
	{
		int num = 0;
				for (int j = 0; j < arr.length; j++)
				{
					if (o == arr[j])
					{
						num++;
					} 
				}
			
		return(num);
	}
	
	public static int comparrttl(int[] arr)
	{
		int num = 0;
			for(int i = 0; i < arr.length - 1 ;)
			{
				for (int j = i + 1; j < arr.length; j++)
				{
					if (arr[i] > arr[j])
					{
						num++;
					}
				}
			}
		return(num);
	}
	
	public static boolean comparratl(int[] arr, int atl)
	{
			for(int i = 0; i < arr.length - 1 ; i++)
			{
				int num = 0;
				for (int j = i + 1; j < arr.length; j++)
				{
					if (arr[i] == arr[j])
					{
						num++;
					}
				if(num >= atl)
					return true;
				}
			}
		return false;
	}

	//CUSTOM COPY
	public static void copydiag(int[][] neo, int[] arr)
	{
		 int count = 0;
		    
	    	for (int y = 0; y < neo.length; y++)
	    	{
	    			arr[count] = neo[y][y];
	    			count++;
	    	}
	    	
	    	for (int y = 0; y < neo.length; y++)
	    	{
	    		arr[count] = neo[y][(neo.length - 1 - y)];
				count++;
	    	}
	}
}
	