import java.util.Scanner;
public class Baek_2908 {
	//stringbuffer�� ���� ���� ���������� ���� �Ұ���?
	//�켱 stringbuffer�� ������ �õ��� append�� ���� �����̾����Ƿ� ���� �� �ʿ� x
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.print("�� �ڸ� ���� �� ���� �Է����ּ���: ");
		int num1 = src.nextInt();
		int num2 = src.nextInt();
		
		num1 = Integer.parseInt(new StringBuilder().append(num1).reverse().toString());
		num2 = Integer.parseInt(new StringBuilder().append(num2).reverse().toString());
		
		System.out.print(num1 < num2 ? num2 : num1);

	}

}
