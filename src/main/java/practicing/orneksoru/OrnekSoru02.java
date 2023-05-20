package practicing.orneksoru;

import java.util.Scanner;

public class OrnekSoru02 {

	//Soru 2
//Girilen ayin ismine gore mevsimi veren kodu yaziniz.
//Aralik-ocak-subat ==>KIS\
// mart -nisan mayis==>ilkbahar
//haziran -temmuz agustos ==>yaz
//eylul -ekim -kasim==>sonbahar
//input ==> Ocak output==> Kis

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in) ;

		System.out.println("Lutfen bir ay ismi giriniz...");

		String ay = input.next() ;

		if (ay.equalsIgnoreCase("Aralik") || ay.equalsIgnoreCase("Ocak") ||ay.equalsIgnoreCase("Subat")) {
			System.out.println("Kis");
		} else if (ay.equalsIgnoreCase("Mart") || ay.equalsIgnoreCase("Nisan") ||ay.equalsIgnoreCase("Mayis")) {
			System.out.println("Ilkbahar");
		} else if (ay.equalsIgnoreCase("Haziran") || ay.equalsIgnoreCase("Temmuz") ||ay.equalsIgnoreCase("Agustos")) {
			System.out.println("Yaz");
		} else if (ay.equalsIgnoreCase("Eylul") || ay.equalsIgnoreCase("Ekim") ||ay.equalsIgnoreCase("Kasim")) {
			System.out.println("Sonbahar");
		} else {
			System.out.println("Gecersiz bir veri girdiniz...");
		}
	}
}
