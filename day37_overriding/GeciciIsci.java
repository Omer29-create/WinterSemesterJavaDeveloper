package day37_overriding;

public class GeciciIsci extends Isci{

	public String calistigiBolum = "Yemekhane";
	
	public static void main(String[] args) {
	
		// Overriding
		// bir child class'ta parent class'tan miras alinan  methodÄu
		// degistirmeye overriding denir

		GeciciIsci gi1 = new GeciciIsci();
		System.out.println(gi1.maasHesapla());
		gi1.mesai();
	}
	
	
	public int maasHesapla() {
		return 30*8*10;
		
	}

	@Override
	public void mesai() {
		
		// super.mesai();
		System.out.println("Gecici isciler haftada 25 saat calisirlar");
	}
}
