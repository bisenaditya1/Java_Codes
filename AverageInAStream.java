
public class AverageInAStream {

	private static float[] streamAvg(int[] arr, int n) {
		float[] avg = new float[n];
		float sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			avg[i] = (float) sum / (i + 1);

		}
		return avg;

	}

	public static void main(String[] args) {
		int[] arr = { 5, 10, 15, 20, 25, 30 };
		int n = arr.length;

		float[] average = streamAvg(arr, n);

		for (float avg : average) {
			System.out.printf("%.2f", avg);
			System.out.print("  ");
		}
		;

	}

}
