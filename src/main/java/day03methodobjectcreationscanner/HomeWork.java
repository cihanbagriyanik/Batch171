package day03methodobjectcreationscanner;

public class HomeWork {

	/*
HomeWork
1- Cemberin cevresini hesaplayan methodu olusturunuz ve kullaniniz. ( Cemberin Çevresi = 2 x π x r )
2- Dairenin alanini hesaplayan methodu olusturunuz ve kullaniniz. ( Dairenin Alani = π*R2 )
 */

	public static void main(String[] args) {

		double cemberCevre = cemberCevreHesapla(5);
		System.out.println("Cemberin cevresi = " + cemberCevre);


		double R = 5 ;
		daireninAlaniniBul(R);


	}

	private static double cemberCevreHesapla(int r){
		return 2*3.14*r;
	}


	public static void daireninAlaniniBul(double R) {
		System.out.println( "Dairenin alani = " + R*R*3.14);
	}



}
