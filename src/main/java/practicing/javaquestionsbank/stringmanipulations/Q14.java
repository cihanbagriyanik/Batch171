package practicing.javaquestionsbank.stringmanipulations;

public class Q14 {

	//B!r Str!ng’ !n bel!rl! b!r tek karaktere sah!p olup olmadıgını üç farklı sek!lde kontrol etmek
	//!ç!n kod yazınız.

	public static void main(String[] args) {

		String name = "Antalyaaaa Cihan" ;

		boolean check1 = name.contains("z");
		System.out.println("check1 = " + check1);

		boolean check2 = name.replaceAll("[^g]" , "").length()>0;
		System.out.println("check2 = " + check2);

		boolean check3 = name.indexOf("C")!=-1;
		System.out.println("check3 = " + check3);


	}
}
