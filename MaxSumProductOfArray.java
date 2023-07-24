import java.util.Arrays;

public class MaxSumProductOfArray {

	private static int MaxSumProduct(int[] arr) {
		int product = 0;
		for (int i = 0; i < arr.length; i++) {
			product = product + arr[i] * i;
		}
		return product;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 4, 0, 3, 9 };
		System.out.println("The array elements are :");
		System.out.println(Arrays.toString(arr));
		int product = MaxSumProduct(arr);
		System.out.println("The Max Product Sum is: " + product);

	}

}
