import java.util.Scanner;

public class ValueEqualToIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("No of elements :");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.println("enter elements :");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		int count = 0;
		for (int i = 0; i < size; i++) {
			if (i == arr[i]) {
				System.out.print(arr[i] + " ");
				count++;
			}

		}
		if (count == 0)
			System.out.println("no elements found");
	}

}
