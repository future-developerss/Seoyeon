import java.util.Scanner;
public class Baek_10809 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int [] arr = new int [26];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		System.out.println("소문자로 이루어진 영어 단어를 입력해주세요: ");
		String word = src.next();
		
		for (int i = 0; i < word.length(); i++) {
			char word1 = word.charAt(i);
			if (arr[word1 - 97] == -1) { //97이나 'a'를 빼줘야 올바른 인덱스값이 된다.			
				arr[word1 - 97] = i;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}
	}

}
