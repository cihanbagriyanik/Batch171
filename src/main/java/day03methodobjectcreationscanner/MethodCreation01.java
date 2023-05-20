package day03methodobjectcreationscanner;

import java.io.FilterOutputStream;

public class MethodCreation01 {

	public static void main(String[] args) {

		double cube = getCube(5);
		System.out.println("Kup = " + cube);

		print("Java is easy");

		// Method olusturmak icin ikinci yol
		// Ornek 2 Ikinci yol : Girilen bir kelimeyi yazdiran bir method olusturup kullaniniz.
		// Main method icinde iken method ta kullanilacak olan variable lari olusturunuz.
		String str = "TechproEdu";
		// Method ismi ve parametreleri yazariz
		// Kirmizi kismin uzerinde bekleyip create method a tiklariz intellij otomatik olarak bir method olusturur.
		// Daha sonra kendi istedigimize gore dizayn ederiz.
		printConsole(str);

		// Ornek 3 : Verilen iki tam sayisi carpan ve sonucu ekran yazdiran methodu olusturup kullaniniz.
		int a = 3;
		int b = 5;
		carpmaYap(a,b);

		// Ornek 4 : Verilen bir tamsayinin karesini hesaplayip console a yazdiran methodu olusturup kullaniniz.
		int sayi = 5;
		kareAl(sayi);


	}

	private static void kareAl(int sayi) {
		System.out.println(sayi*sayi);
	}

	private static void carpmaYap(int a, int b) {
		System.out.println(a*b);
	}

	// Ornek 1 : Verilen bir ondalik sayinin kupunu hesaplayan bot method olusturup kullaniniz.
	static double getCube (double a) {
		return a*a*a;
	}
	// Note : Access modifier i default yapmak isterseniz access modifier i yazmayiniz.




	// Ornek 2 : Girilen bir kelimeyi yazdiran bir method olusturup kullaniniz.
	public static void print (String str) {
		System.out.println(str);
	}
	// Eger bir method yeni bir data uretmiyor ise return type i void olur.
	// Method return type i void ise method body icinde return kayword yazilmaz.

	public static void printConsole(String str) {
		System.out.println(str);
	}

}

/*
HomeWork
1- Cemberin cevresini hesaplayan methodu olusturunuz ve kullaniniz.
2- Dairenin alanini hesaplayan methodu olusturunuz ve kullaniniz.
 */
