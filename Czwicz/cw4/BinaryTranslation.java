package cw4;
import java.util.Random;


public class BinaryTranslation {

	public static void main(String[] args) {
		
		String binNam = "";
		Random r = new Random();
		int x = Math.abs(r.nextInt());
		x =  10137;
		System.out.println(x);
		
		
		
		
		System.out.println(toBinary(x, binNam));
		

	}
	
	public static String toBinary(int x, String binNam)
	{
		if (x == 1) binNam = "0001";
		else if (x == 2) binNam = "0010";
		else if (x>2)
		{
			do
			{
				binNam += x%2 ;
				x /= 2;			
			}while (x > 1); 
			binNam += 1;
			String buff = new StringBuffer(binNam).reverse().toString();
			binNam = buff;
		}
		else binNam = "0000";
		while (binNam.length() < 4)
		{
		binNam = "0" + binNam; 
		}
		return (binNam);
	}
	

}
