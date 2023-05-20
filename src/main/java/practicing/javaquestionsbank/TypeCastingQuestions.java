package practicing.javaquestionsbank;

public class TypeCastingQuestions {

	/*
	1) Short data tipinde bir degisken olusturunuz ve onu bir int degiskenine dönüstürünüz.

	2) Long data tipinde bir degisken olusturunuz ve onu bir int degiskenine dönüstürünüz.

	3) Double data tipinde bir degisken olusturunuz ve onu bir float degiskenine dönüstürünüz.

	4) Double data tipinde bir degisken olusturunuz ve onu bir short degiskenine dönüstürünüz.
	   Sonrasında bu short degiskenin degerini konsolda yazdırınız.
	   Not : Çıktıya dikkat ediniz, ondalık bir deger olmayacaktır.

	5) Byte data tipinde bir degisken olusturunuz ve onu bir double degiskenine dönüstürünüz.
       Sonrasında bu double degiskenin degerini konsolda yazdırınız.
       Not : Çıktıya dikkat ediniz, ondalık bir deger olmayacaktır.
	*/

	public static void main(String[] args) {

		System.out.println("Quesiton 1");

		short a = 23 ;
		int b = a ;

		System.out.println("*****************************************");
		System.out.println("Quesiton 2");

		long c = 129087 ;
		int d = (int) c;

		System.out.println("*****************************************");
		System.out.println("Quesiton 3");

		double t = 123.987 ;
		float k = (float) t;

		System.out.println("*****************************************");
		System.out.println("Quesiton 4");

		double x = 12.98 ;
		short y = (short) x;
		System.out.println(y);

		System.out.println("*****************************************");
		System.out.println("Quesiton 5");

		byte h = 23 ;
		double q = h;
		System.out.println(q);

		System.out.println("*****************************************");





	}
}
