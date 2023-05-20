package day08stringmanipulationmemoryusageifstatement;

public class StringManipulation02 {

	public static void main(String[] args) {

		// Ornek : Bir string in belli bir karakterinden baslayarak belirli bir karaktere kadar dynamic olarak yaziniz.
		//         abd@gmail.com ==> gmail

		String a = "abc@gmail.com" ;

		int startingIndex = a.indexOf('@') + 1 ;
		int endingIndex = a.indexOf('.') ;
		String companyName = a.substring(startingIndex,endingIndex);
		System.out.println("companyName = " + companyName); // companyName = gmail

		System.out.println("Hard coding ==> " + a.substring(4, 9));// Kotu tercih edilmez ... Olmasi gereken yukaridakidir.

		// Ornek 2 : Verilen iki  string in birbirinin aynisi olup olmadigini kontrol eden kodu yaziniz
		String h = "ali Can" ;
		String i = "Ali Can" ;

		boolean result = h.equals(i);
		System.out.println(result);// false

//________________________________________________________________________________________________________________________________________________________________
		// java da Memory kullanimi
		/*
		Javada iki tane memory vardir.
		1- Stack Memory ==> small
			a) Kucuk memorydir
			b) Primitive leri ve Non-Primitivelerina adreslerini (reference) tutar

		2- Heap memory ==> Huge
			a) Buyuk memorydir.
			b) Non-Primitive datalari icerir

	==> Java heap memory de yerlestirilen  tum Non-Primitive datalar icin bir adres olusturur
		ve bu adresi stack memory de saklar.
		*/


		/*
		Note : String lerin esitliklerini kontrol ederken "==" yerine "equals()" methodu kullaniriz.
		Neden kullaniriz?
		Cunku; "==" sembolu iki string i karsilastirirken hem adreslerine hemde degerlerine bakar,
		ikiside ayni ise stringler esittir de ama biz kod yazarken genellikleStringlerin adresleri ile degil degerleri ile
		ilgileniriz. Bu yuzden String karsilastirmalarinda "==" kullanmaliyiz.

		"equals()" methodu ise iki string i karsilastiriken sadece degerlerine bakar. degerleri ayni ise bu iki string
		esittir der, degerler farkli ise bu iki string farklidir der ki  bu bizim kod yazarken ihtiyac duydugumuz seydir.
		*/

		String s = "Tom" ;
		String t = "Terry";
		String r = new String("Tom");
		System.out.println(s==t); // false cunku adresler ve degerler farklidir.
		System.out.println(s.equals(t)); // false cunku degerler farkli.
		System.out.println(s==r); // false cunku adresler farkli.
		System.out.println(s.equals(r)); // true cunku equals() sadece degerlere bakar. "s" ve "r" nin degerleri ayni oldugunda true verir.
//________________________________________________________________________________________________________________________________________________________________

		// Ornek 3 : Verilen iki  string in birbirinin aynisi olup olmadigini buyuk harf kucuk harf dikkate almadan kontrol eden kodu yaziniz
		// equalsIgnoreCase() iki string in birbirinin aynisi olup olmadigini  buyuk harf kucuk harf dikkate almadan kontrol eder.

		String j = "ali Can" ;
		String k = "Ali Can" ;
		boolean result3 = j.equalsIgnoreCase(k);
		System.out.println(result3); // true

	}
}
