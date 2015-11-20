package cw13;
import java.util.Arrays;
public class SamyjChistyjKod {

	

	 public static void main(String[] args)
	 {
	 // 1
	 love(5, 'x');
	 System.out.println();
	 love(7, 'o');
	 System.out.println();

	 // 2
	 int[][] neo = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
	 System.out.println(isDiagonal(neo));
	 System.out.println("====================================================");


	 //3


	 char [][] imie = 
	 {
	 {'S', 'a', 'm', 's', 'u', 'n', 'g'},
	 {'N', 'o', 'k', 'i', 'a'},
	 {'A', 'p', 'p', 'l', 'e'},
	 {'B', 'l', 'a', 'c', 'k', 'B', 'e', 'r', 'r', 'y'},
	 {'A', 'l', 'c', 'a', 't', 'e', 'l'} ,
	 {'S', 'o', 'n', 'y'} ,
	 {'J', 'o', 'l', 'l', 'a'}
	 };
	 dima(imie);



	 // 4
	 char[] morze = { 's', 'o', 's' };
	 printmasiv(morze);
	 shfr(morze);
	 printmasiv(morze);
	 rozshfr(morze);
	 printmasiv(morze);
	 System.out.println("====================================================");


	 //5
	 for(int l = 0; l < 10; l++)
	 {
	 int a = random(0,100);
	 int b = random(0,100);
	 System.out.println("a = " + a + " b = " + b);
	 System.out.println(euklid(a,b));
	 }


	 }


	 private static void dima(char[][] imie ) 
	 {
	 for(int i = 0; i < imie.length; i++)
	 {
	 boolean[] kryt = chek(imie[i]);
	 System.out.print("imie " + Arrays.toString(imie[i]) + "\n");
	 System.out.println("Kryterium: ");

	 for(int j = 0; j < kryt.length; j++)
	 if(kryt[j])
	 System.out.print(j + 1 + " ");
	 System.out.println(); 
	 } 

	 } 

	 public static boolean[] chek(char [] imie ) {
	 boolean[] kryt = {false, false, false, false};
	 //kryterium 1
	 for(int i = 0; i < imie.length; i++)
	 for(int j = i+1; j < imie.length; j++ )
	 if(imie[i] == imie[j])
	 kryt[0] = true;
	 //kryterium 2
	 int sum = 0;
	 for(int i= 0; i < imie.length; i++)
	 sum += imie[i];
	 if(sum > 255)
	 kryt[1] = true;
	 //kryterium 3
	 for(int i = 0; i < imie.length; i++)
	 if(imie[i] == 'i')
	 kryt[2] = true;
	 //kryterium 4
	 for(int i = 0; i < imie.length; i++)
	 for(int j = i+1; j < imie.length; j++)
	 if(Character.toLowerCase(imie[i]) == Character.toLowerCase(imie[j]))
	 kryt[3] = true;
	 return kryt;
	 }
	 private static int random(int min, int max){
	 return((min + (int)(Math.random()*((max-min) + 1))));

	 }

	 private static int euklid(int i, int j) {
	 if(i == j)
	 return j;
	 else if(i == 1 || j == 1)
	 return 1;
	 else if (i == 0 || j == 0)
	 return 0;
	 else 
	 while(i > 0){
	 if(i < j){
	 int k = i;
	 i = j;
	 j = k;
	 }
	 i -= j;
	 }
	 return j;

	 }

	 private static void printmasiv(char[] morze){
	 for (int i = 0; i < morze.length; i++) {
	 System.out.print(morze[i]);
	 }
	 System.out.println();

	 }

	 private static void shfr(char[] morze) {
	 for (int i = 0; i < morze.length; i++)
	 morze[i] += i;
	 }
	 private static void rozshfr(char[] morze) {
	 for (int i = 0; i < morze.length; i++)
	 morze[i] -= i;
	 }

	 private static boolean isDiagonal(int[][] neo) {
	 for (int b = 0; b < neo.length; b++)
	 if (neo.length != neo[b].length)
	 return false;
	 for (int i = 0; i < neo.length; i++)
	 for (int j = 0; j < neo[i].length; j++)
	 if (i != j && neo[i][j] != 0)
	 return false;
	 return true;
	 }

	 public static void love(int b, char val) {
	 String bok = "";
	 char[] charly = { 'x', 'o' };
	 int index;
	 if (val == 'x')
	 index = 0;
	 else
	 index = 1;

	 for (int i = 0; i < b; i++) {
	 bok += charly[index] + " ";
	 index++;
	 if (index > 1)
	 index = 0;
	 }

	 for (int k = 0; k < b; k++)
	 System.out.println(bok);
	 }

	}
}
