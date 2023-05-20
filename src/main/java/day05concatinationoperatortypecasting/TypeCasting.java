package day05concatinationoperatortypecasting;

public class TypeCasting {

	/*
		Numeric primitive data type larini birbirine donusturulmesine "Type Casting" denilir.
		Numeric (sayisal) primitive Data type lar: byte - short - int - long - float - double
	*/
	// Note 1 : Kucuk data type larinin buyuk data type larina cevirmeyi java otomatik larak yapabilir.
	//          Bu isleme "Auto Widening" (Otomatik genisletme) denir.

	// Note 2 : Buyuk data type larini kucuk data type larina cevirmek riskli bir istir, java bu riskli
	//          isi ototmatik olarak yapmaz, bu isi kod yazanlar yaparlar.
	//          Bu isleme "Explicit Narrowing" (Aciktan daraltma) denir.


	public static void main(String[] args) {

		// byte data typeini int data type ina ceviriniz.
		byte age = 13 ;
		int ageInt = age ;

		// Int data type ini short data type ina ceviriniz.
		int weight = 333 ;
		short weightShort = (short) weight;

		// Int data type ini float data type ina cevirniz.
		int year = 1988 ;
		float yearFloat = year ;
		System.out.println(year);//1988
		System.out.println(yearFloat);//1988.0

		//Double data type ini short data type ina ceviriniz.
		double number = 12.99 ;
		System.out.println(number);//12.99

		short shortNumber = (short) number;
		System.out.println(shortNumber);//12

		// Ornek
		short num = 260 ;
		System.out.println(num);//260

		byte numByte = (byte) num;
		System.out.println(numByte);//4 = 260 / 256(byte cap range) = kalan 4 mod alma gibi

		// Note : Donusum yaptigimiz sayi (260), donusecegemiz data type inin sinirlari disinda ise
		//        java kullandimiz sayi ile "mod" islemi yapar ve mod isleminin sonucu bizim yeni degerimiz olur.



	}


}
