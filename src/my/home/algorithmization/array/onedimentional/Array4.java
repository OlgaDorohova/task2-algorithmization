package my.home.algorithmization.array.onedimentional;

//change max/min elements positions
public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 10, 2, 0, 5, 9, 1, 6, 7, 4, 4 };
		
		int min = minElementIndex(array);
		int max = maxElementIndex(array);
		
		change(array, min, max);;
		Array2.print(array);

	}

	public static int minElementIndex(int[] arr) {
		int max = arr[0];
		int index = 0;

		for (int i = 0; i< arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				index = i;
			}
		}
		return index;
	}

	public static int maxElementIndex(int[] arr) {
		int min = arr[0];
		int index = 0;

		for (int i = 0; i< arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				index = i;
			}
		}
		return index;
	}
	
	public static void change(int [] arr, int min, int max) {
		int temp;
		temp = arr[min];
		arr[min] = arr[max];
		arr[max] = temp;
		
	}
	
	
}
