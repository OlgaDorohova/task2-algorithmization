package my.home.algorithmization.array.sort;

//exchange sort
public class Sort4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		var array = MyUtil.createArray(10);
		MyUtil.printArray(array);

		int temp;
		boolean isSort = false;

		while (!isSort) {
			isSort = true;
			for (int i = 0; i < array.length - 1; i++) {

				if (array[i] < array[i + 1]) {
					isSort = false;
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					count++;
				}
			}
		}

		MyUtil.printArray(array);
		System.out.println("Number of changes: " + count);

	}

}
