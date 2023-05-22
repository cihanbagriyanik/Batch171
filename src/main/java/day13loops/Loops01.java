package day13loops;

public class Loops01 {

	public static void main(String[] args) {

		//Ornek 1 :
		//Ekrana 5 kere hii yazdirin

		//1. Yol tavsiye edilmez

		System.out.println("Hii..");
		System.out.println("Hii..");
		System.out.println("Hii..");
		System.out.println("Hii..");
		System.out.println("Hii..");

		/*
		Code Standarts
		1) Tekrar (Repetition) olmamlıdır.
		2) Dynamic olmalıdır
		3) Tamir(Fix) ve update kolay yapılabilmelidir.
         */

		//2. Yol

		//Aynı adımlar tekrar takrar yapılması gerektiğinde "Loop" lar kullanilir.
		// 4 tane loop var a-for-loop, b-while-loop, do-while-loop, d-for-each-loop

		//a-for - loop
		/*
		for ( Baslangic degeri; Loopun calisma sarti; Arttirma/Eksiltme){
			//calisacak kodlar
		}
		*/
		// ( Baslangic degeri; Loopun calisma sarti; Arttirma/Eksiltme )
		for(     int i = 1;           i < 6;            i++  ){
			System.out.println("Hi");
		}


		//Ornek 2 : 11 den 14 e kadar tum sayilari ekrana yazdiran kodu  yaziniz
		// ( Baslangic degeri; Loopun calisma sarti; Arttirma/Eksiltme )
		for (     int i = 11;          i < 15;             i++){
			System.out.println(i);
		}

		//Ornek 3 : 40 dan 23 e kdr tum cift sayilari ekrana yazdiriniz
		for (int i = 40; i>22; i--){
			if (i%2==0){
				System.out.print(i + " ");
			}
		}

		System.out.println("\n");

		// Ornek 4 : 18 den 56 ya kdr tum tek sayilari ekrana yazdriniz
		for (int i = 18; i<57; i++){
			if (i%2!=0){
				System.out.print(i + " ");
			}
		}

	}
}
