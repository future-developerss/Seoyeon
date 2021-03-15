import java.util.Scanner;
public class Baek_10818 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("크기를 비교할 정수의 개수를 입력해주세요: ");
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
		System.out.println("최솟값은 " + min + "입니다.");
		int max = arr[0];
		for (int i = 0; i < num; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("최댓값은 " + max + "입니다.");

	}

}
