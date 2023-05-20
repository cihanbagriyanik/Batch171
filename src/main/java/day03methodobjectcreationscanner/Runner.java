package day03methodobjectcreationscanner;

public class Runner {

	public static void main(String[] args) {

		// Obje nasil olusturulur?
		// New keywordu sifirdan yeni bir object olusturmak icin kullanilir.
		// Constructor java da objeleri olusturmak icin kullanilan ozel bir methodtur.
		// Class ismi + Obje ismi + Assingment Operator + "new" keywordu + Constructor
		       Car        myCar               =                new            Car();

		System.out.println("myCar.fiyat = " + myCar.fiyat);
		System.out.println("myCar.model = " + myCar.model);

		myCar.hareket();
		myCar.dur();


		System.out.println("******************************");


		Student aliCan = new Student();
		System.out.println("aliCan.name = " + aliCan.name);
		System.out.println("aliCan.adress = " + aliCan.adress);
		System.out.println("aliCan.grade = " + aliCan.grade);

		aliCan.study();
		aliCan.feed();
	}
}
/*
HomeWork
1- Icinde en az isim ve yas variablelari ile en az teach methodu bulunan bir teacher objesi olusturun
   ve obje uzerinde bu ozellikleri kulanin.
 */
