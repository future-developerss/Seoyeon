import java.util.Arrays;
import java.util.Scanner;
public class Baek_10818_1 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("ũ�⸦ ���� ������ ������ �Է����ּ���: ");
		int num = src.nextInt();
		int arr[] = new int [num];
		
		for (int i = 0; i < num; i++) {
			int arr_num = src.nextInt();
			arr[i] = arr_num;
		}
		Arrays.sort(arr);
		System.out.println("�ּڰ��� " + arr[0] + "�Դϴ�.");
	    System.out.println("�ִ��� " + arr[num-1] + "�Դϴ�.");

	}

}
