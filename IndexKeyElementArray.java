import java.util.Scanner;

public class IndexKeyElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The elements of array are: ");
		int [] arr = {12,5,689,543,35,54};
		for(int i=0; i<6;i++) {
			System.out.println(arr[i]);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key : ");
		int key = sc.nextInt();
		
		for(int i=0; i<6; i++) {
			if(key-1==i)
				System.out.println("the element at key " + key + " is : " + arr[i]);
		}
		
	}

}
