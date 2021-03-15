import java.util.Scanner;
public class Baek_10818_2 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("크기를 비교할 정수의 개수를 입력해주세요: ");
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
		System.out.println("최솟값은 " + min + "입니다.");
		System.out.println("최댓값은 " + max + "입니다.");

	}

}