package TwoPointer;

public class TwoPointerSamble {

	public static void main(String[] args) {
		int arr[] = { 1, 0, 4, 5, 7, 3, 11, 19, 20 };
		int sum = 7;
		int[] ans = twoPointer(arr, sum);
		if (ans != null) {
			System.out.println("Pair found at indices: " + ans[0] + " and " + ans[1]);
		} else {
			System.out.println("No pair found");
		}
	}

	private static int[] twoPointer(int[] arr, int sum) {
		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			if (arr[left] + arr[right] == sum) {
				return new int[] { left, right };
			} else if (arr[left] + arr[right] < 7) {
				left++;
			} else {
				right--;
			}
		}
		return null;
	}

}
