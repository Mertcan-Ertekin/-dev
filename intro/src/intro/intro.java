package intro;

import java.util.Iterator;

public class intro {
	public static void main(String[] args) {
		
		String internetSubeButonu = "�nternet �ubesi";
		System.out.println(internetSubeButonu);
		
		double dolarBugun = 8.15;
		double dolarDun = 8.18;
		int vade = 36;
		boolean dustuMu = false;
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar d��t� resmi");
			
		}
		else if(dolarBugun>dolarDun) {
			System.out.println("Dolar y�kseldi resmi");
		
		}
		else {
			System.out.println("Dolar de�i�medi resmi");
		}
		System.out.println("------------------------");
		
		String[] krediler = 
			{
				"H�zl� Kredi", 
				"Mutlu Emekli Kredisi",
				"Konut Kredisi",
				"�ift�i Kredisi",
				"MSB Kredisi",
				"MEB Kredisi",
				"K�lt�r Bakanl��� Kredisi"
			};
		
		for (String kredi : krediler) {//foreach d�ng�s�
			System.out.println(kredi);
		}
		
		System.out.println("------------------------");
		
		for(int i = 0; i<krediler.length; i++) { //for d�ng�s�
			System.out.println(krediler[i]);
			
		}
		

		
	}

}
