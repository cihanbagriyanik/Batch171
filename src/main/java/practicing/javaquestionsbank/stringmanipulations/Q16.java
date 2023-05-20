package practicing.javaquestionsbank.stringmanipulations;

public class Q16 {

	//Ver!len b!r !sm!n adının ve soyadının bas harfler!n! almak !ç!n kodu yazınız.
	//Not: Ikinci isim kapsam dısındadır.
	//Örnek: Tom Hanks ==> TH, Mary Star ==> MS

	public static void main(String[] args) {

		String name = "Sopio Kimeridze" ;

		System.out.println("Ismin bas ve son harfi : " + name.trim().toUpperCase().charAt(0) + name.trim().toUpperCase().charAt(name.lastIndexOf(" ")+1));

	}
}
