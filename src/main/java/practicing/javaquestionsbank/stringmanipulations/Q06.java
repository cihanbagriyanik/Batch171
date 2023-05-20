package practicing.javaquestionsbank.stringmanipulations;

public class Q06 {

	//B!r Str!ng deg!sken! olusturunuz ve Str!ng'!n !lk ve son karakterler!n!n ASCII degerler!n!n
	//toplamını bulunuz.

	public static void main(String[] args) {

		String city = "Antalya" ;

		int last = city.length()-1 ;

		int firstCityAscii = city.charAt(0) ;

		int lastCityAscii = city.charAt(last);

		System.out.println("ASCII degerlerinin toplami = " + ( firstCityAscii+lastCityAscii ));



	}
}
