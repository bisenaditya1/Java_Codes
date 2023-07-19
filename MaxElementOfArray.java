import java.util.Scanner;

public class MaxElementOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter elsements of array " + "\t");

		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}

		System.out.println("The elements of array are ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + "  ");
		}
		System.out.println();
		System.out.println("The max element is :");
		int maxelement = array[0];
		for (int i = 0; i < size; i++) {
			if (array[i] > maxelement)
				maxelement = array[i];
		}

		System.out.println(maxelement);

	}

}
