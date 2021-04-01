import java.util.Scanner;
public class Baek_4344 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		
		int []arr;
		
		int test = src.nextInt();
		for (int i = 0; i < test; i++) {
			int num = src.nextInt();
			arr = new int [num];
			double sum = 0;
			
			for (int j = 0; j < num; j++) {
				int score = src.nextInt();
				arr[j] = score;
				sum += score;
			}
			
			double aver = sum / num;
			double count = 0;
			
			for (int j = 0; j < num; j++) {
				if (arr[j] > aver) {
					count++;
				}
			}
			
			System.out.printf("%.3f%%\n", (count/num)*100);
		}

	}

}
