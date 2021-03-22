import java.util.Scanner;
public class Baek_11720 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("숫자의 개수를 입력해주세요: ");
		int num = src.nextInt();
		String num1 = src.next();
		
		int sum = 0;
		
		for (int i = 0; i < num; i++) {
			sum += num1.charAt(i) - 48; //chatAt에서 원래 값을 이용하려면 -48이나 -'0'을 해줘야 함
		}
		System.out.print(sum);
	}

}
