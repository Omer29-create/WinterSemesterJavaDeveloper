package day37_overriding;

public class Isci extends Personel{

	public String bolum = "Kaynak Atolyesi";
	public int maas = 5000;
	public String isim = "Mesut";
	
	protected int maasHesapla() {
		return 30*8*15;
		
	}
	
	public void mesai() {
		System.out.println("Isciler gunluk 8 saat calisir");
	}
	
	
	
	
	
	
	public int maasHesapla(int gunSayisi) {
		return gunSayisi*8*15;
		
	}
	
	public int maasHesapla(int gunlukCalismaSaati , int gunSayisi) {
		return gunSayisi*gunlukCalismaSaati*15;
		
	}
	
	public int maasHesapla(int gunlukCalismaSaati , int gunSayisi, int saatUcreti) {
		return gunlukCalismaSaati*gunSayisi*saatUcreti;
	}
}
