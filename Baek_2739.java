import java.util.Scanner;
public class Baek_2739 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("�������� ������ ������ �Է����ּ���: ");
		
		int num = inp.nextInt();
		int i;
		
		if ((num >= 1) && (num <= 9)) {
			for (i = 1; i < 10; i++) {
				System.out.println(num + "*" + i + "=" + (num * i));
			}
		}
		
		else {
			System.out.println("1���� 9 ������ ������ �Է����ּ���. ���α׷��� ����˴ϴ�.");
		}
		

		inp.close();

	}

}
