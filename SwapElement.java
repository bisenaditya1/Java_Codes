import java.util.Scanner;

public class SwapElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("No of elements :");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.println("enter elements :");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("The elements of array are ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
		System.out.println("Enter the position of element to be swapped : ");
		int k = sc.nextInt();
		int temp = arr[k - 1];
		arr[k - 1] = arr[size - 1];
		arr[size - 1] = temp;

		System.out.println("The elements of array after swapping");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + "  ");
		}

	}

}
