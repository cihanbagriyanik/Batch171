package practicing.orneksoru;

import java.util.Scanner;

public class OrnekSoru01 {

//Soru 1
//Girilen ayin sayisina gore mevsimi veren kodu yaziniz.(1-12) geri kalanlar olasiliklar icin hata mesaji verilen kodu yaziniz
	//12 -1 -2 ==>KIS
	//3-4-5==>ilkbahar
	//6-7-8  ==>yaz
	//9-10-11==>sonbahar
	//input ==> 2 output==> Kis

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in) ;

		System.out.println("Lutfen 1-12 arasinda istediginiz aya denk gelicek bir deger giriniz...");

		byte ay = input.nextByte() ;

		if ( ay < 0 && 12 > ay){
			System.out.println("Lutfen 1-12 arasinda bir ay'a denk gelecek bir deger giriniz...");
		} else if (ay == 12 || ay == 1 || ay == 2) {
			System.out.println("Kis");
		} else if (ay == 3 || ay == 4 || ay == 5) {
			System.out.println("Ilkbahar");
		} else if (ay == 6 || ay == 7 || ay == 8) {
			System.out.println("Yaz");
		} else if (ay == 9 || ay == 10 || ay == 11) {
			System.out.println("Sonbahar");
		} else {
			System.out.println("Gecersiz bir deger girdiniz...");
		}
	}
}
