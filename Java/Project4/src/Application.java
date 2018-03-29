
public class Application 
{
	
	public static void main(String[] args) 
	{
	//Definicja zmiennych
		int a = 13;						//Definicja i przypisanie wartosci do "a"
		int b = 13;						//Definicja i przypisanie wartosci do "a"
		int stala_x = 52;				//Definicja i przypisanie wartosci do "sta쿮j_x"
		int stala_z = 12;				//Definicja i przypisanie wartosci do "sta쿮j_z"
		int tymczasowa_c, koncowa_w;	//Definicja zmiennych wynikowych tymczasowych i konczowych
		
		tymczasowa_c= a + b;
		
		if(tymczasowa_c < 40) 
		{			
			System.out.println("Wynik dodawania jest mniejszy od 40");
			//Dodawanie sta쿮j "x"
			koncowa_w = stala_x + tymczasowa_c;
			System.out.println("Wynik to: " + koncowa_w);
		}
		else if(tymczasowa_c > 40) 
		{
			System.out.println("Wynik dodawania jest wiekszy od 40");
			//Dodawanie sta쿮j "z"
			koncowa_w = stala_z + tymczasowa_c;
			System.out.println("Wynik to: " + koncowa_w);
		}	
		
	
		
		
		//System.out.println("looping " + loop);
	}
}
