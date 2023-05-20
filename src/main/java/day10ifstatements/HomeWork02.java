package day10ifstatements;

import java.util.Scanner;

public class HomeWork02 {

	/*
		HomeWork
		2- Haftanin gun ismini verdiginizde kacinci gun oldugunu veren kodu giriniz.
			Pazar ==> 1. Gun, Pazartesi ==> 2.Gun...
	*/

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen bir gun giriniz...");
		String day = input.next();

		if (day.equalsIgnoreCase("Pazar")){
			System.out.println("1. Gun");
		} else if (day.equalsIgnoreCase("Pazartesi")) {
			System.out.println("2. Gun");
		} else if (day.equalsIgnoreCase("Sali")) {
			System.out.println("3. Gun");
		} else if (day.equalsIgnoreCase("Carsamba")) {
			System.out.println("4. Gun");
		} else if (day.equalsIgnoreCase("Persembe")) {
			System.out.println("5. Gun");
		} else if (day.equalsIgnoreCase("Cuma")) {
			System.out.println("6. Gun");
		} else if (day.equalsIgnoreCase("Cumartesi")) {
			System.out.println("7. Gun");
		}else {
			System.out.println("Hatali giris yaptiniz. Lutfen bir gun giriniz...");
		}

	}
}
