import java.util.Scanner;
public class Baek_2577 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("100이상 1000이하의 자연수 3개를 입력해주세요: ");
		int a = num.nextInt();
		int b = num.nextInt();
		int c = num.nextInt();
		int mult = a*b*c;
		int []arr = new int[10];
		
		while (mult > 0) {
			arr[mult % 10] += 1;
			mult /= 10;
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(arr[i]);
		}
		

	}

}
