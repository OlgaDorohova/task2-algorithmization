package my.home.algorithmization.array.onedimentional;

//find sum of all array elements that are multiples of K
public class Array1 {

	public static void main(String[] args) {

		int[] array = { 2, 5, 120, 16, 45, 8, 49, 13, 12, 56 };
		int k = 5;
		int sum = 0;
		
		for(int i: array) {
			if(i % k == 0) {
				sum += i;
			}
		}
		
		System.out.println(sum);

	}

}
