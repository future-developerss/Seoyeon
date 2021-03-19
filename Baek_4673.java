public class Baek_4673 {
	public static int Selfnum(int a) {
		int sum = a;
		while (a != 0) {
			sum += (a % 10);
			a /= 10;
		}
		return sum;

	}

	public static void main(String[] args) {
		boolean []temp = new boolean[10001];
		for (int i = 1; i < 10001; i++) {
			int num = Selfnum(i);
			
			if (num < 10001) {
				temp[num] = true;
			}
		}
		StringBuilder check = new StringBuilder();
		
		for (int i = 1; i < 10001; i++) {
			if (!temp[i]) {
				check.append(i).append('\n');
			}
		}
		System.out.println(check);
	}

}
