package my.home.algorithmization.array.onedimentional;

//find the smallest of the elements of the array that occurs most often
public class Array9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 2, 1, 3, 8, 6, 7, 9, 1, 9, 2, 5, 9, 2, 1 };
		
		int[] freqArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[i] == array[j]) {
					freqArray[i] += 1;
				}
			}
		}

		int maxNum = findMax(freqArray);

		int min = array[0];
		boolean hasElse = false;

		for (int i = 0; i < freqArray.length; i++) {
			if (freqArray[i] == maxNum) {
				if (!hasElse) {
					min = array[i];
					hasElse = true;
				} else {
					if(min > array[i]) {
						min = array[i];
						hasElse = true;
					}
				}
			}
		}

		System.out.println(min);

	}

	public static int findMax(int[] arr) {
		int max = arr[0];

		for (int i : arr) {
			if (max < i) {
				max = i;
			}
		}

		return max;
	}

}
