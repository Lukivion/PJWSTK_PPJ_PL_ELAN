package cw7;


public class MainSE {

	public static void main(String[] args)
		{
						//В общем каждый последующий член масива ровен количеству дней всех прошлых месяцев + количество дней в этом месяце 
						// но по сути первый и последний месяц нам не важны, хотя их и можно заменить значением 0
			int[] months = { 0 ,59,90,120,151,181,212,243,273,304,333, 0};
			int day = 17;
			int month = 8 ;
			 			//А дальше тупо берем ко-лово дней за прошлие месяца и + наше ко-лово дней
			System.out.println( months[month - 1]   + day);
						//Profit!
			
		}
}
