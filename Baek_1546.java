import java.util.Scanner;
public class Baek_1546 {

	public static void main(String[] args) {
		Scanner aver = new Scanner(System.in);
		System.out.println("������ �� ������ ������ �Է����ּ���: ");
		int score_num = aver.nextInt();
		double [] arr = new double [score_num];
		double max = 0;
		for (int i = 0; i < score_num; i++) {
			arr[i] = aver.nextDouble();
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		
		double sum = 0;
		for (int i = 0; i < score_num; i++) {
			arr[i] = arr[i] /max * 100;
			sum += arr[i];
		}
		
		System.out.println("����� " + (sum / score_num) + "�Դϴ�.");
		

	}

}
