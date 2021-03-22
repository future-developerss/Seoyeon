import java.util.Scanner;
public class Baek_11654 {

	public static void main(String[] args) {
		Scanner code = new Scanner(System.in);
		System.out.println("알파벳이나 0~9 사이의 숫자를 입력해주세요: ");
		int x = code.next().charAt(0);
		code.close();
		System.out.println(x);

	}

}
