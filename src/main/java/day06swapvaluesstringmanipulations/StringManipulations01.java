package day06swapvaluesstringmanipulations;

public class StringManipulations01 {

	public static void main(String[] args) {

		// String bir non-primitive data type dir ve ayni zamanda bir class dir.

		String s = "Java is easy" ;


		//Ornek 1 : "s" String indeki tum characterleri buyuk harf yapiniz.
		String sUpper = s.toUpperCase();
		System.out.println(sUpper);//JAVA IS EASY


		//Ornek 2 : "s" String indeki tum characterleri kucuk harf yapiniz.
		String sLower = s.toLowerCase();
		System.out.println(sLower);//java is easy


		//Ornek 3 :"s" String indeki ilk characteri aliniz.
		char firstChar = s.charAt(0) ;
		System.out.println(firstChar);//J


		// Ornek 4 : "s" String indeki ikinci ve sondan ikinci character lerdeki aliniz ve ekrana yazdiriniz.
		char secondChar = s.charAt(1) ;
		System.out.println(secondChar);
		char secondLastChar = s.charAt(10) ;
		System.out.println(secondLastChar);
		System.out.println(secondChar+secondLastChar);// 212 ascii degerleri toplami
		System.out.println(""+ secondChar+secondLastChar);//as String ile basliyor string okuyor


		//Ornek 5 : "s" String inde kullanilna toplam character sayisini bulunuz.
		int sLength = s.length() ;
		System.out.println(sLength);//12


		// Ornek 6 : "s" String indeki ilk 4 characteri aliniz.
		// subString (0,4) ==> ilk index dahil, ikinci index haric bir sekilde calisiyor.
		String sSubstring = s.substring(0,4) ;
		System.out.println(sSubstring);//Java


		// Ornek 7 : "s" String indeki son 4 characteri aliniz.
		String is = s.substring(5,7);
		System.out.println(is);//is


		// Ornek 7 : "s" String indeki easy kelimesini aliniz.
		String easy = s.substring(8,12) ;
		System.out.println(easy);//easy

		// 2. YOL
		// Bir character den baslayip String in sonuna kadar almak isterseniz, ikinci indexi yazmayin.
		// substring(8,12); yerine substring(8); yazdik boylece baslangic indexinden itibaren sonuna kadar aldik.
		String sub4 = s.substring(8);
		System.out.println(sub4);//easy


		// Ornek 9 : "s" String inde "money" kelimesinin var olup olmadigini kontrol edeiniz.
		boolean checkMoney = s.contains("money") ;
		System.out.println(checkMoney);//false

		boolean checkIs = s.contains("is") ;
		System.out.println(checkIs);//true


		// Ornek 10 : "s" String nin belli bir harf ile baslayip baslamadigini kontrol ediniz.

		boolean isStart = s.startsWith("java") ;
		System.out.println(isStart);//false
		boolean isStart1 = s.startsWith("Java") ;
		System.out.println(isStart1);//true


		// Ornek 11 : "s" String nin bir characterden itibaren belli bir harf ile baslayip baslamadigini kontrol ediniz.
		// Soru : 5. index dahil olmak uzere i characteri ile baslayip baslamadigini kontrol ediniz.
		boolean isBegin = s.startsWith("i", 5) ;
		System.out.println(isBegin);//true
		// Soru : 3. index dahil olmak uzere a characteri ile baslayip baslamadigini kontrol ediniz.
		boolean isBegin1 = s.startsWith("a", 3) ;
		System.out.println(isBegin1);//true


	}
}



















