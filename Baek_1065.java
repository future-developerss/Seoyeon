import java.util.Scanner;
public class Baek_1065 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int num = src.nextInt();
		
		if (num < 100) {
			System.out.println(num);
		}
		else {
			int result = 99;
			
			for (int i = 100; i <= num; ++i) {
				result += checkHan(i);
			}
			if (num == 1000) result--;
			
			System.out.println(result);
		}

	}
	static int checkHan(int number) {
		int num1 = number / 100 % 10;
		int num2 = number / 10 % 10;
		int num3 = number % 10;
		
		if (num2 * 2 == num1 + num3) {
			return 1;
		}
		return 0;
	}

}
