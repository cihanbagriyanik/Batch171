package practicing.questionsrepeating;

import java.util.Scanner;

public class Ternary01Repeat {

	public static void main(String[] args) {

		//Ternary Statement
		// Ornek 1 : Sayi 10 dan kucuk ise console a "kucuk" yazdirin degil ise "kucuk degil" yazdrin
		//--------- if else cozumu----------

		int sayi1 = 9 ;

		if (sayi1 < 10){
			System.out.println("Kucuk");
		} else {
			System.out.println("kucuk degil");
		}

		System.out.println("****************************");

		//--------- Tenary cozumu---------
		//               Condition ? Condition true ise calisir : Condition false ise calisir ;

		int sayi2 = 4 ;
		System.out.println(sayi2 < 10 ? "Kucuk" : "Kucuk degil");

		System.out.println("****************************");

		// Ornek 2 : Sayi cift sie kosola cift tek ise tek yazdirin...

		int sayi3 = 4 ;
		System.out.println(sayi3%2 == 0 ? "cift" : "tek");

		System.out.println("****************************");

		// Ornek 3 : Sayi 0 dan buyuk sie kosola pozitif kucuk ise negatif yazdirin...
		int sayi4 = 0 ;
		System.out.println(sayi4>0 ? "pozitif" : "negatif");

		System.out.println("****************************");

		//Ornek 4: Kullanicidan iki sayi aliniz "buyuk olmayan" (kucuk veya esit olan) sayiyi yazdiriniz

		Scanner input = new Scanner(System.in) ;
		System.out.println("Lutfen iki sayi giriniz...");
		int a = input.nextInt();
		int b = input.nextInt();

		System.out.println(a<=b  ? a : b);


	}
}
