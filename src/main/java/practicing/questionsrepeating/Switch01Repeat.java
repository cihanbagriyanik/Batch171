package practicing.questionsrepeating;

public class Switch01Repeat {

	public static void main(String[] args) {

		//Example 1 : Gun isimlerini verince kacinci gun oldugunu yatdiran kodu giriniz.
		//      Sunday  ==> 1 .....  Saturday ==>7

		String day = "SundaY" ;

		switch (day.toLowerCase()){
			case "sunday" :
				System.out.println("1");
				break;
			case "monday" :
				System.out.println("2");
				break;
			case "tuesday" :
				System.out.println("3");
				break;
			case "wednesday" :
				System.out.println("4");
				break;
			case "thursday" :
				System.out.println("5");
				break;
			case "friday" :
				System.out.println("6");
				break;
			case "saturday" :
				System.out.println("7");
				break;
			default:
				System.out.println("Gecersiz bir veri girdiniz...");
		}
	}
}
