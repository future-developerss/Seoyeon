import java.util.Scanner;
public class Baek_8958 {

	public static void main(String[] args) {
		Scanner quiz = new Scanner(System.in);
		System.out.println("테스트 케이스의 개수를 입력해주세요: ");
		int case_num = quiz.nextInt();
		String []arr = new String [case_num];
		for (int i = 0; i < case_num; i++) {
			arr[i] = quiz.next();
		}
		
		for (int i = 0; i < case_num; i++) {
			int num = 0;
			int sum = 0;
			
			for (int j = 0; j < arr[i].length(); j++) {
				if (arr[i].charAt(j) == 'O') { //string으로 저장된 문자열 중 하나만 뽑아 char 타입으로 변환해줌
					num++;
				}
				else {
					num = 0;
				}
				sum += num;
			}
			System.out.println("점수는 " + sum + "입니다.");
		}

	}

}
