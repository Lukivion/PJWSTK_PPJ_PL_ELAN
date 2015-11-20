package Wy_07;

import utilCMeth.UM;

public class Wy_07 
{

	public static void main(String[] args) 
	{

		new Wy_07(4);
		new Wy_07(10);
		
		Osoba[] imiona = {new Osoba("Dmytro", "Hnatyk"), new Osoba(), new Osoba("Jan", "B") , new Osoba("Jan", "B")};
			for(int i = 0; i< imiona.length; i++)
			{
				UM.bWm();
				imiona[i].getNames();
			}
		
		System.out.println(imiona[2].poruwnaj(imiona[3]));
		System.out.println();
		Node n = new Node(1);
		Node n1 = new Node(2);
		Node n2 = new Node(3);
		n.same = n1;
		n1.same = n2;
		n2.same = n;
		
		
	}
	
	private int wrt;
	
	public Wy_07(int wrt)
	{
		System.out.println(this);
		this.wrt = 5 + wrt;
		System.out.println(this.wrt);
		System.out.println(wrt);
	}

}

class Osoba
{
	private  String ime;
	private  String nazwisko;
	
	public Osoba()
	{
		ime = "NoName";
		nazwisko = "NoName";
	}
	
	public boolean poruwnaj(Osoba os) {
		if(ime == os.ime && nazwisko == os.nazwisko)
			return true;
		return false;
	}

	public Osoba(String ime, String nazwisko)
	{
		this.ime = ime;
		this.nazwisko = nazwisko;
	}
	
	public void getNames()
	{
		System.out.println("Ime : " + ime + ",\nNazwisko : " + nazwisko);
	}
}

class Node
{
	public int wrt;
	public Node same;
	
	public Node(int wrt)
	{
		this.wrt = wrt;
	}
	
}