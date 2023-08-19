package my.home.algorithmization.decomposition;

//count actions (subtract) before zero
public class Decomp17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 24;
		System.out.println(countAct(n));

	}

	public static int countAct(int n) {
		int res = 0;
		int count = 0;

		while (n - res > 0) {
			res = 0;
			int pow = (int) Math.log10(n) + 1;
			int i = pow;

			while (i >= 0) {
				res += (n / (int) Math.pow(10, i)) % 10;
				i--;
			}

			if (n - res > 0) {
				count++;
				n = n - res;

			}
		}
		return count;
	}

}
