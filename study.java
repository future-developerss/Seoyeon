

package study;
import java.util.Scanner;
public class study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("숫자 두 개를 입력해주세요: ");
		int num1 = 0;
		int num2 = 0; 
		
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		System.out.println("두 수의 합은 "+ (num1 + num2) + "입니다");
	}
 
}
