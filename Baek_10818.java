import java.util.Scanner;
public class Baek_10818 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("ũ�⸦ ���� ������ ������ �Է����ּ���: ");
		int num = src.nextInt();
		int [] arr = new int [num];
		
		for (int i = 0; i < num; i++) {
			int arr_num = src.nextInt();
			arr[i] = arr_num;
			
		}
		int min = arr[0];
		for (int i = 0; i <num; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("�ּڰ��� " + min + "�Դϴ�.");
		int max = arr[0];
		for (int i = 0; i < num; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("�ִ��� " + max + "�Դϴ�.");

	}

}
