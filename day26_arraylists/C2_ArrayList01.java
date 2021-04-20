package day26_arraylists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C2_ArrayList01 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		List<String> list2 = new ArrayList<>();

		List<String> list3 = new ArrayList<>();

		list3.add("Ali");
		list3.add("Veli");
		list3.add("Ayse");

		System.out.println(list3);

		System.out.println();
		list3.add(2, "Hasan");

		Iterator itr = list3.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println();
		list3.forEach(i -> System.out.println(i));

		/*
		 * Soru 6) Verilen bir Array’den istenen degere esit olan elamanlari kaldirip,
		 * kalanlari yeni bir Array olarak yazdiran bir method yaziniz
		 */

		int arr[] = { 2, 3, 5, 3, 6, 4, 3, 6, 7 };
		int sayi = 6;

		List<Integer> istenenList = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != sayi) {
				istenenList.add(arr[i]);
			}

		}
		System.out.println(istenenList);
	}

}
