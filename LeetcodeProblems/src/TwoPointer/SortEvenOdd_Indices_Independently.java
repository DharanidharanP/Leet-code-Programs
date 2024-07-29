package TwoPointer;

public class SortEvenOdd_Indices_Independently {

	public static void main(String[] args) {
		int nums[] = { 4, 1, 2, 3 };
		int ans[] = sortEvenOdd(nums);

	}

	private static int[] sortEvenOdd(int[] nums) {
		int i;
		int len = nums.length;
		for (i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				swap(nums, i, j);
			}
		}
		int []result=new int[len];
		for (i = 0; i < len; i++) {
			for (int j = 0; j <len; j++) {
			if(nums[i]%2==0) {
				if(nums[i]<nums[j]) {
					result[i]=nums[i];
				//s	System.out.println("====1====="+nums[i]);
				}
			}
			else if(nums[i]%2!=0) {
				if(nums[i]<nums[j]) {
					result[i]=nums[i];
				//	System.out.println("====2====="+nums[i]);
				}
			}
			}
		}
		for (i = 0; i < len; i++) {
			System.out.print(result[i]+" ");
		}
		return nums;
	}

	private static void swap(int[] nums, int i, int j) {
		if (nums[i] > nums[j]) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
		}
	}

}
