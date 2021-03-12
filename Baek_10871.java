import java.util.Scanner;
public class Baek_10871 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int a = src.nextInt();
		int b = src.nextInt();
		int i;
		for (i = 1; i <= a; i++) {
			int num = src.nextInt();
			
			if (num < b) {
				System.out.println(num);
			}
		}
		src.close();
	}

}
