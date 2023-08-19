package my.home.algorithmization.decomposition;

//print all narcissistic number from 1 to k
public class Decomp14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k = 123548;
		armstrongNums(k);

	}

	public static void armstrongNums(int k) {

		int res = 0;
		int num = 1;

		while (num <= k) {

			int pow = (int) Math.log10(num) + 1;
			int i = pow;

			while (i >= 0) {
				res += Math.pow((num / (int) Math.pow(10, i)) % 10, pow);
				i--;
			}

			if (res == num) {
				System.out.print (num + " ");
			}

			res = 0;
			num++;
		}
	}

}
