package cw8;
public class Main {

	public static void main(String[] args) 
	{
	
		pine_trees(10);
		int[] arr = {12, 8 , 15, -138, 11, 2, -5, 1};
			for (int i = 0; i < arr.length - 1; i ++ )
			{
				for (int j = i + 1; j < arr.length; j++)
				{
					int change;
						if (arr[i] > arr[j])
						{
							change = arr[i];
							arr[i] = arr[j];
							arr[j] = change;
						}
				
				}
				System.out.println(arr[i]);
			}
	}

	

	
	private static void pine_trees(int mainhight) {

		for (int j = 0; j < 3; j++) 
		{
			String pyramid = "* ";
			int hight = mainhight;

				for (int i = hight; i > 0; i--) 
				{
					String position = "";

					for (int n = hight - 1; n > 0; n--)

					{
						position += " ";
					}
					hight--;
					System.out.println(position + pyramid);
					pyramid += "* ";
			    }
	
		}
		
		System.out.println(" ");
		
		for(int j = 0; j < 3; j++)
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

	}
		
}