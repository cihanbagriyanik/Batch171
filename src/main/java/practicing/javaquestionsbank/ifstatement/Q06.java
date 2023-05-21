package practicing.javaquestionsbank.ifstatement;

import java.util.Scanner;

public class Q06 {

	//M!l! km'ye, san!yey! saate, fahrenhaytı sant!grata çev!ren b!r dönüstürücü olusturmak !ç!n
	//kod yazınız. Google'dan dönüsümler !ç!n formüller! bulunuz.
	//a) Kullanıcı m!le deger!n! 10 ve operatorü m!ldenKmye olarak g!rd!g!nde, konsolda kodunuz
	//"16 km" yazmalıdır (sayı d!nam!k olacak)
	//b) Kullanıcı san!ye deger!n! 7200 ve operatorü san!yedenSaate olarak g!rd!g!nde, konsolda
	//kodunuz "2" yazmalıdır (sayı d!nam!k olacak)
	//c) Kullanıcı fahrenhe!t deger!n! 83 ve operatorü fahrenaytdanSant!garata olarak g!rd!g!nde,
	//konsolda kodunuz "28.3333 sant!grat" yazmalıdır (sayı d!nam!k olacak)

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in) ;

		System.out.println("Lutfen Km ye donusturmek istediginiz Mil degeri giriniz...");
		double mil  = input.nextDouble() ;

		System.out.println("Lutfen Celciusa donusturmek istediginiz Fahrenheit degeri giriniz...");
		double fahrenheit = input.nextDouble() ;

		System.out.println("Lutfen Hours a donusturmek istediginiz Second degeri giriniz...");
		double second = input.nextDouble() ;

		String operator = "1";


		if (operator.equals("1")) {
			System.out.println(mil + " Miles = " + (mil*1.60) + " Km");
		} else if (operator.equals("2")) {
			System.out.println(fahrenheit + " Fahrenheit = " + (fahrenheit-32)*(5/9) + " Celsius");
		} else if (operator.equals("3")) {
			System.out.println(second + " Second = " + (second/60/60) + " Hours");
		} else {
			System.out.println("Gecersiy bir deger girdiniz...");
		}


	}

}
