import java.util.Scanner;
public class Baek_11021 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("몇 개의 케이스를 입력하실 건가요?: ");
		int num = src.nextInt();
		int i;
		for (i = 1; i <= num; i++) {
			int num1 = src.nextInt();
			int num2 = src.nextInt();
			if (num1 > 0 && num2 <10) {
			
				System.out.println("Case #" + i + ":" + (num1 + num2));
			}
		}
		src.close();
	}

}
