package TwoPointer;

public class RemoveDuplicatesfromSortedArrayII {

	
	/*
	  
	   int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (j == 1 || nums[i] != nums[j - 2]) {
                nums[j++] = nums[i];
            }
        }
        return j; 
	
	 */
	public static void main(String[] args) {
		int nums[] = {1,1,1,2,2,3}; //output  1,1,2,2,3,_
		
		
		  int count1=0;
		  int count2=0;
		  int count3=0;
		  int totalcount=0;
		  String num="";
		 
		 
       for(int i=0;i<nums.length;i++) {
    	   if(nums[i]==1 && count1<2) {
    		   num=num+nums[i]+" ";
    		 count1 ++; 
    		 
    	   }
    	   else if(nums[i]==2 && count2<2) {
    		   num=num+nums[i]+" ";
    		   count2++;
    	   } else if(nums[i]==3 && count3<2) {
    		   num=num+nums[i]+" ";
  		       count3 ++;
    	   }
    	   else {
    	    
    	   }
       }
       totalcount=count1+count2+count3;
       System.out.println(totalcount);
       System.out.print(num); 
	}

}
