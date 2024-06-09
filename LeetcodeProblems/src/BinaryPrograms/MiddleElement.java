package BinaryPrograms;

public class MiddleElement {

	public static void main(String[] args) {
		 int[] nums = {0,1};
		 int len=nums.length;
		 System.out.println("lenth..."+len);
		 int n = nums.length;
	        int start = 0;
	        int end = n-1;
	        while(start <= end){
	            int mid = start + (end - start)/2;
	            System.out.println("mid... "+ mid);
	            if(nums[mid] < n-mid){
	                start = mid+1;
	                System.out.println("start..."+start);
	            }else {
	                end = mid-1;
	                System.out.println("end..."+end);
	            }
	             int b=n-start;
	             System.out.println("b..."+b);

	/*	 if(nums.length%2==0) {
			 int x = nums[(nums.length/2) - 1];
	         System.out.println(x+"..x..");
	          if(nums.length!=0){
				 int z = len/2;
		         System.out.println("The middle elements is: ");
		         System.out.println(z+"....z");
		         if(nums[0]==0){
					 int b=0;
					 System.out.println("b..."+b);
				 }
			 }
	          int y = nums[nums.length/2];
	          System.out.println(y+"..y..");
		 }
		 else if(nums.length>1){
			 int z = nums[nums.length/2];
	         System.out.println("The middle elements is: ");
	         System.out.println(z+"..else if..z");
		 }
		 else if(len>=1){
			 int a=len;
			 System.out.println("a..."+a);
			 if(nums[0]==0){
				 int b=0;
				 System.out.println("b..."+b);
			 }   */
		 }

	}

}
