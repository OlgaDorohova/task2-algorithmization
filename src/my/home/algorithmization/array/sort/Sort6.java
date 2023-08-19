package my.home.algorithmization.array.sort;

//Shell sort
public class Sort6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] array = { 15, 14, 10, 13, 1, 4, 6, 2, 3, 11, 7, 5, 8, 16, 9, 12, 0 };
		 int [] array = MyUtil.createRandomArray(250, 200);
		System.out.println("Origin array:");
		MyUtil.printArray(array);

		shellSort(array);
		
		System.out.println("Sorted array:");
		MyUtil.printArray(array);

	}

	public static void shellSort(int[] array) {

		int step = 1;

		while (step * 3 < array.length) {
			step = step * 3 + 1;
		}

		while (step > 0) {
			for (int i = step; i < array.length; i++) {

				for (int j = i; j >= step; j -= step) {
					if (array[j] < array[j - step]) {
						int temp = array[j];
						array[j] = array[j - step];
						array[j - step] = temp;
					}
				}
			}
			step = step / 3;
		}
	}

}
