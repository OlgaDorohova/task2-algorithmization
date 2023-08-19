package my.home.algorithmization.decomposition;

//calculate sum of numbers which have only odd digits
//count even digits in sum
public class Decomp16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int array[] = { 12, 111, 136, 667, 10, 13 };

		System.out.println(sumOddDigitNum(array));
		
		System.out.println(countEvenDigit(sumOddDigitNum(array)));

	}

	public static boolean isDigitOdd(int n) {
		int length = (int) (Math.log10(n) + 1);
		int digit;

		int i = 0;
		int pow = length - 1;
		while (i < length) {
			digit = n / (int) Math.pow(10, pow);
			if (digit % 2 == 0) {
				return false;
			}
			n %= (int) Math.pow(10, pow);
			pow--;
			i++;
		}

		return true;
	}

	public static int sumOddDigitNum(int[] array) {
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			if (isDigitOdd(array[i])) {
				sum += array[i];
			}
		}

		return sum;
	}

	public static int countEvenDigit(int n) {
		int count = 0;

		int length = (int) (Math.log10(n) + 1);

		int i = 0;
		int pow = length - 1;
		while (i < length) {
			if ((n / (int) Math.pow(10, pow)) % 2 == 0) {
				count++;
			}
			n %= (int) Math.pow(10, pow);
			pow--;
			i++;
		}

		return count;
	}

}
