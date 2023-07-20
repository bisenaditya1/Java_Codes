import java.util.Arrays;
import java.util.Scanner;

public class SmallerAndLarger {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 6, 2, 9, 4, 9, -4, -8, -4, 05, -6, -5 };
		Arrays.sort(arr);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key ");
		int key = sc.nextInt();

		int lcount = 0;
		int mcount = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > key)
				mcount++;
			else
				lcount++;
		}
		System.out.println("The number of elements greater than key " + key + " are : " + mcount);
		System.out.println("The number of elements lesser than key " + key + " are : " + lcount);

	}

}
