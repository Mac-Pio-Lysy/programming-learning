import java.util.Scanner;					//Importowanie biblioteki zawieraj¹cej klasê scanner

public class Application_part_2 			//Nazwa klasy i programu
{
	//Definicja zmiennych
	static int stala_x = 52;				//Definicja i przypisanie wartosci do "sta³ej_x"
	static int stala_z = 12;				//Definicja i przypisanie wartosci do "sta³ej_z"
	static int tymczasowa_c;				//Definicja zmiennej "tymczasowa_c" czyli suma liczb "a" i "b"
	static int koncowa_w;					//Definicja zmiennych wynikowych tymczasowych i konczowych 		
	static int a;							//Definicja zmiennej "a" czyli wartoœæ podawana z klawiatury
	static int b;							//Definicja zmiennej "b" czyli wartoœæ podawana z klawiatury
	static int liczba;						//Definicja zmiennej "liczba" czyli wartoœæ tymczasowa uzywana w funkcji "wczytanie_danych" do przechowywania wartoœci podanej z klawiatury 
	static int end;
	//Obiekt skanera
	static Scanner in = new Scanner(System.in);		//Tworzenie obiektu typu scanner "in"
	//******************************************
	
	
	public static void main(String[] args) 			//G³ówna funkcja wykonywalna
	{	
		do
		{
		a = Application_part_2.wczytanie_danych(liczba);				//Przypisanie wartoœci funkcji "wczytanie_danych" do zmiennej "a"
		b = wczytanie_danych(liczba);									//Przypisanie wartoœci funkcji "wczytanie_danych" do zmiennej "b"		
		tymczasowa_c= a + b;			
		wypisywanie_danych();
		end = wyjscie(liczba);
		if (end == 0)
		{
			break;
		}
		} while(true);
		
		/* ** PÊTLA FOR	
		for (int i=0; i<2; i++)
		{
		a = Application_part_2.wczytanie_danych(liczba);				//Przypisanie wartoœci funkcji "wczytanie_danych" do zmiennej "a"
		b = wczytanie_danych(liczba);									//Przypisanie wartoœci funkcji "wczytanie_danych" do zmiennej "b"
		tymczasowa_c= a + b;											//Przypisanie sumy wartoœæi zmiennych "a" i "b" do zmiennej tymczasowa_c
		wypisywanie_danych();
		}
		*/
	}
	
	static int wczytanie_danych(int liczba)			//Funkcja wczytuj¹ca dane z klawiatury
	{				
		//Podawanie liczby z klawiatury
		System.out.println("Podaj liczbê i zatwierdz enterem");						//Wypisanie napisy na ekranie konsoli
		liczba = in.nextInt();														//Przypisanie wartoœci z klawiatury do zmiennej "liczba"
		System.out.println("Podales liczbe :" + liczba + "\n*******************");	//Wypisanie napisy na ekranie konsoli
		return liczba;																//Zwracanie wartoœci zmiennej "liczba" do funkcji 
	
	}
	
	static int wyjscie(int liczba)			//Funkcja pobieraj¹ca liczbe z klawiatury w celu zakonczenia prgoramu
	{				
		//Podawanie liczby z klawiatury
		System.out.println("Je¿eli chcesz zakoñczyæ program wciœnij zero i zakoncz enterem");
		liczba = in.nextInt();														//Przypisanie wartoœci z klawiatury do zmiennej "liczba"
		return liczba;																//Zwracanie wartoœci zmiennej "liczba" do funkcji 
	}
	
	
	/*
	 * -----in.nextInt();------     //Wywo³anie obiektu typu in(In to obiekt typu Snanner) i wywo³anie z niego funkcji nextInt()
	 */
	
	public static void wypisywanie_danych()				//Funkcja wypisywania danych
	{
		if(tymczasowa_c < 40) 							//Warunek if sprawdza poprawnoœæ za³o¿enia 
		{			
			System.out.println("Wynik dodawania jest mniejszy od 40");		//Wydruk na ekranie
			//Dodawanie sta³ej "x"
			koncowa_w = stala_x + tymczasowa_c;								//dodawanie zmiennych typu int do zmiennej "koncowa_w"
			System.out.println("Wynik to: " + koncowa_w);					//Wyœwietlenie na ekranie zmiennej "koncowa_w"
			System.out.println("Wartoœæ zmiennej to: " + stala_x);			//Wyœwietlenie na ekranie zmiennej "stala_x"
		}
		else if(tymczasowa_c > 40) 
		{
			System.out.println("Wynik dodawania jest wiekszy od 40");
			//Dodawanie sta³ej "z"
			koncowa_w = stala_z + tymczasowa_c;
			System.out.println("Wynik to: " + koncowa_w);
			System.out.println("Wartoœæ zmiennej to: " + stala_z);
		}	
	}
}
