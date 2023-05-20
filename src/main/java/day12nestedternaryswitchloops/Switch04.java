package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Switch04 {

	public static void main(String[] args) {

		//Kullanicidan alinan ulke ismi aliniz alinan ulke ismine gore kisaltma yazdriniz.

		Scanner input = new Scanner(System.in) ;

		System.out.println("Lutfen bir ulke ismi giriniz...");

		String name = input.nextLine() ;

		switch (name.toLowerCase()) {
			case "america":
				System.out.println("US");
				break;
			case "england":
				System.out.println("UK");
				break;
			case "germany":
				System.out.println("DE");
				break;
			case "turkey":
				System.out.println("TR");
				break;
			case "india":
				System.out.println("IN");
				break;
			case "peru":
				System.out.println("PE");
				break;
			case "spain":
				System.out.println("ES");
				break;
			case "bulgaria":
				System.out.println("BG");
				break;
			case "albania":
				System.out.println("AL");
				break;
			case "france":
				System.out.println("FR");
				break;
			default:
				System.out.println("Gecerli bir ulke ismi giriniz");
		}

	}
}

/*
1- Git Hub da bulunan projeyi kendi lokalimize almak icin
	a- Clone lanmak istenen projenin url i kopyalanir.
	b- Intelij den file + new + project + project from version control
bundan sonra

git pull denilerek kendi lokalimize cekebilirz

*/
