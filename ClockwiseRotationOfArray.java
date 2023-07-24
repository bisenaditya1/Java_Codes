import java.util.Arrays;

public class ClockwiseRotationOfArray {

	private static int[] rotateArray(int[] arr, int n) {
		int[] RotateArray = new int[n];
		int i = n;
		RotateArray[0] = arr[n - 1];
		for (i = 0; i < n - 1; i++) {
			RotateArray[i + 1] = arr[i];
		}

		return RotateArray;

	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 6, 9, 2, 6, 0, 4, 8 };
		System.out.println("The array elements are: ");
		System.out.println(Arrays.toString(arr));
		int n = arr.length;
		int[] Rotatedarray = rotateArray(arr, n);
		System.out.println(Arrays.toString(Rotatedarray));
	}

}
