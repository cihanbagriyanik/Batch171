package practicing.javaquestionsbank.ifstatement;

public class Q03 {

	//Ayın numarasını g!rd!g!n!zde ayın adını yazdırmak !ç!n gereken kodu yazınız.
	//Örnek; 1 !ç!n çıktı: "Ocak", 2 !ç!n çıktı: "Subat" vb.

	public static void main(String[] args) {

		int monthNum = 3 ;

		if (monthNum == 1){
			System.out.println("Ocak");
		} else if (monthNum == 2) {
			System.out.println("Subat");
		} else if (monthNum == 3) {
			System.out.println("Mart");
		} else if (monthNum == 4) {
			System.out.println("Nisan");
		} else if (monthNum == 5) {
			System.out.println("Mayis");
		} else if (monthNum == 6) {
			System.out.println("Haziran");
		} else if (monthNum == 7) {
			System.out.println("Temmuz");
		} else if (monthNum == 8) {
			System.out.println("Agustos");
		} else if (monthNum == 9) {
			System.out.println("Eylul");
		} else if (monthNum == 10) {
			System.out.println("Ekim");
		} else if (monthNum == 11) {
			System.out.println("Kasim");
		} else if (monthNum == 12) {
			System.out.println("Aralik");
		} else {
			System.out.println("Hatali bir veri girdiniz...");
		}

	}

}
