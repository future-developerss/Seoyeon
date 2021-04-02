import java.util.Scanner;
public class Baek_2941_1 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		String word = src.nextLine();
		if (word.length()>100) {
			System.out.printf("100자 이하의 단어를 입력해주세요.");
		}
		else {
			int count = 0;
			for (int i = 0; i < word.length(); i++) {
				char word1 = word.charAt(i);
				if (word1 == 'c') {
					if (i < word.length()- 1) {
						if (word.charAt(i+1)=='=') {
							i++;
						}
						else if (word.charAt(i+1)=='-') {
							i++;
						}
					}
				}
				else if (word1 == 'd') {
					if (i < word.length()- 1) {
						if (word.charAt(i+1)=='z') {
							if (i < word.length()-2) {
								if (word.charAt(i+2)=='-') {
									i+=2;
								}
							}
						}
						else if (word.charAt(i+1)=='-') {
							i++;
						}
					}
				}
				else if (word1 == 'l') {
					if (i < word.length()- 1) {
						if (word.charAt(i+1)=='j') {
							i++;
						}
					}
				}
				else if (word1 == 'n') {
					if (i < word.length()- 1) {
						if (word.charAt(i+1)=='j') {
							i++;
						}
					}
				}
				else if (word1 == 's') {
					if (i < word.length()- 1) {
						if (word.charAt(i+1)=='=') {
							i++;
						}
					}
				}
				else if (word1 == 'z') {
					if (i < word.length()- 1) {
						if (word.charAt(i+1)=='=') {
							i++;
						}
					}
				}
				count++;
			}
			System.out.println(count);
			
		}
		
	}

}
