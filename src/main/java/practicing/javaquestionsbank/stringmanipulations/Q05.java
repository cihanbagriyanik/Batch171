package practicing.javaquestionsbank.stringmanipulations;

public class Q05 {

	//B!r Str!ng deg!sken! olusturunuz ve Str!ng deg!sken!n konsolda bosluk olmayan son
	//karakter! yazdırınız.
	//Örnek: 'Ali Can' için n yazdırmalısınız.
	//‘Miami’ için i yazdırmalısınız.

	public static void main(String[] args) {

		String name = " Suleymanoglu" ;
		System.out.println(name.trim().substring(name.length()-2));

		String name1 = " Husamettincindoruk" ;
		System.out.println(name1.trim().substring(name1.length()-2));

	}
}
