import java.util.Scanner;
public class Baek_2562 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("9���� �ڿ����� �Է����ּ���: ");
		int []arr = new int [9];
		int max = 0;
		int index = 0;
		for (int i = 0; i < 9; i++) {
			arr[i] = src.nextInt();
			if (max < arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		
		System.out.println("�ִ��� " + max + "�Դϴ�.");
		System.out.println("�ִ��� ��ġ�� " + (index+1) + "�Դϴ�." );
				
		

	}

}
