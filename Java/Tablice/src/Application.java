import java.util.Scanner;

public class Application 
{
	static int load_number;
	static Scanner in = new Scanner(System.in);
	static int number;
	static int tablica[];
	static int i;
	static int x = 0;
	
	static int load_number(int number) 
	{				
		number = in.nextInt();
		return number;
	}
	public static void main(String args[])
	{
		
		tablica = new int [10];
		
		tablica[0] = number;
		tablica[1] = number;
		tablica[2] = number;
		tablica[3] = number;
		tablica[4] = number;
		tablica[5] = number;
		tablica[6] = number;
		tablica[7] = number;
		tablica[8] = number;
		tablica[9] = number;
		//tablica[0] = 1;
		//tablica[1] = 10;
		//tablica[2] = 100;
		//tablica[3] = 1000;
		//tablica[4] = 2;
		//tablica[5] = 20;
		//tablica[6] = 200;
		//tablica[7] = 2000;
		//tablica[8] = 30;
		//tablica[9] = 300;     gotowe wartosci tablic
		for(i = 0; i<10; i++)
		{
			System.out.println("podaj wartoœæ elementu 1: " + tablica[number]);
			System.out.println("wartoœæ elementu 1 to:" + tablica[number]);
		}
		
		System.out.println("podaj element który chcesz zobaczyc");
		wypisywanie_danych();
		
	}			
	public static void wypisywanie_danych() 
	{
		//int x = 0;
		//i = load_number(x);
		//System.out.println("wybrales element:" + tablica[i]);		
		
		for(i = 0; i<10; i++)
		{
			System.out.println("Element " + i + " tablicy to: " + tablica[i] );
		
		}
	}	
}
	
	
	
	
	
	
	
	

