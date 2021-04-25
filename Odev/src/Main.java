
public class Main {

	public static void main(String[] args) {
		
		Kurslar kurs1 = new Kurslar(1, "Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)", "Engin Demiroð", 36); 
		
		Kurslar kurs2 = new Kurslar(2, "Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)", "Engin Demiroð", 32); 
		
		Kurslar kurs3 = new Kurslar(3, "Proglamlamaya Giriþ Ýçin Temel Kurs", "Engin Demiroð", 100); 
		
		System.out.println("KURSLAR");
		
		Kurslar[] kurslar = {kurs1, kurs2, kurs3};
		for (Kurslar kurs : kurslar) {
			System.out.println(kurs.KursId +" "+ kurs.KursIsmi +" "+ kurs.Egitmen +"  %"+ kurs.Ilerleme);
			System.out.println("-----------------------");
			
		}
		
		
		
		

	}

}
