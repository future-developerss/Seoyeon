import java.util.Scanner;
public class Baek_10818_2 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("ũ�⸦ ���� ������ ������ �Է����ּ���: ");
		int num = src.nextInt();
		int arr[] = new int [num];
		int min = 1000000;
		int max = -1000000;
		for (int i = 0; i < num; i++) {
			arr[i] = src.nextInt();
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
			
		}
		System.out.println("�ּڰ��� " + min + "�Դϴ�.");
		System.out.println("�ִ��� " + max + "�Դϴ�.");

	}

}