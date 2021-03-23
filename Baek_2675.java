import java.util.Scanner;
public class Baek_2675 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("테스트 케이스의 개수를 입력해주세요: ");
		int num = src.nextInt();
		for (int i = 0; i < num; i++) {
			int count = src.nextInt();
			String word = src.next();
			for (int j = 0; j < word.length(); j++) {
				for (int r = 0; r < count; r++) {
					System.out.print(word.charAt(j));
				}
				
			}
			System.out.println();
		}

	}

}
