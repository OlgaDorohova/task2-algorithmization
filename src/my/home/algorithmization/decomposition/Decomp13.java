package my.home.algorithmization.decomposition;

//find twins
public class Decomp13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 50;
		findTwins(n);

	}

	public static boolean isSimple(int n) {
		int i = n / 2;
		if (n <= 2)
			return true;

		while (i > 1) {
			if (n % i == 0) {
				return false;
			}
			i--;
		}

		return true;

	}

	public static void findTwins(int n) {
		if (n <= 2) {
			System.out.println("Enter another number");
			return;
		}
		for (int i = n; i <= n * 2; i++) {
			if (i + 2 <= n * 2 && isSimple(i) && isSimple(i + 2)) {
				System.out.println(i + " " + (i + 2));
			}
		}
	}

}
