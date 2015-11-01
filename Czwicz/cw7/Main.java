package cw7;


public class Main 
{
	
	public static void main(String[] args)
	{
		//1
		boolean czyPada = true;
	 	System.out.println(czyPada ? "Pada !" : "Nie Pada !");
	 	
	 	bW();
	 	
	 	//2
	 	boolean czySwieciSlonce = false;
	 	System.out.println(pogoda(czyPada, czySwieciSlonce));
	 	
	 	bW();
	 	
	 	//3
	 	int wrt = 0;
	 	System.out.println(wrt < 0 ? "B" : (wrt > 1 ? "A" : "A, B, C."));
	 	
	 	bW();
	 	
	 	//4
	 	char znak = '4';  							 //|
	 											     //V dla czego ono pisze w unukidzie i trzeba przypisac - '0'???
	 	System.out.println(Character.isDigit(znak) ? znak - '0' : ( ( znak - 'a') < 0 ? ( znak - 'A' + 10 ) : ( znak - 'a' + 10 ) ) );
	 	
	 	bW();
	 	
	 	//5 Ну типа моя хитрожопая программа по одсчету дней :З
	 	int day = 17;
	 	int month = 4;
	 	System.out.println(Math.round(30 * (month - 1) + day + ( month > 2 ? ( -2 + ( month > 8 ? Math.ceil(month/2.0) : month/2)) : 0))-1);
	 	
	
	; 
	
	}




	private static String pogoda(boolean pada, boolean slonce) 
	{
		if (pada)
		{
			if(!slonce) return ("plucha");
			else return("tęcza");
		}
		else
		{
			if(slonce) return("sloniecznie");
			else return("pochmuro");
		}	
		
	}


	public static void bW()
	{
		
		System.out.println("-=-=-=-*0*-*0*-*0*-=-=-=-");
		
	}
	
}
