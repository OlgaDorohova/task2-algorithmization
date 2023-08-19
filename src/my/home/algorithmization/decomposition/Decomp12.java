package my.home.algorithmization.decomposition;

import java.util.ArrayList;

//create array consists numbers which of digits sum = K, and number less than N 
public class Decomp12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k = 4;
		int n = 100;
		ArrayList<Integer> array = new ArrayList<>();
		array = digitArray(k, n);
		for (int i = 0; i < array.size(); i++) {
			System.out.print(array.get(i) + " ");
		}

	}

	public static ArrayList<Integer> digitArray(int k, int n) {
		ArrayList<Integer> resArrayList = new ArrayList<>();
		int i = 1;
		int result = 0;
		
		while (i <= n) {
			int pow = (int) Math.log10(i);
			while (pow >= 0) {
				result += (i / (Math.pow(10, pow)) % 10);
				pow--;
			}

			if (result == k) {
				resArrayList.add(i);
			}

			result = 0;
			i++;
		}

		return resArrayList;
	}

}
