import java.util.Scanner;
public class Baek_2739 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("구구단을 실행할 정수를 입력햬주세요: ");
		
		int num = inp.nextInt();
		int i;
		
		if ((num >= 1) && (num <= 9)) {
			for (i = 1; i < 10; i++) {
				System.out.println(num + "*" + i + "=" + (num * i));
			}
		}
		
		else {
			System.out.println("1부터 9 사이의 정수를 입력해주세요. 프로그램이 종료됩니다.");
		}
		

		inp.close();

	}

}
