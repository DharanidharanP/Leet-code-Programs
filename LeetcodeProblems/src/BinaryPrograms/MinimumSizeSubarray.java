package BinaryPrograms;

public class MinimumSizeSubarray {

	public static void main(String[] args) {
		int target=7;
		int nums[]= {2,3,1,2,4,3};
		int submin =minSubArrayLen(nums,target);
		System.out.println("submin.."+submin);
	}
		 public static int minSubArrayLen(int[] nums, int target) {
		        int a=0;
		        for(int i=0;i<nums.length;i++){
		            for(int j=i+1;j<nums.length;j++){
		                int add=nums[i]+nums[j];
		                if(add==target){
							/*
							 * System.out.println("a.."+a+"    add...." +add+"....i.."+i);
							 */
		                   a=i+1;
		                   System.out.println(a);
		                   return a;
		                }
		                else if(target==nums[i]){
		                     a=i+1;
		                   return a;
		                }
		            }
		        }
		        return 0;

}
}