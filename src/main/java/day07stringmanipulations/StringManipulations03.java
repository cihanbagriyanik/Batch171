package day07stringmanipulations;

public class StringManipulations03 {

	public static void main(String[] args) {

		// Ornek 1 : Bir stringin bas ve sonunda space characteri varsa siliniz.
		// "   Ali Can   " ==> "Ali Can"

		String s = "   Ali Can   " ;
		System.out.println(s);
		// trim() mathodu bir Stringin bas ve sonunda space characterlerini siler, aradaki spacelere dokunmaz.
		String sTrimmed = s.trim() ;
		System.out.println(sTrimmed);


		// Ornek 2 : Asagidaki fiyatlari verilen urunlerin toplma fiyatini bulunuz.
		// String tv = "$456.99"
		// String laptop = "$875.99"
		// Toplam = "$1,332.98"
		String tv = "$456.99" ;
		String laptop = "$875.99" ;

		String tv2 = tv.replace("$" , "");
		System.out.println(tv2);

		String laptop2 = laptop.replace("$" , "");
		System.out.println(laptop2);

		Double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2) ;
		System.out.println(totalPrice);


		//Ornek 3 : Verilen isim ilk isminin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz.
		// "Ali Can" ==> AC
		String name = "   ali cAN   " ;
		char first = name.trim().toUpperCase().charAt(0) ;
		System.out.println(first); // A

		char last = name.trim().toUpperCase().split(" ")[1].charAt(0) ;
		System.out.println(last); // B

		System.out.println("" + first + last); // AC




	}
}
