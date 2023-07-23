	
	public class Chocolate {
	
		public static void main(String[] args) {
			int[] arr = { 3, 1, 5, 2, 9, 4, 8, 5, 7, 21 };
			int n = arr.length;
			int sischocolate = chocolates(arr, n);
			System.out.println("Sister will eat " + sischocolate + " level taste chocolate");
		}
	
		private static int chocolates(int[] arr, int n) {
			int left = 0;
			int right = n - 1;
			while (left < right) {
				if (arr[left] < arr[right])
					right--;
				else
					left++;
			}
			return arr[right];
		}
	
	}
