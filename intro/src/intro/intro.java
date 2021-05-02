package intro;

import java.util.Iterator;

public class intro {
	public static void main(String[] args) {
		
		String internetSubeButonu = "Ýnternet Þubesi";
		System.out.println(internetSubeButonu);
		
		double dolarBugun = 8.15;
		double dolarDun = 8.18;
		int vade = 36;
		boolean dustuMu = false;
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar düþtü resmi");
			
		}
		else if(dolarBugun>dolarDun) {
			System.out.println("Dolar yükseldi resmi");
		
		}
		else {
			System.out.println("Dolar deðiþmedi resmi");
		}
		System.out.println("------------------------");
		
		String[] krediler = 
			{
				"Hýzlý Kredi", 
				"Mutlu Emekli Kredisi",
				"Konut Kredisi",
				"Çiftçi Kredisi",
				"MSB Kredisi",
				"MEB Kredisi",
				"Kültür Bakanlýðý Kredisi"
			};
		
		for (String kredi : krediler) {//foreach döngüsü
			System.out.println(kredi);
		}
		
		System.out.println("------------------------");
		
		for(int i = 0; i<krediler.length; i++) { //for döngüsü
			System.out.println(krediler[i]);
			
		}
		

		
	}

}
