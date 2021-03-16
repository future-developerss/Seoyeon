import java.util.Scanner;
public class Baek_2562 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("9개의 자연수를 입력해주세요: ");
		int []arr = new int [9];
		int max = 0;
		int index = 0;
		for (int i = 0; i < 9; i++) {
			arr[i] = src.nextInt();
			if (max < arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		
		System.out.println("최댓값은 " + max + "입니다.");
		System.out.println("최댓값의 위치는 " + (index+1) + "입니다." );
				
		

	}

}
