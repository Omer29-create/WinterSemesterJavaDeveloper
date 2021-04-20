package day10_switchcase;

import java.util.Scanner;

public class C1_TernaryTekrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		
		int sayi = scan.nextInt();
		
		System.out.println((sayi>=100 ? (sayi<1000 ? "Sayi 3 basamakli" : "3 basamakli degil") : "Sayi 3 basamakli degil"));
		
		scan.close();
	}

}
