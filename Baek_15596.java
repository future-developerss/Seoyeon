public class Baek_15596 {
	
	public static long sum(int[] a) {
		int arr_leng = a.length;
		long add = 0;
		for(int i = 0; i < arr_leng; i++) {
			add += a[i];
		}
		return add;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
