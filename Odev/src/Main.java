
public class Main {

	public static void main(String[] args) {
		
		Kurslar kurs1 = new Kurslar(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)", "Engin Demiro�", 36); 
		
		Kurslar kurs2 = new Kurslar(2, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)", "Engin Demiro�", 32); 
		
		Kurslar kurs3 = new Kurslar(3, "Proglamlamaya Giri� ��in Temel Kurs", "Engin Demiro�", 100); 
		
		System.out.println("KURSLAR");
		
		Kurslar[] kurslar = {kurs1, kurs2, kurs3};
		for (Kurslar kurs : kurslar) {
			System.out.println(kurs.KursId +" "+ kurs.KursIsmi +" "+ kurs.Egitmen +"  %"+ kurs.Ilerleme);
			System.out.println("-----------------------");
			
		}
		
		
		
		

	}

}
