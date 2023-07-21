
public class LargestElementInArray {

	public static void main(String[] args) {
		int[] arr = { 5, 8, 26, 38, 35, 84, 415, 862, 82, 634 };
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		System.out.println("The max element is :" + max);

	}

}
