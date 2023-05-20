package practicing.javaquestionsbank.ifstatement;

public class Q01 {

	//Asagıdak! seçenekler dogrultusunda gereken kodu yazınız.
	//a) Aralık, Ocak, Subat !ç!n "Kıs"
	//b) Mart, N!san, Mayıs !ç!n "Ilkbahar"
	//c) Haz!ran, Temmuz, Agustos !ç!n "Yaz"
	//d) Eylül, Ek!m, Kasım !ç!n "Sonbahar"
	//e) D!gerler! !ç!n "Geçers!z ay adı"

	public static void main(String[] args) {

		String month = "marT" ;

		if (month.equalsIgnoreCase("aralik") || month.equalsIgnoreCase("ocak") || month.equalsIgnoreCase("subat")){
			System.out.println("Kis");
		} else if (month.equalsIgnoreCase("mart") || month.equalsIgnoreCase("nisan") || month.equalsIgnoreCase("mayis")) {
			System.out.println("Ilkbahar");
		} else if (month.equalsIgnoreCase("haziran") || month.equalsIgnoreCase("temmuz") || month.equalsIgnoreCase("agustos")) {
			System.out.println("Yaz");
		} else if (month.equalsIgnoreCase("eylul") || month.equalsIgnoreCase("ekim") || month.equalsIgnoreCase("kasim")) {
			System.out.println("Sonbahar");
		} else {
			System.out.println("Gecersiz bir vere girdiniz lutfen kontrol ediniz...");
		}

	}
}
