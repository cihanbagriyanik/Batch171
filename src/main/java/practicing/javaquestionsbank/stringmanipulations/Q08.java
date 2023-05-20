package practicing.javaquestionsbank.stringmanipulations;

public class Q08 {

	//B!r Str!ng deg!sken! olusturunuz ve son karakter! dısındak! tüm karakterler!n! konsolda
	//büyük harfle yazdırınız.
	//Örnek: String 'Java' ise konsola 'JAV' yazdırmalısınız.

	public static void main(String[] args) {

		String name = "Antalya" ;

		System.out.println(name.toUpperCase().substring(0,name.length()-1));

	}
}
