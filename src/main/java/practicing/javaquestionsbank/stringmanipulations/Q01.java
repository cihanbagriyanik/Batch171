package practicing.javaquestionsbank.stringmanipulations;

public class Q01 {

	//1) Sadece tek b!r kel!meden olusan seh!r !s!mler! !ç!n b!r Str!ng deg!sken! olusturun. Seh!r
	//!sm!n!, bas harf! büyük ve d!ger tüm karakterler! küçük harfler olacak sek!lde konsolda
	//yazdırınız.
	//Örnek: mIAMI - Miami
	//miami - Miami
	//MIAMI - Miami
	//mIaMi - Miami vb.

	public static void main(String[] args) {

		String sehir = "anTaLyA" ;

		System.out.println(sehir.trim().toUpperCase().charAt(0) + sehir.trim().toLowerCase().substring(1));

	}
}
