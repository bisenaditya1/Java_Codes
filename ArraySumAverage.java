import java.util.Arrays;

public class ArraySumAverage {

	public static void main(String[] args) {

		int[] arr = { 3, 4, 8, 4, 1, -4, -7, 8, 2, -5, 99 };
		Arrays.sort(arr);
		float sum = 0.00f;
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			sum = sum + arr[i];
		}
		System.out.println("The sum is : " + sum);
		System.out.print("The average is : ");
		System.out.printf("%.2f", sum / n);
	}

}
