package baek1008;
import java.util.Scanner;
public class baek1008 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("�� ������ �Է����ּ���: ");
		
		double num1 = src.nextDouble();
		double num2 = src.nextDouble();
		double result = num1 / num2;
		src.close();
		
		System.out.println("�� ������ ���� ���� " + result + "�Դϴ�.");

	}

}