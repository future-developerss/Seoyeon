import java.util.Scanner;
public class Baek_11720 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("������ ������ �Է����ּ���: ");
		int num = src.nextInt();
		String num1 = src.next();
		
		int sum = 0;
		
		for (int i = 0; i < num; i++) {
			sum += num1.charAt(i) - 48; //chatAt���� ���� ���� �̿��Ϸ��� -48�̳� -'0'�� ����� ��
		}
		System.out.print(sum);
	}

}
