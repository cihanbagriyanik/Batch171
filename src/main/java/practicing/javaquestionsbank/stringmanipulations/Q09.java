package practicing.javaquestionsbank.stringmanipulations;

public class Q09 {

	//B!r Str!ng deg!sken! olusturunuz ve konsolda !lk karakter ve son karakter dısındak! tüm
	//karakterler! büyük harflerle yazdırınız.
	//Örnek: String 'Java' ise konsolda 'AV' yazdırmalısınız.

	public static void main(String[] args) {

		String name = "Antalya" ;

		System.out.println(name.substring(1,name.length()-1).toUpperCase());

	}
}
