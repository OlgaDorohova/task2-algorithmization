package my.home.algorithmization.array.sort;

//reduce fractions to a common denominator and sort
public class Sort8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] fractions = { "3/5", "7/8", "6/5", "5/7", "2/3", "4/9", "9/4", "3/2" };

		for (String s : fractions) {
			System.out.print(s + " ");
		}
		System.out.println();

		String[] frString = fractionSort(fractions);

		for (String s : frString) {
			System.out.print(s + " ");
		}

	}

	public static String[] fractionSort(String[] fractions) {

		String[] fraction = new String[fractions.length];

		String[][] reduceFractString = new String[fractions.length][2];
		int[][] reduceFractInt = new int[reduceFractString.length][2];

		for (int i = 0; i < fractions.length; i++) {
			reduceFractString[i] = fractions[i].split("/");
		}

		for (int i = 0; i < reduceFractString.length; i++) {
			for (int j = 0; j < reduceFractString[i].length; j++) {
				reduceFractInt[i][j] = Integer.parseInt(reduceFractString[i][j]);
			}
		}

		int nok = reduceFractInt[0][1];

		for (int i = 1; i < reduceFractInt.length; i++) {
			nok = lcm(nok, reduceFractInt[i][1]);
		}

		boolean isSort = true;
		while (isSort) {
			isSort = false;

			for (int i = 0; i < reduceFractInt.length - 1; i++) {
				if (reduceFractInt[i][0] * (nok / reduceFractInt[i][1]) > 
					reduceFractInt[i + 1][0] * (nok / reduceFractInt[i + 1][1])) {
					int tempF = reduceFractInt[i][0];
					int tempD = reduceFractInt[i][1];

					reduceFractInt[i][0] = reduceFractInt[i + 1][0];
					reduceFractInt[i][1] = reduceFractInt[i + 1][1];

					reduceFractInt[i + 1][0] = tempF;
					reduceFractInt[i + 1][1] = tempD;

					isSort = true;

				}
			}

		}

		for (int i = 0; i < reduceFractInt.length; i++) {
			fraction[i] = String.valueOf(reduceFractInt[i][0]) + "/" + 
						  String.valueOf(reduceFractInt[i][1]);
		}

		return fraction;
	}

	public static int gcd(int a, int b) {
		if (Math.min(a, b) == 0) {
			return Math.max(a, b);
		}
		return gcd(Math.min(a, b), Math.max(a, b) % Math.min(a, b));
	}

	public static int lcm(int a, int b) {
		return (a / gcd(a, b) * b);
	}

}
