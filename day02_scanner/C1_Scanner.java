package day02_scanner;

import java.util.Scanner;

public class C1_Scanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Karenin bir kenar uzunlugunu giriniz");
		
		double kenar = scan.nextDouble();
		
		System.out.println("Alan = " + kenar * kenar);
		
		scan.close();

	}

}
