import java.util.Scanner;
public class Baek_8958 {

	public static void main(String[] args) {
		Scanner quiz = new Scanner(System.in);
		System.out.println("�׽�Ʈ ���̽��� ������ �Է����ּ���: ");
		int case_num = quiz.nextInt();
		String []arr = new String [case_num];
		for (int i = 0; i < case_num; i++) {
			arr[i] = quiz.next();
		}
		
		for (int i = 0; i < case_num; i++) {
			int num = 0;
			int sum = 0;
			
			for (int j = 0; j < arr[i].length(); j++) {
				if (arr[i].charAt(j) == 'O') { //string���� ����� ���ڿ� �� �ϳ��� �̾� char Ÿ������ ��ȯ����
					num++;
				}
				else {
					num = 0;
				}
				sum += num;
			}
			System.out.println("������ " + sum + "�Դϴ�.");
		}

	}

}
