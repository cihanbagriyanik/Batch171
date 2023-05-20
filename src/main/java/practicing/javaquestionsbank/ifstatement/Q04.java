package practicing.javaquestionsbank.ifstatement;

public class Q04 {

	//Asagıdak! seçenekler dogrultusunda gereken kodu yazınız.
	//a) Son basamak 5 ‘e es!t ve 5 den büyükse, yuvarlama !slem!: “Son basamagı b!r üst ondalıga
	//yuvarla”
	//b) Son basamak 5 den küçükse, yuvarlama !slem!: “Son basamagı b!r alt ondalıga yuvarla”

	public static void main(String[] args) {

		int num = 125;

		if (num%10 >= 5){
			System.out.println("Son basamagi bir ust ondaliga yuvarla : " + (num/10+1)*10);
		} else {
			System.out.println("Son basamagı bir alt ondalıga yuvarla : " + (num/10)*10);
		}
	}
}
