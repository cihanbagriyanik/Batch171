package day01variables;

public class Variables01 {

	public static void main(String[] args) {

		// Variable masil olusturulur?
		// Data type + variable name + Assignment Operator(atama operatoru) + Variable degeri + noktali virgul
		      int             age                         =                          13                ;



		// Java cumlesi => statement
		// Dilbilgisindeki noktali ne ise javadaki noktali virgul ayni seydir, yani statement in bittigini gosterir.
		// Eger variable declaration yapar, Assignment yapmazsaniz  java kendi default  degerlerini koyar.
		// Default deger sayilar icin sifirdir ( 0 ).
		// Java da " = " assignment operator dur. ve Java bu operatoru gordugu zaman once sag tarafi calistirir.
		// ve sagdaki deger alir soldaki kutuya koyar.
		// Java da esittir demek " == " .     /    Matematikte  " = " .     /   Java da " == " .
		// Data type + variableName ==> Variable decleration
		// Assignment Operator (=) + Variable degeri ==> Assignment


		/*
		Java da temelde  iki tip data vardir;
			1) primitive data type:
				char, boolean, byte, short, int, long, float, double
			2) non - primitive data type:
				String
		*/


		// Ornek 1: Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz?
		// Data type + variable name + Assignment Operator(atama operatoru) + Variable degeri + noktali virgul
		     String      ogrenciAdi                       =                       "Ali Can"            ;

		// Stringlere verilen degerler daime cift tirnak icinde yazilmalidir.
		// String ler icin " default value " (==> varsayilan deger) null " dir.
		/*
		String bir variable olusturdugumuzda cogu zaman ine bir deger atariz. Atama yapmazsak, java o variable
		varsayilan deger olarak null koyar.
		 - null demek 0 demek degildir, 0 da coding te bir degerdir, null hiclik demektir.
		 - icinde variable yada method bulunmayan bos bir obje demektir.
		 */



		// char data type
		// TEK karakter icin kullanilir.  Sayi, Sembol yada harf farketmez.
		// Ornegin ==> A , x , ? , 5 , ...
		// Ornek 2: char data ditipinde bir ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz.
		char isminIlkHarfi = 'A' ;
		// Note = char data type inda degerler daima tek tirnak icinde yazilmalidir.



		// boolean data type
		// boolean lar sadece iki farkli deger alabilir; ( true or false )
		// o yuzden isimlerdirme yapilirken ingilizce olarak mi? soru eki anlaminda basina is konulur.
		// Ornek 3 : boolean data tipinde emeklimisin sorusu icin bir variable olusturun ve false gederini atayin.
		boolean isRetired = false ;



		// byte data type
		// tam sayilir icin kullanilir ve hafizada 1 byte yer kaplar.
		// byte : -128 den +127 e (dahi) kadar tamsayi degerleri icin kullanilir.
		// Ornek 4 : byte data tipine ogrenci yasi icin bir variable olusturunuz ve deger atayiniz.
		byte studentAge = 18 ;



		// short data type
		// tam sayilir icin kullanilir ve hafizada 2 byte yer kaplar.
		// short : -32768 den +32767 e (dahi) kadar tamsayi degerleri icin kullanilir.
		// Ornek 5 : short data tipine site nufusu icin bir variable olusturup deger olusturunuz.
		short condoPopulation = 1300 ;



		// int data type
		// tam sayilir icin kullanilir ve hafizada 4 byte yer kaplar.
		// int : -2,147,483,648 den 2,147,483,647 (dahi) kadar tamsayi degerleri icin kullanilir.
		// Ornek 6 : int data tipine ulke nufusu icin bir variable olusturup deger olusturunuz.
		int populationsOfCountry = 90000000 ;



		// long data type
		// tam sayilir icin kullanilir ve hafizada 8 byte yer kaplar.
		// int : -9,223,372,036,854,775,808 den 9,223,372,036,854,775,807 (dahi) kadar tamsayi degerleri icin kullanilir.
		// Ornek 7 : long data tipine hucre sayisi icin bir variable olusturup deger olusturunuz.
		long numberOfCells = 1235489127452346652L ;
		// Note : Bir deger long ise sonuna buyuk " L " ( Buyuk L tavsiye edilir )  veya " l " konulur.
		// Eger longa atanilan deger int araliginda ise sonuna L koymaya gerek yok. ve Java onu int kabul ediyor.
		long weightOfSun = 1231782641 ;



		// float data type
		// float virgullu sayilar (Decimal Number => ondalikli sayilar) icin kullanilir ( fiyatlandirma - 12.99)
		// ondalikli sayilir icin kullanilir ve hafizada 4 byte yer kaplar.
		// int : Sufficient for storing 6 to 7 decimal digits (dahi) kadar degerleri icin kullanilir.
		// Ornek 8 : Gomlek ve ayakkabi fiyatlari icin  iki tane variable olusturunuz.
		float shirtPrice = 59.99F ;
		float shoePrice = 99.99f ;
		// Java ondalikli sayilari otomatik olarak doule olarak kabul eder.
		// float da israrci isek sayinin sonuna f koymak zorundayiz.
		// Cok kullanilmaz genellikle double tercih edilir.



		// double data type
		// double virgullu sayilar (Decimal Number => ondalikli sayilar) icin kullanilir ( fiyatlandirma - 12.9999999999)
		// ondalikli sayilir icin kullanilir ve hafizada 8 byte yer kaplar.
		// int : Sufficient for storing 15 decimal digits (ondalikli kismi icin daha fazla rakam alabilir)
		// Ornek 9 : Hucre agirligi ve Amipin agirligi icin iki tane variable olusturunuz.
		double cellWeight = 0.991298746 ;
		double weightAmip = 0.99568214889 ;



		// Ornek 10 : Ogrenci notlari icin iki adet variable olusturunuz, toplamlarini ve ortalamasini ekrana yazdirtiniz

		byte studentGrade = 70 ;
		byte studentGrade2 = 100 ;
		byte examNumber = 2;

		System.out.println("Student Grades Total : " + (studentGrade + studentGrade2));
		System.out.println("Avarage of Grades : " + (studentGrade + studentGrade2) / examNumber);






	}

}