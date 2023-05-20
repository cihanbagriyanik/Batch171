package day08stringmanipulationmemoryusageifstatement;

public class HomeWork01 {
	/*
	HomeWork
	1- Bir string variable olusturunuz ve bu string deki rakam olmayan tum karakterlein sayisini konsola yazdiriniz.
	2- Bir string variable olusturunuz ve ilk karakter ile son karakter disindaki tum karakteri konsola buyuk harflerle yazdirin.
	3- Bir string variable olusturunuz ve bu string deki ilk ve son karakterlerin ASCII degerleri toplamini kosola yazdiriniz.
	4- Tek kelimeli bir sehir ismi icin string variable olusturun ve sehir isminin ilk harfini buyuk harfle diger harflerini kucuk harflerle konsola yazdirin.
	5- Asagidaki kurallara gore kullacinin girdigi passwordu kontrol ediniz.
		a) En az 6 karakter olsun.
		b) En az bir tane buyuk harf olsun
		c) En az bir tane kucuk harf olsun
		d) En az bir tane rakam olsun

	Note 1 : Once canli oturum sirasinda cozulen ornekleri yapiniz.
	Note 2 : Tum sorulari dinamik kodlarla cozulmelidir.
	Note 3 : Birbirinizin cozumlerini inceleyerek tavsiye de bulunabilir yada yardim isteyebilirsiniz.
	*/


	//1- Bir string variable olusturunuz ve bu string deki rakam olmayan tum karakterlein sayisini konsola yazdiriniz.

	public static void main(String[] args) {


		String str = "No pain, no gain.";
		int character = str.replaceAll("[ˆ0-9]","").length();
		System.out.println("characterNum = " + character);



	}
}
