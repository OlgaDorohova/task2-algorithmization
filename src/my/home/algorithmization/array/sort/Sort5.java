package my.home.algorithmization.array.sort;

//insertion sort
public class Sort5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] array = { 2, 5, 1, 1, 3, 87, 8, 9, 4, 15 };
		
		int[] array =MyUtil.createRandomArray(10, 15);
		System.out.println("Origin array");
		MyUtil.printArray(array);

		int count = 1;
		int[] resArray = new int[array.length];
		resArray[0] = array[0];

		for (int j = 1; j < array.length; j++) {
			int index = binIndexSearch(resArray, 0, count, array[j]);
			
			if (index >= 0) {
				for (int i = count; i > index; i--) {
					resArray[i] = resArray[i - 1];
				}

				resArray[index] = array[j];
				count++;
		
			} else
				System.out.println("error" + j);
		}
		
		System.out.println("Sorted array");
		MyUtil.printArray(resArray);

	}

	public static int binIndexSearch(int[] array, int first, int last, int element) {

		if (last >= first) {
			int middle = (first + last) / 2;

			if (array[middle] < element) {
				if (middle+1 >= last) {
					return middle+1;
				}
				
				if (array[middle + 1] > element) {
					return middle+1;
				}
				return binIndexSearch(array, middle + 1, last, element);
			}

			if (array[middle] > element) {
				if (middle == 0) {
					return middle;
				}

				if (array[middle - 1] < element) {
					return middle;

				}
				return binIndexSearch(array, first, middle - 1, element);
			}
			return middle;
		}
		return -1;
	}

	
}
