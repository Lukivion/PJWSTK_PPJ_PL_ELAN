

public class FrogJump {

	public static void main(String[] args) {
	
	int[] i = new int[10];
	for(int y = 0;y< i.length; y++){
	i[y] = (int) (Math.random()*2);
	System.out.print(i[y] + ", ");
	}
	System.out.println();
	int sum = 0; 
	for(int x = 0;x < i.length;x++)
	 sum +=i[x];
	System.out.println("czyslo 1 popadaje " + sum + " razy" );
	System.out.println("czyslo 0 popadaje " + (i.length - sum) + " razy" );
	}
}
