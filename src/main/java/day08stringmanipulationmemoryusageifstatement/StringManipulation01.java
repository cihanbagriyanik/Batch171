package day08stringmanipulationmemoryusageifstatement;

public class StringManipulation01 {

	public static void main(String[] args) {

		// Ornek 1 : Bir String in hic character icermedigi (bos string oldugunu) kontrol eden kodu yaziniz.

		String str = "" ;
		boolean result1 = str.length() == 0 ;
		System.out.println("String bos mu = " + result1);


		// 2.Yol
		// Java eger bir konuda method olusturmussa, o methodu kullanmak en iyisidir.
		boolean result2 = str.isEmpty();
		System.out.println("Is empty = " + result2);

		System.out.println("**********");

		// Ornek 2 : Bir Stringin space haric hic bir character icermedigini kontrol eden kodu yaziniz.
		String t = "" ;
		// 1.Yol:
		boolean result3 = t.replace(" ", "").length() == 0 ;
		System.out.println(result3);

		// 2.Yol
		boolean result4 = t.replace(" ", "").isEmpty();
		System.out.println(result4);

		// 3.Yol
		boolean result5 = t.isBlank();
		System.out.println(result5);
		// isBlank() methodu sadece space iceren String ler icin true verir, space disinda bir character var ise false verir.
		// isBlank() methodu bos stringler icinde true verir
		// isBlank() methodu space + hic birsey icin true verir
		// isBlank() methodu sadece hic bir sey true verir

		System.out.println("**********");

		// Ornek 3 : Bir string de a,i,e characterlerinin ilk gorunumlerinin indexlerini toplamini ekrana yazdiriniz.
		// "Java is easy to learn" ==> 1 + 5 + 8 ==> 14
		// 0123456789......
		String r = "Java is easy to learn" ;
	 	int idxA = r.indexOf('a');
		System.out.println(idxA);//1

		int idxI = r.indexOf('i');
		System.out.println(idxI);//5

		int idxE = r.indexOf('e');
		System.out.println(idxE);//8

		System.out.println(idxA+idxI+idxE);//14

		System.out.println("**********");

		// Ornek 4 : Bir string deki "Java" kelime sinin ilk olarak kacinci index te kullanildigini gosteren kodu yaziniz.
		// "Ah Java vah Java sensiz olmuyor Java."
		// indexOf("Java") kullaniminda siz "Java" kelimesinin ilk gorunumundeki ilk harfin (yani J nin) index ini almis olursunuz.
		String u = "Ah Java vah Java sensiz olmuyor Java." ;

		int idxJava = u.indexOf("Java") ;
		System.out.println(idxJava);//3

		// indexOf() methodu olmayan characterler icin kullanilirsa her zaman -1 return eder.
		int idxjava = u.indexOf("java") ;
		System.out.println(idxjava);//-1 bulamadi cunku kucuk 'j

		System.out.println("**********");

		// Ornek 5 : Bir string de a,i,e characterlerinin son gorunumlerinin indexlerini toplamini ekrana yazdiriniz.
		//           0123456789
		String v = "Java is easy to learn" ;

		int idxOfa = v.lastIndexOf('a') ;
		System.out.println(idxOfa); // 18

		int idxOfe = v.lastIndexOf('e') ;
		System.out.println(idxOfe); //17

		int idxOfi = v.lastIndexOf('i') ;
		System.out.println(idxOfi); //5

		System.out.println(idxOfa+idxOfe+idxOfi); // 40

		// Note : lastIndexOf() methodu olmayan characterler icin kullanilirsa her zaman -1 verir.


	}
}
