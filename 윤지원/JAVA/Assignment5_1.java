import java.util.Scanner;

public class Assignment5_1 {
	public static void main(String[] args) throws Exception {
		String bmiType;

		Scanner in = new Scanner(System.in);
		System.out.print("신장(m)을 입력하시오: ");
		double tall = in.nextDouble();
		System.out.print("체중(kg)을 입력하시오: ");
		double weight = in.nextDouble();

		double bmiCalculate = weight / Math.pow(tall, 2);
		System.out.println("BMI: " + Math.round((bmiCalculate) * 100) / 100.0);
		in.close();

		if (bmiCalculate >= 30) {
			bmiType = "비만";
		} else if (bmiCalculate >= 25) {
			bmiType = "과체중";
		} else if (bmiCalculate >= 18.5) {
			bmiType = "정상";
		}	else {
			bmiType = "저체중";
		}
		System.out.println("비만도: " + bmiType);
	}
}