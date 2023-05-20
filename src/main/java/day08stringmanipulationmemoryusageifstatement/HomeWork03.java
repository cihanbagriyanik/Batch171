package day08stringmanipulationmemoryusageifstatement;

public class HomeWork03 {

	//3- Bir string variable olusturunuz ve bu string deki ilk ve son karakterlerin ASCII degerleri toplamini kosola yazdiriniz.

	public static void main(String[] args) {

		String str = "No pain, no gain.";
		int first = str.charAt(0);
		int last =str.charAt(str.length()-1);
		System.out.println("First = "+ first + " /" + " Last = " + last);

	}

}
