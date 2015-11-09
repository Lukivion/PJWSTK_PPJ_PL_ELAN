package Cw12;

import utilCMeth.UM;

public class Cw12 {
	
	public static void main(String[] args)
	{
		//Zadanie 1
		UM.prl(25);
		//
		UM.bW();
		//Zadanie 2
		{
			int wrt = 5;
			modifyBy5(wrt);
		}
		//
		UM.bW();
		//zadanie 3
		{
			char[] amk = {'A','l','a','m','a','k','o','t','a'};
			UM.prl(UM.comparrttl(amk, 'a'));
		}
		//
		UM.bW();
		//Zadanie 4
		{	//I
			char[][] charly = new char[5][5];
			UM.prneo(charly);
			UM.bWm(); 
			//II
			fillRow(charly, 2, '-');
			UM.prneo(charly);
			UM.bWm();
			//III
			fillCol(charly, 2, '|');
			UM.prneo(charly);
			UM.bWm();
			//IV
		/*	fillColFromTo(charly, 2, 1, 3, '1');
			fillRowFromTo(charly, 2, 1, 3, '1');
			UM.prneo(charly);
			UM.bWm();
		*/	//V
			fillRowFromTo(charly, 0 ,new int[] {0, 4} , '+');
			fillColFromTo(charly, 0 ,new int[] {0, 4} , '+');
			fillRowFromTo(charly, 4 ,new int[] {4} , '+');
			fillRowFromTo(charly, 2 ,new int[] {2} , '%');
			UM.prneo(charly);
			UM.bW();
			//VI
			char[][] spi = new char[20][20];
			box(spi);
			fillspiral(spi);
			
			spi[11][11] = ':';
			spi[11][12] = ')';
			UM.prneo(spi);
		}
	}
	
	private static void fillspiral(char[][] spi) {
		int num = 0;
		int pos = spi.length - 2;
		rightCor(spi, num, pos);
		
	}

	public static void box(char[][] spi)
	{
		fillCol(spi, 0, 'o');
		fillCol(spi, spi.length - 1, 'o');
		fillRow(spi, spi.length - 1 , 'o');
	}
	
	public static void rightCor(char[][] spi, int n, int pos)
	{
		fillRowFromTo(spi,  2*n - 1, 2*n , spi[pos].length - 2 - 2*n, 'o');
		fillColFromTo(spi, 2*n - 1, 2*n , spi[pos].length - 1 - 2*n, 'o');
	}

	private static void fillCol(char[][] charly, int col, char val) 
	{
		for (int i = 0; i < charly.length; i++)
		{
			charly[i][col] = val;
		}

	}
	private static void fillRow(char[][] charly, int row, char val) 
	{
		for (int i = 0; i < charly[row].length; i++)
		{
			charly[row][i] = val;
		}
		
	}
	
	private static void fillColFromTo(char[][] charly, int col, int from, int to, char val) 
	{
		if ( from > to)
		{
			int k = from;
			from = to;
			to= k;
		}
			for (int i = from; i <= to; i++)
			{
				charly[i][col] = val;
			}

	}
	private static void fillRowFromTo(char[][] charly, int row, int from, int to, char val) 
	{
		if ( from > to)
		{
			int k = from;
			from = to;
			to= k;
		}
			for (int i = from; i <= to; i++)
			{
				charly[row][i] = val;
			}

	}
	
	private static void fillColFromTo(char[][] charly, int col, int[] pos, char val) 
	{
		for (int i = 0; i < pos.length; i++)
		{
			charly[pos[i]][col] = val;
		}

	}
	private static void fillRowFromTo(char[][] charly, int row, int[] pos, char val) 
	{
		for (int i = 0; i < pos.length; i++)
		{
			charly[row][pos[i]] = val;
		}

	}

	private static void modifyBy5(int wrt) 
	{
		UM.prl(wrt);
		wrt += 5;
		UM.prl(wrt);
		
	}

}
