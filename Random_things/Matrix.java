
public class Matrix {

	public static void main(String[] args) 
	{
		
		int[][] matrix = 
			{
				{7,3,2,32,7,9,99},
				{76,43,27,33,41,6,6},
				{33,77,35,21,43,66,71},
				{333,999,666,1289,33,1,88},
				{56,23,11,67,34,89},
			};
			
				for(int j = 0; j < matrix.length; j ++)
				{
					int count = 0;
					for (int i = 0; i< matrix[j].length; i++)
					{
						if (matrix[j][i]%3 == 0) count++;
					}
					System.out.println(count + " - чисел в рядку " + (j+1) + " кратно 3.");
				}
	}

}
