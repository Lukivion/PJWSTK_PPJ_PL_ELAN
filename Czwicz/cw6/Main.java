package cw6;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) 
	{
		
		boolean z = true;
		czyPada(z);
		bW();
		Scanner input = new Scanner(System.in);
		int wrt = input.nextInt();
		illu(wrt);
		bW();
		wrt = input.nextInt();
		System.out.println(illu(wrt));
		bW();
		matematika();
		input.close();
		
		
	
	}
	
	
	public static void czyPada(boolean b)
	{
	
		if (b) System.out.println("Pada!");
		else System.out.println("Nie pada!");
		
	}
	
	public static void bW()
	{
		
		System.out.println("-=-=-=-*0*-*0*-*0*-=-=-=-");
		
	}

	
	public static String illu(int x)
	{	
		if (x>10 || (x>0 && x<5) || x>= 10) return("C");
		else if (x<=-15 || (x>-8 && x<-5)) return("B");
		else if ((x>=-3 && x<0) || (x>=5 && x<10)) return("A, C");
		else if (x>-15 && x<=-10) return("A");
		else if ((x>-5 && x<=-4) || (x>-15 && x<=-13)) return("A, B");
		else if (x>-4 && x<-3) return("A, B, C");
		else return("Null");	
	}
	
	public static void iio(int x)
	{
		if ((x >= -13 && x <= -10) || x <= -15) System.out.println("należy tylko do jednego ");
		else System.out.println("nie należy tylko do jednego ");
	}

	public static void matematika()
	{
		System.out.println(Math.pow(Math.sqrt(2), 2)-2);
	}
	


}

