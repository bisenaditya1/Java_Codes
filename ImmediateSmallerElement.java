
public class ImmediateSmallerElement {

	public static void main(String[] args) {
		int[] arr = { 5, 6, 2, 3, 1, 7 };

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i + 1] < arr[i]) {
				System.out.print(arr[i + 1] + " ");
			} else
				System.out.print("-1 ");
		}
		System.out.print("-1");
	}

}
