package my.home.algorithmization.decomposition;

// find the greatest common divisor of four numbers
public class Decomp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 10, 5, 15, 40 };

		System.out.println(gcdArray(array));

	}

	public static int gcd(int a, int b) {
		if (Math.min(a, b) == 0) {
			return Math.max(a, b);
		}
		return gcd(Math.min(a, b), Math.max(a, b) % Math.min(a, b));
	}

	public static int gcdArray(int[] array) {
		if (array.length == 0) {
			System.out.println("array length must be greater than 0");
			return -1;
		}

		int nod = array[0];

		for (int i = 0; i < array.length; i++) {
			nod = gcd(nod, array[i]);
		}
		return nod;
	}

}
