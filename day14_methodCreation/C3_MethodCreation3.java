package day14_methodCreation;

public class C3_MethodCreation3 {

	public static void main(String[] args) {

		ortalama(2352, 3346, 7876);
	}

	public static void ortalama(double sayi1, double sayi2, double sayi3) {
		System.out.println((sayi1 + sayi2 + sayi3) / 3);
	}

	public static void ortalama(double sayi1, double sayi2) {

		System.out.println("girdiginiz iki sayinin ortalamasi : " + (sayi1 + sayi2) / 2);
		// Bir methodu olusturmak o methodu calistirmak icin yeterli degildir
		// olusturulan method main method icinden cagrilinca calisir.
	}
}
