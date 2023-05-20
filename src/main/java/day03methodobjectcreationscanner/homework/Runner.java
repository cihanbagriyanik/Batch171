package day03methodobjectcreationscanner.homework;

public class Runner {

	/*
HomeWork
1- Icinde en az isim ve yas variablelari ile en az teach methodu bulunan bir teacher objesi olusturun
   ve obje uzerinde bu ozellikleri kulanin.
 */

	public static void main(String[] args) {

		Teacher ogretmen = new Teacher();
		System.out.println("ogretmen.name = " + ogretmen.name);
		System.out.println("ogretmen.age = " + ogretmen.age);

		ogretmen.teach();


	}
}
