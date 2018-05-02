import java.util.Scanner;

public class Application {
	
	static int tablica[];
	static int i;
	static int number;
	static int haslo;
	
	static Scanner in = new Scanner(System.in);

	static int load_number(int tablica) 
	{				
		number = in.nextInt();
		return number;
	}
	
	public static void main(String[] arg)
	{
		tablica = new int [7];
		
		System.out.println("Podaj 6 liczb");
		for(i = 0; i < 7; i++)
		{
			load_number(number);
			tablica[i] = number;
			
		}
		
		haslo = tablica[3];
		System.out.println("has³o to: " + haslo);
		
	}
	
}