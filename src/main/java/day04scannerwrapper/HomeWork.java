package day04scannerwrapper;

import java.util.Scanner;

public class HomeWork {

	/*
	HomeWork
	1- Kullanicidan aldiginiz 3 tane sayinin ortalamasini bulan kodu yaziniz.
		// Ornegin => 3,5,7 icin otalama (3+5+7) / 3 = 5
	2- Kullanicidan aldiginiz 3 basamakli bir sayinin rakamlari toplamini bulunuz.
		// Ornegin => 312 icin 3+1+2 = 6
	*/

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Lutfen 3 adet sayi giriniz...");

		int firtNum = input.nextInt();
		int secondNum = input.nextInt();
		int thirdNum = input.nextInt();

		System.out.println("Bu 3 sayinin ortalamasi = " + (firtNum + secondNum + thirdNum) / 3);

		System.out.println("*****************************************************************************************");

		System.out.println("Lutfen 3 basakmali bir sayi giriniz?");

		int threeDigitNum = input.nextInt();

		int firstDigit = threeDigitNum%10;
		threeDigitNum = threeDigitNum / 10 ;


		int secondDigit = threeDigitNum%10;
		threeDigitNum = threeDigitNum / 10 ;


		int thirdDigit = threeDigitNum%10;

		System.out.println("Bu 3 basamakli sayinin rakamlarinin toplami = " + (firstDigit+secondDigit+thirdDigit));



	}
}
