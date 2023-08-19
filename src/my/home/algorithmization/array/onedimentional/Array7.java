package my.home.algorithmization.array.onedimentional;

//find max from (a[0] + a[n], a[1] + a[n-1], ...)
public class Array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 2, 1, 3, 8, 6, 22, 9, 1, 9, 2, 5 };
		int max = 0;
		int last = array.length - 1;
		int sum = 0;

		for (int i = 0; i <= array.length / 2; i++) {
			sum = array[i] + array[last - i];
			
			if(i == last - i) {
			sum = array[i] + array[i+1];	
			}
			
			if (max < sum) {
				max = sum;
			}

		}
		System.out.println("max sum: " + max);
	}

}
