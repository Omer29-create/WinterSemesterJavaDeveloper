package day49_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KitapAra {
	static Scanner scan = new Scanner(System.in);
	static Map<Integer, String> map1 = new HashMap<>();

	public static void main(String[] args) {
		System.out.println("Girmek istediginiz kitaplari giriniz");
		if (!map1.isEmpty()==false) {
			kitapEkle();
		}else {
			System.out.println("Isleminizi bitirebilirsiniz");
		}
	}

	public static void kitapEkle() {
		int flag = 1000;
		String bilgi = scan.nextLine();
		

		if (!map1.isEmpty() == false) {
			flag++;
		}
		map1.put(flag, bilgi);
		System.out.println(map1);
	}
}
