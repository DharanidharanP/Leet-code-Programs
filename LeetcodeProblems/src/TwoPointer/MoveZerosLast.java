package TwoPointer;

public class MoveZerosLast {

	public static void main(String[] args) {
		int[]nums = {1,0};
		 int j=0;
	       for(int i=0;i<nums.length;i++){
	        if(nums[i]!=0){
	            int temp=nums[i];
	            nums[i]=nums[j];
	            nums[j]=temp;
	            j++;
	        }
	       }
	       
		/*
		int len =nums.length;
		if(len<=2) {
			 if(nums[0]==0 ||nums[1]==0){
				 System.out.println(".************nums[0] ="+nums[0]);
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				if(nums[i]<nums[j] ) {
					int temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		}
		}
		int count=0;
		for(int i=0;i<len;i++) {
		//	System.out.print(nums[i]+" ");
			if(nums[i]==0) {
				count ++;
				System.out.println("count "+count);
			}
		}
		if(count>=0) {
			System.out.println("if .......");
		int j;
		for(int i=0;i<count;i++) {
			int first=nums[0];
			//System.out.println("nums[0]..{} "+nums[0]);
			
		for( j=0;j<len-1;j++) {				
			nums[j]=nums[j+1];
			//System.out.println("nums[j]..."+nums[j]);
		}
		//System.out.println("first..."+first);
		nums[j]=first;
		}
		}   */
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ..");
		}
	}

}
