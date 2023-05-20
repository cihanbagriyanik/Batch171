package day09ifstatements;

import java.util.Scanner;

public class IfStatements03 {

	public static void main(String[] args) {

		// Ornek : Kullanicinin vermis oldugu character buyuk harf ise buyuk harf , kucuk harf ise ekrana kucuk harf yazdirin.

		Scanner input = new Scanner(System.in) ;
		System.out.println("Bir karakter giriniz...");
		char ch = input.next().charAt(0) ;

		if (ch >= 'A' && ch <= 'Z'){
			System.out.println("Buyuk harf...");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println("Kucuk harf...");
		} else{
			System.out.println("Harf degil...");
		}

	}
}
