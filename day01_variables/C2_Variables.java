package day01_variables;

public class C2_Variables {

	public static void main(String [] args) {
		
		int sayi; // ; yazim dilindeki . gibidir. Java ;'u görünce o satirdaki 
		sayi=27;
		
		System.out.println(sayi);  //27
		
		char ilkHarf='M';
		System.out.println(ilkHarf);
		
		double sayiDouble = 5.34;
		System.out.println(sayiDouble);
		
		System.out.println(sayi + sayiDouble); //32.34
		
		System.out.println(sayi + ilkHarf);  //104
		//Eger toplama isleminde char degisken toplanirsa,onun ASCII degerini kullanir
	}
	
}
