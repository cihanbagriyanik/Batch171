package practicing.javaquestionsbank.stringmanipulations;

public class Q04 {

	//B!r Str!ng deg!sken! olusturunuz, Str!ng'dek! rakam olmayan karakterler!n sayısını
	//konsolda yazdırınız.
	//Örnek: String: '1a3Bcf4!...' ise konsolda 8 yazdırmanız gerekir.

	public static void main(String[] args) {

		String name = "dfga897234nkfdlg09234.,/';!@" ;
		System.out.println(name.replaceAll("[0-9]","").length());

	}
}
