package day10ifstatements;

import java.util.Scanner;

public class HomeWork03 {

	/*
		HomeWork
		3- Ay sayisini verdiginizde ay ismini veren kodu giriniz.
			1 ==> January, 2 ==> Februray...
	*/

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz...");
		byte num = input.nextByte();

		if (num == 1) {
			System.out.println("January");
		} else if (num == 2) {
			System.out.println("February");
		} else if (num == 3) {
			System.out.println("March");
		} else if (num == 4) {
			System.out.println("April");
		} else if (num == 5) {
			System.out.println("May");
		} else if (num == 6) {
			System.out.println("June");
		} else if (num == 7) {
			System.out.println("July");
		} else if (num == 8) {
			System.out.println("August");
		} else if (num == 9) {
			System.out.println("September");
		} else if (num == 10) {
			System.out.println("October");
		} else if (num == 11) {
			System.out.println("November");
		} else if (num == 12) {
			System.out.println("December");
		} else {
			System.out.println("Hatali giris yaptiniz. Lutfen 1 ile 12 arasinda bir sayi giriniz...");
		}
	}


}
