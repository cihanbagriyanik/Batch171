package day09ifstatements;

import java.util.Scanner;

public class IfStatements02 {

	public static void main(String[] args) {

		//Ornek : Kullanicidan alinan bir sayinin tek mi, cift mi oldugunu yazdiran kodu olusturunuz.

		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bir sayi girniz...");

		int num = input.nextInt() ;

		//1.Yol
		/*
		if (num % 2 == 0){
			System.out.println("Cift sayidir...");
		}
		if (num % 2 != 0){
			System.out.println("Tek sayidir...");
		}
		*/

		//2.Yol
		if (num % 2 == 0){
			System.out.println("Cift sayidir...");
		}else {
			System.out.println("Tek sayidir...");
		}

	}
}
