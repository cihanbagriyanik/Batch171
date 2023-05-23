package practicing.questionsrepeating;

import java.util.Scanner;

public class Switch03Repeat {

	public static void main(String[] args) {

		//Example 1: Kulanicidan iki sayi ve yapilacak islemi alan ve +, -, *, /, % islemlerini yapan kodu yaziniz

		Scanner input = new Scanner(System.in) ;

		System.out.println("Lutfen iki sayi giriniz...");
		double a = input.nextInt() ;
		double b = input.nextInt() ;

		System.out.println("Yapilacak islemi lutfen giriniz... (+ , - , * , / , %)");
		char x = input.next().charAt(0) ;

		switch (x) {
			case '+' :
				System.out.println("Toplami =" + (a+b));
				break;
			case '-' :
				System.out.println("Farki =" + (a-b));
				break;
			case '*' :
				System.out.println("Carpimi =" + (a*b));
				break;
			case '/' :
				System.out.println("Bolumu =" + (a/b));
				break;
			case '%' :
				System.out.println("Yuzdesi =" + (a*b / 100));
				break;
			default:
				System.out.println("Gecersiz bir veri girdiniz....");
		}
	}
}
