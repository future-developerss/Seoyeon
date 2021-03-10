package baek;
import java.util.Scanner;
public class baek {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		
		System.out.println("두 정수를 입력해주세요: ");
		int num1 = src.nextInt();
		int num2 = src.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1 + ">" + num2);
		}
		else if(num1 < num2) {
			System.out.println(num1 + "<" + num2);
		}
		else if (num1 == num2) {
			System.out.println(num1 + "==" + num2);
		}
		
		src.close();
	}

}
