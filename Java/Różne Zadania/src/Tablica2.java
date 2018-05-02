import java.util.Scanner;

public class Tablica2 {

	static int tablica[];
	static int i;
	static int number;
	static int haslo = 5;
	
	static Scanner in = new Scanner(System.in);

	static int load_number(int number) 
	{				
		number = in.nextInt();
		return number;
	}
	
	public static void main(String[] args)
	{
		System.out.println("podaj has³o");
		i = load_number(number);
		
		
			tablica = new int [10];
			
			tablica[0] = 1;
			tablica[1] = 3;
			tablica[2] = 960;
			tablica[3] = 65;
			tablica[4] = 78;
			tablica[5] = 85;
			tablica[6] = 200;
			tablica[7] = 245;
			tablica[8] = 12321;
			tablica[9] = 3234;
			
		if(i == haslo)
			{	
			for(i = 0; i<10; i++)
			{
				int ii = i + 1;
				System.out.println("watoœæ w tablicy elementu " + ii + " to: " + tablica[i]);
			}
			}
			else
			{
				System.out.println("nie dziala");
			}
		}
}

