package practicing.javaquestionsbank;

import java.util.Scanner;

public class VariablesQuestions {

	/*
	1- Herhangi bir 3 ögenin fiyatları için double data tipinde degiskenler olusturunuz.
	   Fiyatların toplamını konsola yazdırınız.

	2- Herhangi bir 3 öge için float, long ve Integer data tipinde degiskenler olusturunuz.
	   Bu degiskenlerin degerlerinin çarpımını konsolda yazdırınız.

	3- Basit faizi bulmak için bir kod yazınız.
	   Not: Basit faiz formülü = anapara * oran * yılDegeri /100

	4- Bir String ve iki long data tipinde degisken olusturunuz.
	   Konsolda bu long degiskenlerin toplamını ve çarpımını String ile yazdırınız.

	5- Degerleri farklı olan iki boolean data tipinde degisken olusturunuz ve bu degerleri iki
	   ardısık deger arasında bosluk bırakacak sekilde aynı satırda yazdırınız.

	6- 3 öge (kitap, defter ve laptop) fiyatı için long data tipinde degiskenler olusturunuz.
	   Konsolda 2 kitap, 4 defter ve 3 laptop için toplam fiyatını yazdırınız.

	7- Iki tamsayıyı degistirmek için bir kod yazınız.
	   Note : Scanner scan = new Scanner(System.in);
			  System.out.println("2 sayi giriniz :");
			  double n1 = scan.nextDouble();
              double n2 = scan.nextDouble();
              System.out.println("Degistirmeden once : " + n1 + " - " + n2);
	*/

	public static void main(String[] args) {

		System.out.println("Quesiton 1");
		double shirt = 33.49 ;
		double pants = 48.99 ;
		double tshirt = 23.79;
		System.out.println("Total Price = " + (shirt + pants + tshirt));

		System.out.println("*****************************************");

		System.out.println("Question 2");
		float x = 5.5F;
		long y = 1000 ;
		int z = 5000 ;
		System.out.println("Result of multiplication = " + (long)(x*y*z));

		System.out.println("*****************************************");

		System.out.println("Question 3");
		int mainMoney = 1000 ;
		int percent = 10 ;
		int year = 7 ;
		System.out.println("Interest = " + (mainMoney*percent*year/100));

		System.out.println("*****************************************");

		System.out.println("Question 4");
		String city = "Antalya" ;
		long populations = 2000000 ;
		long exPopulation = 1000000 ;
		System.out.println(city+"'s populations was in 2013 " + exPopulation + " but i one year, it has doubled and become likes a " + populations + ".");

		System.out.println("*****************************************");

		System.out.println("Question 5");
		boolean xy = true ;
		boolean yx = false ;
		System.out.println(xy + " " + yx);

		System.out.println("*****************************************");

		System.out.println("Question 6");
		long bookPrice = 75 ;
		long notebookPrice = 25 ;
		long pcPrice = 950 ;
		System.out.println("I bought 2 books, 4 notebooks and 3 laptop and I paid for all " + ((bookPrice*2) + (notebookPrice*4) + (pcPrice*3)) + "$." );

		System.out.println("*****************************************");

		System.out.println("Question 7");
		Scanner scan = new Scanner(System.in);
		System.out.println("2 sayi giriniz :");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		System.out.println("Degistirmeden once : " + n1 + " - " + n2);

		double temp = n1;
		n1 = n2;
		n2 = temp;
		System.out.println("Degistirdiktan sonra: " + n1 + " - " + n2);

	}

}
