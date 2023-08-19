package my.home.algorithmization.decomposition;

//are the numbers relatively prime
public class Decomp6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 2, 3 };
		int[] nums2 = { 10, 5, 20 };

		System.out.println(isCoprime(gcdArray(nums)));
		System.out.println(isCoprime(gcdArray(nums2)));

	}

	public static boolean isCoprime(int num) {
		return (num == 1) ? true : false;

	}

	public static int gcd(int a, int b) {
		if (Math.min(a, b) == 0) {
			return Math.max(a, b);
		}
		return gcd(Math.min(a, b), Math.max(a, b) % Math.min(a, b));
	}

	public static int gcdArray(int[] array) {
		int div = array[0];

		for (int i = 0; i < array.length; i++) {
			div = gcd(div, array[i]);
		}
		return div;
	}

}
