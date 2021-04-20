package day02_scanner;

import java.util.Scanner;

public class C2_Scanner2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Alanini hesaplamak icin dairenin yaricapini giriniz");
		
		double yaricap = scan.nextDouble();
		
		System.out.println("dairenin alani = " + 3.14 * yaricap * yaricap);
		
        scan.close();
	}

}
