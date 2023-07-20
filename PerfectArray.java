import java.util.Arrays;

public class PerfectArray {

	private static boolean isPerfect(int[] arr, int n) {
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			b[i] = arr[n - i - 1];
		}

		return Arrays.equals(b, arr);
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 2, 1 };
		int n = arr.length;

		if (isPerfect(arr, n))
			System.out.println("It is a perfect array");
		else
			System.out.println("Not a perfect array");

	}

}
