package practicing.javaquestionsbank.ifstatement;

public class Q05 {

	//Asagıdak! seçenekler dogrultusunda gereken kodu yazınız.
	//a) B!r üçgen!n !k! kenarının uzunlugu es!tse "Ik!zkenar Üçgen".
	//b) B!r üçgen!n tüm kenarlarının uzunlugu es!tse "Eskenar Üçgen".
	//c) a ve b kosulları saglanmıyorsa "Çes!t Kenar Üçgen"

	public static void main(String[] args) {

		int a = 7 ;
		int b = 4 ;
		int c = 7 ;

		if (a == b && b == c && a == b){
			System.out.println("Eskenar Ucgen...");
		} else if (a == b || b == c || a == c) {
			System.out.println("Ikizkenar Ucgen...");
		} else {
			System.out.println("Cesitkenar Ucgen...");
		}

	}
}
