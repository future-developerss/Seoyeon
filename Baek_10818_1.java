import java.util.Arrays;
import java.util.Scanner;
public class Baek_10818_1 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("크기를 비교할 정수의 개수를 입력해주세요: ");
		int num = src.nextInt();
		int arr[] = new int [num];
		
		for (int i = 0; i < num; i++) {
			int arr_num = src.nextInt();
			arr[i] = arr_num;
		}
		Arrays.sort(arr);
		System.out.println("최솟값은 " + arr[0] + "입니다.");
	    System.out.println("최댓값은 " + arr[num-1] + "입니다.");

	}

}
