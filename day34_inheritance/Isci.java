package day34_inheritance;

public class Isci extends Muhasebe {

	public static void main(String[] args) {

		Isci isci1 = new Isci();
		isci1.isim = "Omer";
		isci1.soyisim = "Aydin";
		isci1.id = 1001;
		isci1.izinliMi = false;
		isci1.saatUcreti = 10;
		isci1.statu = "Isci";
		isci1.maas = isci1.maasHesapla();

		System.out.println(isci1.id + " " + isci1.isim + " " + isci1.soyisim + " " + isci1.izinliMi + " "
				+ isci1.saatUcreti + " " + isci1.statu + " " + isci1.maas);

		Isci isci2 = new Isci();
		isci2.isim = "Esat";
		isci2.soyisim = "Okumus";
		isci2.id = 1002;
		isci2.izinliMi = true;
		isci2.saatUcreti = 15;
		isci2.statu = "Isci";
		isci2.maas = isci2.maasHesapla();

		System.out.println(isci2.id + " " + isci2.isim + " " + isci2.soyisim + " " + isci2.izinliMi + " "
				+ isci2.saatUcreti + " " + isci2.statu + " " + isci2.maas);

		/*
		 * 1) public olan class üyelerine o class dan obje üreterek ulaþabiliyorduk 
		 * 2) inheritance sayesþnde obje urettiðimiz class dan (yukarý doðru) parent class
		 * lara ulaþabiliyoruz. extends olunca oluþturduðumuz class dan yukarý doðru
		 * (child den parent lara) hepsine ulaþabiliyoruz.
		 */
	}

}
