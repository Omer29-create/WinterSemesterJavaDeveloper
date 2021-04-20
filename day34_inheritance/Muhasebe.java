package day34_inheritance;

public class Muhasebe extends Personel{
// Muhasebe class'i class'nin personel class'inin child class'i oldugunu berlirtmek icin
	//extends yazariz.
	
	public int saatUcreti;
	public String statu;
	public int maas;
	
	public int maasHesapla() {
		
		maas = 30 * saatUcreti;
		
		return maas;
	}
}
