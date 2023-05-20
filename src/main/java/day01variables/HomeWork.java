package day01variables;

public class HomeWork {

	// HomeWork
		/*
		1- 3 farkli data turunda variable olusturun ve bunlari farkli satirlarda yazdirin.
		2- Ulke ve Sehir isimleri icin iki variable olusturun ve bunlari yazdirin.
		3- Iki tamsayi turunde variable olusturun ve toplamini yazdirin.
		*/

	public static void main(String[] args) {

	System.out.println("1.Sorunun cozumu:");
	// 1. Soru Cozum:

	String studentsName = "Arthur";
	byte studentNote = 95;
	short stundentsNumber = 12345;
	System.out.print("Student Name : " + studentsName + "\nExam Note : " + studentNote + "\nStudent Number : " + stundentsNumber);


	System.out.println("\n*********************************");
	System.out.println("\n2.Sorunun cozumu:");
	// 2. Soru Cozum:

	String nameOfCountry = "Turkey" ;
	String nameOfCity = "Antalya" ;
	System.out.println("I am from " + nameOfCountry + ", " + nameOfCity + ".");


	System.out.println("\n*********************************");
	System.out.println("\n3.Sorunun cozumu:");
	// 2. Soru Cozum:

	int number1 = 50000;
	int number2 = 200000;
	System.out.println("Total : " + (number1+number2));


	}

}
