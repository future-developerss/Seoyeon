import java.util.Scanner;
public class Baek_14681 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("정수 x값을 입력해주세요: ");
		int x = src.nextInt();
		
		System.out.println("정수 y값을 입력해주세요: ");
		int y = src.nextInt();
		
		if ((x < 0) && (y < 0)) {
			System.out.println("제 3사분면 위의 점입니다.");
		}
		else if ((x < 0) && (y > 0)) {
			System.out.println("제 4사분면 위의 점입니다.");
		}
		else if ((x > 0) && (y > 0)) {
			System.out.println("제 1사분면 위의 점입니다.");
		}
		else if ((x > 0) && (y < 0)) {
			System.out.println("제 2사분면 위의 점입니다");
		}
		src.close();

	}

}
