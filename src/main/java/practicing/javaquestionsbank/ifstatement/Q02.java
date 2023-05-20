package practicing.javaquestionsbank.ifstatement;

public class Q02 {

	//Asagıdak! seçenekler dogrultusunda gereken kodu yazınız.
	//a) S!fre bosluk karakter!nden farklı en az 8 karakter !çer!yorsa "Geçerl! S!fre"
	//b) Herhang! b!r poz!syonda s!frede bosluk karakter! varsa "S!frede bosluk karakter! kullanmayınız"
	//c) a ve b kosullarının saglanmaması durumunda "Geçers!z S!fre"
	//Not: Çözümdeki kosulların sıralarına dikkat ediniz.

	public static void main(String[] args) {

		String psw = "sfewe23jcs.a";

		if (psw.replaceAll("\\S", "").length()>0){
			System.out.println("Sifrede bosluk karakteri kullanmayiniz...");
		} else if (psw.replaceAll("\\s", "").length()>=8){
			System.out.println("Gecerli Sifre...");
		} else {
			System.out.println("Gecersiz Sifre...");
		}

	}
}
