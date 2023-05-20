package day08stringmanipulationmemoryusageifstatement;

public class HomeWork04 {

	//4- Tek kelimeli bir sehir ismi icin string variable olusturun ve sehir isminin ilk harfini buyuk harfle diger harflerini kucuk harflerle konsola yazdirin.

	public static void main(String[] args) {

		String city = "antalya";
		String first = city.substring(0,1).toUpperCase();
		String second = city.substring(1).toLowerCase();
		System.out.println(first+second);

	}
}
