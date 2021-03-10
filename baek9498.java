package baek;
import java.util.Scanner;
public class baek9498 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		
		System.out.println("시험점수를 입력하세요 : ");
		int score = src.nextInt();
		
		if ((score >= 90) && (score <= 100)) {
			System.out.println("시험 성적은 A 입니다.");
		}
		else if((score >= 80) && (score <= 89)){
			System.out.println("시험 성적은 B 입니다");
		}
		else if ((score >= 70) && (score <= 79)) {
			System.out.println("시험 성적은 C 입니다");
		}
		else if ((score >= 60) &&(score <= 69)) {
			System.out.println("시험 성적은 D 입니다");
		}
		else {
			System.out.println("시험 성적은 F 입니다");
		}
		src.close();
	}

}
