package day02datatypesmethodcreation;

public class MethodCreation01 {

	/*
	Java da method nasil olusturulur?

	1- Main methodu disinda classin icinde olusturulur.

	2- Access Modifier + Return type + Method ismi + () + {}
	 */

	
	/*
	Olusturulan metotlar nasil kullanilir?
	1- Metodu olsuturmak metodu calistirmak icin gerekli degildir.
	   Kullanmak istenen method Main methodun icinden kullanilir.
	2- Method un ismi + () yazin
	3- Varsa islem yapacaginiz datalari parantezin icine kayun.
	   Bu islem method call (method cargirma) olarak adlandirilir.
	4- Method name + parametreler ==> method signature
	 */



	public static void main(String[] args) {

		int sonuc1 = toplamaYap(3,5);
		System.out.println(sonuc1);
		
		long sonuc2 = multiply(5,12);
		System.out.println(sonuc2);

		System.out.println(firstTwoMultiplyThirdAdd(2,3,4));



	}


	// Ornek 1 : Toplama islemi yapan bir method olusturunuz.
	public static int toplamaYap (int a, int b){//{Bu kisimda method kapsaminda kullanilmasini ve islenmesini istedigim datalari deklare ediyoruz.}
		     return a+b;
			 // return demek bu methodun cagirildigi yere bu degeri return et demek.
	}
	// main method static oldugu icin main method icinde kullanacagimiz method static olmalidir.



	// Ornek 2 : 2 Sayiyi carpma islemi yapan bir method olusturun.
	protected static int multiply(int a, int b){
		return a*b;
	}



	// Ornek 3 : Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan bir method olusturun ve cagirin.
	private static int firstTwoMultiplyThirdAdd(int a, int b, int c){
		return (a*b)+c;
	}

}
