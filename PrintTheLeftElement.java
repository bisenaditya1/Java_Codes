import java.util.Arrays;

public class PrintTheLeftElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 4, 8, 4, 1, -4, -7, 8, 2, -5, 99 };

		Arrays.sort(arr);
		System.out.println("Sorted array is : ");
		for (int x : arr) {
			System.out.print(x + ", ");
		}

		System.out.println();
		if (arr.length % 2 == 1) {
			System.out.println("The remaining element is : " + arr[arr.length / 2]);

		} else
			System.out.println("The remaining element is : " + arr[arr.length / 2 - 1]);

	}

}
