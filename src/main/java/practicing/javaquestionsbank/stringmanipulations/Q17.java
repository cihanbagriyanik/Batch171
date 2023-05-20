package practicing.javaquestionsbank.stringmanipulations;

public class Q17 {

	//B!r Str!ng’ de kullanılan noktalama !saretler!n!n sayısını bulmak !ç!n b!r kod yazınız.

	public static void main(String[] args) {

		String x = "Once zaman sonra, hersey yavas yavas yoluna girmyeye basladi! Zaman icinde hersey daha guzel olucak..." ;

		int all = x.length();

		System.out.println("Kullanılan noktalama isaretlerinin sayisi :  " + (all - x.replaceAll("[\\p{Punct}]","").length() ));

	}
}
