package SE_GotowDoKol;

public class SE_DoKol {
	
	public static void main(String[] args) {
		int a  = randy(1, 35);
		System.out.println(a);
		int[] massiv = new int[9];
		fillMassivRand(massiv);
		printArr(massiv);
	}

	private static void printArr(int[] massiv) {
		for(int i = 0; i<massiv.length;i++){
			System.out.print(massiv[i]+ " ");
		}
		
	}
 
	public static void fillMassivRand(int[] um)
	{
		for(int i = 0; i < um.length; i++)
		{
			um[i] = randy(1, 100);
		}
	}

	public static int randy(int min, int max)
	{
		return((min + (int)(Math.random()*(max - min)+1)));
	}

}

