package day33_encapsulation;
public class Encapsulation03 {
    public static void main(String[] args) {
        // Encapsulation02 class'indaki class member'a ulasmaya calisalim
        
        Encapsulation02 obj1 = new Encapsulation02();
        Encapsulation02 obj2 = new Encapsulation02();
        
        // Biz erisim yetkisini ikiye ayiriyoruz 
        // 1- okuyabilme get()
        // 2- degistirip kullanabilme set()
        
        System.out.println(obj1.sayi); // 100 public oldugundan hem okudum
        obj1.sayi=25;                  // 25 hem de deger atayabildim
        System.out.println(obj1.sayi); 
        
        System.out.println(obj2.sayi); // 100
        
        System.out.println(obj1.getOkulIsmi()); // get method'u oldugu icin sadece bilgi verir
        // obj1.getOkulIsmi()="Mehmet Koleji"; // get method'u sadece okur, degistiremez
        
        obj1.setTcNo("326547895447");
        // System.out.println(obj1.setTcNo("12356478912")); set() methodu okumaya izin vermez
        
    
        // Bir Class içinde class member oluþturuken bunu diðer class'lar ile
        // ne oranda paylaþacaðýmýza karar veririz
        // 1-  Herkes okuyabilsin ve obje üzerinden deðer atayýp kullanbilsin ==> public
        // 2 - Herkes okuyabilsin ama kimse obje uzerinden de olsa deðiþtiremesin Private ==> Public get();
        // 3 - Ýlk atadýðým deðeri kimse goremesin Private ==> Public set ()


		// Bir Calss içinde class member oluþturuken bunu diðer class lar ile
		// ne oranda paylaþacaðýmýza karar veririz
		// 1- Herkes okuyabilsin ve obje üzerinden deðer atayýp kullanbilsin ==> public
		// 2 - Herkes okuyabilsin ama kimse obje izerinden de olsa deðiþtiremesin
		// Private ==> Public get();
		// 3 - Ýlk atadýðým deðeri kimse goremesin Private ==> Public set ()

		/*
		 * 1) Encapsulation kisaca "data hiding(saklamak)" demektir. 2) Basarili bir
		 * Encapsulation asagidaki ozelliklere sahip olmalidir : a) Nasil kullanilacagi
		 * belli olmali (Direksiyon gibi) b) Kod'un karmasikligi kullanimin
		 * karmasikligina sebep olmamali. Yani cok karmasik kodlardan olusan bir yapi
		 * basit bir sekilde kullanilmali. c) Bir bolumun bozulmasi baska bolumlerin
		 * bozulmasina sebep olmamali.
		 * 
		 * 3) Encapsulayion nasil yapilir ? a) Access Modifier'lari "private" olarak
		 * kullaniniz. b) getter ve setter methodlari ile "encapsulated" data'lara
		 * ulasip onlari okuyabilir(getter) ve degistirebiliriz(setter)
		 * 
		 * 4) Encapsulation'in faydalari : a) Esneklik (flexibility). Normalde asagida
		 * "age" variable'inin degeri 25'dir . Ama diger class'larda setAge() methodunu
		 * kullanarak age variable'inin degerini istedigimiz gibi degistirip
		 * kullanabiliriz. b) Reusability(Tekrar kullanabilirlik). getter ve setter
		 * method'larini bir kez olustururuz sonra prohe icindeki tum class'lardan
		 * istedigimiz kadar kullanabiliriz. c) Istedigimiz datayi getter() method'u
		 * olusturarak okunabilir hale getirebiliriz. Istedigimiz datayi getter()
		 * method'u olusturmayarak OKUNAMAZ hale getirebilirim. d) Istedigimiz datayi
		 * setter() method'u olusturarak degistirilebilir yapabiliriz. Istedigimiz
		 * datayi setter() method'u olusturmayarak DEGISTIRILEMEZ yapabiliriz. e)
		 * Kullanicinin kulandigi sistem arkasindaki karmasik yapiyi kullaniciya
		 * gostermez. Boylece kullanici yapmak istediklerini daha rahat yapar. Note :
		 * Tum variable'lar private ve sadece getter() methodlari olusturdum. Bu tarz
		 * bir class'da datalar sadece okunabilir ama degistirilemez. String'lerde
		 * degistirilemez yani immutable'dir . Bu tarz class'lara immutable class denir,
		 * yani Setter'i OLMAYAN classlara denir.
		 * 
		 * 5) Bir Class'da a) Tum variable'lar "private" ise b) Tum getter()'ler ve tum
		 * setter()'ler olusturulmus ise bu class " FULLY ENCAPSULATED" olarak
		 * adlandirilir.
		 * 
		 * 6) Getter() ve Setter() methodlarina ayni zamanda "Java Beans"da denir.
		 * 
		 */

	}

}
