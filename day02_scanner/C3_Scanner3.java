package day02_scanner;

import java.util.Scanner;

public class C3_Scanner3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz");
		
		String name = scan.next();  // Tek kelime alinabilir
		                            // Tüm satiri alir
		System.out.println("lutfen soyisminizi giriniz");
		
		String surName = scan.next();
		
		System.out.println(name + "  " + surName);
		
		scan.close();
	}

}
