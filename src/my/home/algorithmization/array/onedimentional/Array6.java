package my.home.algorithmization.array.onedimentional;

//add, if the array index is a simple number
public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 7, 1, 1, 9, 6, 6, 9, 1, 9, 2, 7 };

		System.out.println(sum(array));

	}

	public static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (isSimple(i)) {
				sum += arr[i];
			}
		}

		return sum;
	}

	public static boolean isSimple(int i) {
		boolean isSimp = true;
		if (i < 2)
			return isSimp = true;
		for (int j = i / 2; j > 1; j--) {
			if (i % j == 0) {
				isSimp = false;
			}
		}
		return isSimp;
	}

}
