import java.util.Scanner;

public class Application {


		static int tablica[];
		static int i;
		static int number;
		static int max;
		static int min;
		static int row = 0;
		static int iteracje = 25;
		static int wie = 0;
		static int tablicawie[];
		static int mnie[];
		static int tablicamnie[];
		static Scanner in = new Scanner(System.in);
	
		
		public static void main(String[] args)
		{
			tablica = new int [iteracje];
			tablicawie = new int[iteracje];
			tablicamnie = new int[iteracje];
			
			System.out.println("Podaj 25 liczb");
			for(i = 0; i < iteracje; i++)
			{
				number = load_number(number);
				tablica[i] = number;
				
			}
			max = maximum(max);
			min = minimum(min);
			row = rowna(row);
			wie = wiekszosc(wie);
			maximum(max);
		}
		
		static int load_number(int number) 
		{				
			number = in.nextInt();
			return number;
		}
				
		public static int maximum(int max)
		{
			max = tablica[0];
			for(i=0; i<iteracje; i++)
			{
				if(max < tablica[i])
				{
					max = tablica[i];
					System.out.println("Maksymalna wartoœæ to: " + max);
				}
			}
			
			return max;
		}
	
		public static int minimum(int min)
		{
			min = tablica[0];
			for(i=0; i<iteracje; i++)
			{
				if(min > tablica[i])
				{
					min = tablica[i];
					System.out.println("minimalna wartoœæ to: " + min);
				}
			}
			
			return min;
		}
		
		public static int rowna(int row)
		{
			for(i=0; i<iteracje; i++)
			{
				if(iteracje == tablica[i])
				{
					row++;
				}
			}
			return row;
		}	
		
		public static int wiekszosc(int wie)
		{
			wie = 0;
			for(i=0; i<iteracje; i++)
			{
				if(iteracje < tablica[i])
				{				
					tablicawie[wie] = tablica[i];
					wie++;
					System.out.println("wartoœæ elementu " + i + "to" + tablica[i]);
					System.out.println("iloœæ iteracji to: " + wie);
				}
			}
			return wie;
		}
		
		public static int mniejszosc(int mnie)
		{
			mnie = 0;
			for(i=0; i<iteracje; i++)
			{
				if(iteracje > tablica[i])
				{				
					tablicamnie[mnie] = tablica[i];
					mnie++;
					System.out.println("wartoœæ elementu " + i + "to" + tablica[i]);
					System.out.println("iloœæ iteracji to: " + mnie++);
				}
			}
			return mnie;
		}
		
}
