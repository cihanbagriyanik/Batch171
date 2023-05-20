package day04scannerwrapper;

import java.util.Scanner;

public class Scanner05 {

	// Kulanicidan alacaganiz 5 basamakli bir sayinin ilk iki ve
	// son iki basamagindaki rakamlarin toplamini yazdiran kodu giriniz.

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Lutfen 5 basamakli birsayi giriniz.");
		int number = input.nextInt();

		// bir sayinin son rakamini alabilmek icin o sayiyi 10 bolup kalani almaliyiz.
		// % ==> modulus operator solunda bulunan sayinin saginda bulunan sayiya bolumunden kalanini verir.
		// Bir tam sayiyi bir tam sayiya bolerseniz java sonucu kesinlikle tamsayi yapar
		// Java yuvarlama yapmaz, ondalikli kismi iptal eder.
		// dolayisi ile bir tam sayiyi 10 a bolersek birler basamagini silmis oluyoruz.

		// Son rakami al
		int birlerBasamagi = number%10;
		// Sayi kucult
		number = number / 10 ;

		// Sondan ikinci rakam al
		int sondanikinci = number%10;
		// Sazi kucult
		number = number / 10;

		// Sondan ucuncu rakami al
		int sondanUcuncu = number % 10 ;
		//Sayi kucult
		number = number / 10 ;

		// Sondan dorduncu rakami al
		int sondanDorduncu = number%10 ;
		//Sayi kucult
		number = number / 10 ;

		// Sondan besinci rakami al
		int sondanBesinci = number%10 ;
		//Son rakam oldugun icin kucultmeye gerek yok.

		System.out.println( "ilk iki ve son iki rakamlarin toplami = " + (sondanBesinci+sondanDorduncu+sondanikinci+birlerBasamagi));




	}


}
