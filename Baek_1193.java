import java.util.Scanner;
public class Baek_1193 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int num = src.nextInt();
		int cross = 1;
		int prev = 0;
		
		while (true) {
			if (num <= (prev + cross)) {
				if (cross % 2 == 1) {
					System.out.print((cross - (num - prev - 1)) + "/"+(num-prev));
					break;
				}
				else {
					System.out.print((num - prev)+"/"+(cross-(num-prev-1)));
					break;
				}
			}
			else {
				prev += cross;
				cross++;
			}
		}

	}

}
