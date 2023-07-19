import java.util.Scanner;

public class AlternatePrinting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("No of elements of array:");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.println("enter elements :");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Alternate elements starting for index 0 :");
		for (int i = 0; i < size; i++) {
			if (i % 2 == 0)
				System.out.println(arr[i] + " ");
		}
		System.out.println("Alternate elements starting for index 1 :");
		for (int i = 0; i < size; i++) {
			if (i % 2 == 1)
				System.out.println(arr[i] + " ");
		}
	}

}
