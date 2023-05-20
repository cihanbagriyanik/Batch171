package practicing.javaquestionsbank.stringmanipulations;

public class Q11 {

	//B!r Str!ng’ !n basında ve sonunda bosluk karakter! olup olmadıgını kontrol etmek !ç!n kod
	//yazınız.
	//Örnek: ‘ Ali ’ için kodunuz konsolda false yazmalıdır
	//‘Ali’ için kodunuz konsolda true yazmalıdır

	public static void main(String[] args) {

		String s = "Tom ";
		String trimlenmis = s.trim();
		Boolean sonuc = s.equals(trimlenmis);
		System.out.println("basinda ve sonunda bosluk var mi : " + sonuc);



		/*
		String name = "cihan" ;

		System.out.println(name.equals("! "));
		*/
	}
}
