package day08stringmanipulationmemoryusageifstatement;

public class HomeWork02 {

	// 2- Bir string variable olusturunuz ve ilk karakter ile son karakter disindaki tum karakteri konsola buyuk harflerle yazdirin.

	public static void main(String[] args) {

		String str = "No pain, no gain.";
		String end = str.substring(1,str.length()-1).toUpperCase();
		System.out.println("ilk ve son haric, buyuk harf = " + end);

	}
}
