import java.util.Scanner;
public class Baek_5622 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.print("영어 대문자 단어를 입력해주세요: ");
		String word = src.next();
		int time = 0;
		//문자열 배열을 각각 만드려고 했지만 모든 배열을 돌며 탐색해야 한다는 것이 단점
		for (int i = 0; i < word.length(); i++) {
			switch(word.charAt(i)) {
			case 'A': case 'B': case 'C':
				time += 3;
				break;
				
			case 'D': case 'E': case 'F':
				time += 4;
				break;
				
			case 'G': case 'H': case 'I':
				time += 5;
				break;
				
			case 'J': case 'K': case 'L':
				time += 6;
				break;
				
			case 'M': case 'N': case 'O':
				time += 7;
				break;
				
			case 'P': case 'Q': case 'R': case 'S':
				time += 8;
				break;
			
			case 'T': case 'U': case 'V':
				time += 9;
				break;
				
			case 'W': case 'X': case 'Y': case 'Z':
				time += 10;
				break;
			}
		}
		System.out.print("소요 시간은 " + time + "초입니다.");

	}

}
