package day46_collections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class C2_HashSet01 {
    public static void main(String[] args) {
        // Verilen bir Array'deki tekrarli elemanlari silip
        // unique elemanlardan olusan bir Array'e ceviren 
        // bir method yaziniz
        
        int arr[]= {2,3,4,3,5,3,6,4,7,4,8,5};
        
        int tekrarsizArray[] = tekrarlariSil(arr);
        
        System.out.println("Main method icinde array olarak : " + Arrays.toString(tekrarsizArray));
        
    }
    public static int[] tekrarlariSil(int[] arr) {
        
        Set<Integer> set1 = new HashSet<>();
        
        for (Integer each : arr) {          
            set1.add(each);
        }
        
        System.out.println("Set olarak method icinde : " + set1); // [2, 3, 4, 5, 6, 7, 8]
        
        int tekrarsizArray[] = new int[set1.size()];
        
        int index=0;
        for (int each : set1) {
            tekrarsizArray[index]=each;
            index++;
        }
        
        return tekrarsizArray;
    }
	/*
	 * public static void main(String[] args) { int arr[] =
	 * {1,2,2,3,1,4,2,5,6,8,7,5,9,1}; 
	 * List<Integer> list = new ArrayList<>(); 
	 * for(int i = 0; i < arr.length; i++) { 
	 *     if (!(list.contains(arr[i])))list.add(arr[i]); 
	 * } 
	 * System.out.println("List olarak yazdirdim: " + list);
	 * Integer [] arr1 = list.toArray(new Integer[0]);
	 * System.out.println("Array olarak yazdirdim: " + Arrays.toString(arr1)); }
	 */
}
