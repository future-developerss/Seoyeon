import java.util.Scanner;
public class Baek_2908 {
	//stringbuffer로 받은 값은 정수형으로 변경 불가능?
	//우선 stringbuffer을 쓰려는 시도는 append를 쓰기 위함이었으므로 굳이 쓸 필요 x
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.print("세 자리 정수 두 개를 입력해주세요: ");
		int num1 = src.nextInt();
		int num2 = src.nextInt();
		
		num1 = Integer.parseInt(new StringBuilder().append(num1).reverse().toString());
		num2 = Integer.parseInt(new StringBuilder().append(num2).reverse().toString());
		
		System.out.print(num1 < num2 ? num2 : num1);

	}

}
