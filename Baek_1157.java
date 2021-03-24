import java.util.Scanner;
public class Baek_1157 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		String word = src.next();
		int [] arr = new int[26];
		
		for (int i = 0; i < word.length(); i++) {
			if (65 <= word.charAt(i) && word.charAt(i) >= 90) {
				arr[word.charAt(i) - 65] += 1;
			}
			else {
				arr[word.charAt(i) - 97] += 1;
			}
		}
		int max = -1;
		char result = '?';
		
		for (int i = 0; i <26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				result = (char)(i + 65);
			}
			else if (arr[i] == max) {
				result = '?';
			}
		}
		System.out.print(result);

	}

}
