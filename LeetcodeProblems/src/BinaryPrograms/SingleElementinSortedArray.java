package BinaryPrograms;

public class SingleElementinSortedArray {

	public static void main(String[] args) {
		int nums[]= {3,3,7,7,10,11,11};
		System.out.println(nums.length);
		 System.out.println(singleElement(nums));
		 
	    }

	private static int singleElement(int[] nums) {
		int left = 0;
        int right = nums.length - 1;	        
        while (left < right) {
            int mid = right+(left - right)/2;
            if (mid% 2 ==1) {
                mid--;
            }
            if (nums[mid] != nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 2;
            }
        }
        return nums[left];
	}
	}


	


