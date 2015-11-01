package cw10;

import utilCMeth.UM;

public class Main {

	public static void main(String[] args) {
	//zadanie 1
		int[] intik = new int[10];
	//zadanie 2
			for(int i = 0; i < intik.length; i++)
			{
				intik[i] = (int) UM.randy(0, 1);
				UM.pr(intik[i] + ", ");
			}
		UM.bWN();
	//zadanie 3
			for(int i = 0; i < intik.length; i++)
				intik[0] += intik[i];
		UM.prl("W tablice znaleziono " + intik[0] + " jedynek i  " + (intik.length - intik[0]) + " zer");
		UM.bW();
	//zadanie 4
	//*1
		double[] dobi = new double[10];
			//*2-3
			for(int i = 0; i < dobi.length; i++)
			{
				dobi[i] = UM.randy(0 , 99);
				//*3
				UM.pr(dobi[i] + ", ");
			}
		UM.bWmN();
			//*4
			for(int i = 0; i < dobi.length; i += 2)
				UM.pr(dobi[i] + ", ");
		UM.bWmN();
			//*5
			for(int i = 0; i < dobi.length; i++)
				UM.pr(((int) dobi[i]%2 == 0 ? dobi[i] + ", " : ""));
		UM.bWmN();
	//zadanie 5
	    int tab [] = {789, 678, 567};

	    	for ( int i = 0; i < tab.length ; i++)
	    		for ( int j = i; j < tab.length ; j++)
	    			System.out.print(tab[i] - tab[j] + ", ") ;
	    UM.bWN();
	//zadanie 6 - Незакончено, всместо вывода индекса сделал полную сортировку массива :\
	    int[][] neo = //new int[4][5];
	    	{
	    		{3, 5, 6, 1},  // 
	    		{7, -2, 9, 8}, // 
	    		{4, 2, 3, -3}, //
	    		{3, 5, -1, 9}, //
	    		{0, 2, 4, 7}   //
	    	};
	    /*	for (int j = 0; j < neo[0].length; j++)
	    	{
	    		for (int i = 0; i < neo.length; i++)
	    		{
	    			neo[i][j] = (int) UM.randy(0, 19);
	    			UM.pr(neo[i][j] + "\t ");
	    		}	
	    	UM.prl();
	    	}
	    UM.bW(); */
	//zadanie 7
	    	neo = UM.sorttrueneo(neo);
	    	UM.prneo(neo);// - debugging
	    	UM.prl(neo[0][0] + " !!!");
	}
	
	

}
