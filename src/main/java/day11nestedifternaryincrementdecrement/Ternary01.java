package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class Ternary01 {

	public static void main(String[] args) {

		//Ternary Statement
		// Ornek 1 : Sayi 10 dan kucuk ise console a "kucuk" yazdirin degil ise "kucuk degil" yazdrin
		//--------- if else cozumu----------

		int num = 3 ;

		if (num <10){
			System.out.println("Kucuk");
		} else {
			System.out.println("Kucuk degil");
		}

		//--------- Tenary cozumu---------
		//               Condition ? Condition true ise calisir : Condition false ise calisir ;
		   String sonuc = num <10  ?           "Kucuk"          :           "Buyuk"           ;
		System.out.println(sonuc);


		// Ornek 2 : Sayi cift sie kosola cift tek ise tek yazdirin...

		int digit = 3 ;
		// if - else
		if (digit%2 == 0){
			System.out.println("Cift");
		} else {
			System.out.println("Tek");
		}
		// ternary
		String result = digit%2 == 0  ? "Cift" : "Tek";
		System.out.println(result);


		// Ornek 3 : Sayi 0 dan buyuk sie kosola pozitif kucuk ise negatif yazdirin...
		int i = 7 ;
		System.out.println(i>0 ? "pozitif" : "negatif");


		// Ornek 4 : Kullanicidan iki sayi alini, Buyuk olmayan kucuk veya esit olan sayiyi yazdiriniz.

		Scanner input = new Scanner(System.in);
		System.out.println("Iki sayi giriniz...");
		double a = input.nextDouble();
		double b = input.nextDouble();

		// if - else
		if (a<b){
			System.out.println(a);
		}else{
			System.out.println(b);
		}

		//ternary
		System.out.println(a<b ? a :b);


	}
}
