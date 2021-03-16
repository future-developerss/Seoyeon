import java.util.Scanner;
public class Baek_3052 {

	public static void main(String[] args) {
		Scanner num2 = new Scanner(System.in);
		System.out.println("10개의 자연수를 입력해주세요: ");
		int [] arr = new int[10];
		int count = 0;
		
		for(int i = 0; i < 10; i++) {
			int num1 = num2.nextInt();
			arr[i] = num1 % 42;
		}
		for (int i = 0; i < 10; i++) {
			int cnt = 0;
			for (int j = i + 1; j < 10; j++) {
				if (arr[i] == arr[j]) {
					cnt++;
				}
			}
			if (cnt == 0) {
				count++;
			}
		}
		System.out.println(count);

	}

}
