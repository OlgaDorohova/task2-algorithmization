package my.home.algorithmization.array.sort;

// create a result array in ascending order = originArray1 + originArray2  
public class Sort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = { 4, 6, 7, 9, 11, 15, 56 };
		int[] array2 = { 2, 3, 8, 9, 11, 15, 16, 18 };
		int[] resArray = new int[array1.length + array2.length];

		MyUtil.printArray(array1);
		MyUtil.printArray(array2);

		for (int i = 0, j1 = 0, j2 = 0; i < resArray.length; i++) {
			if (j1 < array1.length && j2 < array2.length) {
				if (array1[j1] == array2[j2]) {
					resArray[i] = array1[j1];
					j1++;
					i++;
					resArray[i] = array2[j2];
					j2++;
					continue;
				}

				if (array1[j1] < array2[j2]) {
					resArray[i] = array1[j1];
					j1++;
					continue;
				}

				if (array2[j2] < array1[j1]) {
					resArray[i] = array2[j2];
					j2++;
					continue;
				}
			}

			if (j1 > array1.length && j2 < array2.length) {
				resArray[i] = array2[j2];
				j2++;
			}

			if (j2 > array2.length - 1 && j1 < array1.length) {
				resArray[i] = array1[j1];
				j1++;
			}

		}

		MyUtil.printArray(resArray);

	}

}
