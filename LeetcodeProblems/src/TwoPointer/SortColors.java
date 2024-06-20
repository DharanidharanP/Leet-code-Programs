package TwoPointer;

/*
Given an array nums with n objects colored red, white, or blue, sort 
them in-place so that objects of the same color are adjacent, 
with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the 
color red, white, and blue, respectively.    
   */

public class SortColors {
     //Bubble Sort
	public static void main(String[] args) {
		int nums[]= {2,0,2,1,1,0};
		int red = 0, white = 0, blue = nums.length - 1;
		 while (white <= blue) {
			 System.out.println("nums[white]....= "+nums[white]);
	            if (nums[white] == 0) {
	                swap(nums, red, white);
	                red++;
	                white++;
	                System.out.println("white if .value ="+white);
	                System.out.println("red value ="+red);
	                System.out.println("white value ="+white);
	            } else if (nums[white] == 1) {
	                white++;
	            } else {
	                swap(nums, white, blue);
	                blue--;
	            }
	        }
	    }

	    private static void swap(int[] nums, int i, int j) {
	        int temp = nums[i];
	        nums[i] = nums[j];
	        nums[j] = temp;
	        
	        System.out.println("once sort value = "+nums[i]);
	       
	}
}


