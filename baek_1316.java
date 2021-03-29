import java.util.Scanner;
public class baek_1316 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int count = 0;
		int num = in.nextInt();
		
		for (int i = 0; i < num; i++) {
			if (check() == true) {
				count++;
			}
		}
		System.out.println(count);
	}
	public static boolean check()
	{
		boolean[] check = new boolean[26];
		int before = 0;
		String str = in.next();
		
		for  (int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);
			if (before != now) {
				if (check[now - 'a'] == false) {
					check[now - 'a'] = true;
					before = now;
				}
				else {
					return false;
				}
			}
			else {
				continue;
			}
			
		}
		return true;
	}

}
