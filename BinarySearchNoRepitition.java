import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	private static int binarySearch(int[] arr, int n, int k) {
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == k) {
				return mid;
			} else if (arr[mid] > k) {
				high = mid - 1;
			}
			if (arr[mid] < k) {
				low = mid + 1;
			}

		}

		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 14, 6, 8, 53, 9, 3, 4, 0 };

		Arrays.sort(arr);
		System.out.println("The Sorted Array is :");
		for (int element : arr)
			System.out.print(element + " ");

		int n = arr.length;
		Scanner sc = new Scanner(System.in);
		System.out.println(" \n" + "Enter the element to find in the array : ");
		int k = sc.nextInt();

		int result = binarySearch(arr, n, k);

		if (result != -1)
			System.out.print("Element found at " + result + "th index");
		else
			System.out.println("Element not found");
	}

}
