import java.util.Scanner;
public class Baek_14681 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("���� x���� �Է����ּ���: ");
		int x = src.nextInt();
		
		System.out.println("���� y���� �Է����ּ���: ");
		int y = src.nextInt();
		
		if ((x < 0) && (y < 0)) {
			System.out.println("�� 3��и� ���� ���Դϴ�.");
		}
		else if ((x < 0) && (y > 0)) {
			System.out.println("�� 4��и� ���� ���Դϴ�.");
		}
		else if ((x > 0) && (y > 0)) {
			System.out.println("�� 1��и� ���� ���Դϴ�.");
		}
		else if ((x > 0) && (y < 0)) {
			System.out.println("�� 2��и� ���� ���Դϴ�");
		}
		src.close();

	}

}
