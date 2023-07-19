import java.util.Arrays;
import java.util.Scanner;

public class MaxElementArraySort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		System.out.println("Enter elements of array");
		int [] arr = new int [size];
		
		
		for( int i=0; i<size; i++) {
			arr[i]= sc.nextInt();
		}
		
		System.out.println("The elements of array are : ");
		for(int i=0; i<size; i++) {
			System.out.println(arr[i]+ "  ");
		}
		
		Arrays.sort(arr);
		System.out.println("The largest element is " + arr[arr.length-1]);
		System.out.println("The 2nd largest element is " + arr[arr.length-2]);
		System.out.println("The smallest element is " + arr[0]);
		
	}

}
