package practicing.javaquestionsbank.stringmanipulations;

public class Q10 {

	//B!r Str!ng !n ortadak! herhang! b!r konumda yalnızca tek b!r bosluk karakter! olup
	//olmadıgını kontrol etmek !ç!n kod yazınız.
	//Örnek: ‘Ali Can’ için konsolda false yazmalıdır.
	//‘ Ali Can ’ için konsolda false yazmalıdır.
	//‘ Ali Can ’ için konsolda false yazmalıdır.
	//‘Ali Can’ için konsolda true yazmalıdır.

	public static void main(String[] args) {

		String s = " Tom Hanks";
		String trimlenmis = s.trim();
		String hicBoslukYok = trimlenmis.replaceAll("\\s", "");
		Boolean ortadaTekBoslukVarMi = trimlenmis.length() - hicBoslukYok.length()==1;
		System.out.println("ortada tek bosluk var " + ortadaTekBoslukVarMi);




		/*
		String name = "Cihan Bagriyanik" ;

		String trimlenmis = name.trim();
		String hicBoslukYok = trimlenmis.replaceAll("\\s", "");

		Boolean ortadaTekBoslukVarMi = trimlenmis.length() - hicBoslukYok.length()==1;

		System.out.println("ortada tek bosluk var " + ortadaTekBoslukVarMi);
*/



	}
}
