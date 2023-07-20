import java.util.Arrays;

public class AtLeastTwoGreaterElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,5,2,-8,3,-9,5,-3,8};
		Arrays.sort(arr);
		System.out.print("The elements excluding the two greatest are : "  );
		for(int i=0; i<arr.length-2; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

}
