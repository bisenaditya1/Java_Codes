import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in series : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter the elements: ");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("The elements are :");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}

		int seriessum = 0;
		for (int i = 0; i < size; i++) {
			seriessum = seriessum + arr[i];
		}
		System.out.println();
		System.out.println("The sum is :" + seriessum);
	}

}
