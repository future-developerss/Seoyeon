import java.util.Scanner;
public class Baek_2775 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int [][] apart = new int[15][15];
		
		for (int i=0; i<15; i++) {
			apart[0][i] = i;
			apart[i][1] = 1;
		}
		
		for (int i=1; i<15; i++) {
			for (int j=2; j <15; j++) {
				apart[i][j] = apart[i-1][j] + apart[i][j-1];
			}
		int test = src.nextInt();
			for (int j=0; j < test; j++) {
				int floor = src.nextInt();
				int num= src.nextInt();
				System.out.println(apart[floor][num]);
					
				}
			}

	}

}
