package day02datatypesmethodcreation;

public class HomeWork {
	/*
	1- Bir dikdörtgenin alanını hesaplayan methodu oluşturun ve kullanın.
	2- Bir dikdörtgenin çevresini hesaplayan methodu oluşturun ve kullanın.
	 */

	public static void main(String[] args) {

		System.out.println("********** Soru 1 **********");
		int dikdortgenAlan = dikdortgenAlanHesapla(5,10);
		System.out.println("Dikdortgenin Alani : " + dikdortgenAlan + "m2");

		System.out.println("********** Soru 2 **********");
		System.out.print("Dikdortgenin Cevresi : ");
		System.out.println(dikdortgeninCevreHesabla(5,10));

	}

	public static int dikdortgenAlanHesapla (int a, int b){
		return a*b;
	}

	public static int dikdortgeninCevreHesabla(int a, int b){
		return (a+b)*2;
	}

}
