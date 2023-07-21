import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

	private static int binarySearch(int[] arr, int n, int k) {
		for (int i = 0; i < n; i++) {
			if (arr[i] == k) {
				return i;
			}
		}
		return -1;

	}

	public static void main(String[] args) {

		int[] arr = { 5, 14, 6, 3, 8, 53, 5, 2, 9, 3, 9, 4, 0 };
	//	Arrays.sort(arr);
		int n = arr.length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to find in the array : ");
		int k = sc.nextInt();

		int result = binarySearch(arr, n, k);
		if (result != -1)
			System.out.println("The element " + k + " found at " + result + "th position");
		else
			System.out.println("Element not found");
	}

}
