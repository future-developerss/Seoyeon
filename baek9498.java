package baek;
import java.util.Scanner;
public class baek9498 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		
		System.out.println("���������� �Է��ϼ��� : ");
		int score = src.nextInt();
		
		if ((score >= 90) && (score <= 100)) {
			System.out.println("���� ������ A �Դϴ�.");
		}
		else if((score >= 80) && (score <= 89)){
			System.out.println("���� ������ B �Դϴ�");
		}
		else if ((score >= 70) && (score <= 79)) {
			System.out.println("���� ������ C �Դϴ�");
		}
		else if ((score >= 60) &&(score <= 69)) {
			System.out.println("���� ������ D �Դϴ�");
		}
		else {
			System.out.println("���� ������ F �Դϴ�");
		}
		src.close();
	}

}
