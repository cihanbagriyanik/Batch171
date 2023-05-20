package practicing.javaquestionsbank.stringmanipulations;

public class Q15 {

	//Str!ng gomlekF!yat = ‘$12.99’;
	//Str!ng k!tapF!yat = ‘$35.99’;
	//Gömlek ve k!tap f!yatlarının toplamını bulmak !ç!n gereken kodu yazınız.

	public static void main(String[] args) {

		String gomlekFiyat = "$12.99" ;
		String kitapFiyat = "$35.99" ;

		String a = gomlekFiyat.replaceAll("[$]","");
		String b = kitapFiyat.replaceAll("[$]","");

		double sonA = Double.valueOf(a);
		double sonB = Double.valueOf(b);

		System.out.println("Total = " + (sonA + sonB));

	}
}
