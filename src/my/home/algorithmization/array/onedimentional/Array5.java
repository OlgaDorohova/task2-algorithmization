package my.home.algorithmization.array.onedimentional;

//print, if the array element is greater than the array index number
public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 2, 0, 1, 3, 5, 30, 4, 8, 6 };

		for (int i = 0; i < array.length; i++) {
			if (array[i] > i) {
				System.out.print(array[i] + " ");
			}
		}

		System.out.println();
	}

}
