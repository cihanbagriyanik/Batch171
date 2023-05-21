package practicing.javaquestionsbank.ifstatement;

public class Q07 {

	//Tam !s!m !ç!n d!lb!lg!s! kurallarını kontrol etmek !ç!n kodu yazınız.
	//a) Kodunuz "al! Can", "Al! can", "al! can" !ç!n "Bas harfler!nde hata" yazmalıdır.
	//b) Kodunuz, asagıdak! g!b! tek kel!meler !ç!n "Ad veya soyadı eks!k" yazmalıdır.
	//c) "Al!" veya "Can" veya "al!"Kodunuz "ALI CAN" g!b! tüm formatlar !ç!n "Format hatası" yazmalıdır.
	//d) Kodunuz b!r veya daha fazla bosluk (" " veya " " g!b! karakterler) !ç!n " Is!m g!r!lmed!"
	//   yazmalıdır.
	//e) Ad, harfler ve bosluktan baska herhang! b!r karakter! !çer!yorsa, kodunuz "Geçers!z Ad"
	//   yazmalıdır.
	//Not : Kısaltmada 1'den fazla hata varsa, ilgili tüm hata mesajları çıktı olarak konsolda
	//      görünmelidir. Örnegin; "ali3" için kodunuz "Bas harflerinde hata", "Ad veya soyadı eksik" ve
	//      "Geçersiz Ad"

	public static void main(String[] args) {

		String name = "Cihan Bagriyanik" ;

		String isimIlkHarf = name.substring(0,1) ;

		int bosluk = name.trim().indexOf(" ");

		String soyisimIlkHarf = name.substring(bosluk+1,bosluk+2) ;







	}
}
