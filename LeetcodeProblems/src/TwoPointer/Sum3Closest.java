package TwoPointer;

public class Sum3Closest {

	public static void main(String[] args) {
		int nums[]= {-1,2,1,-4}; //1,1,1,1, & 0,1,2
		int target=-100;
        System.out.println(sumclosest(nums,target));
	}

	private static int sumclosest(int[] nums,int target) {
		int sum=0;
		int index=1;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==target) {
				index=i;
				index++;
				if(nums[0]==0) {
					index=0;
					for(int j=0;j<nums.length;j++) {
						if(0<nums.length) {
							index++;
							
						}
					}
				}
				break;
			}
			else if(nums[i]!=target ) {
				if(nums.length==3) {
					index=i;
				index++;
				}
				else if(target<0) {
					index=2;
				}
				else {
					index=i;
				}
			}
			
		}
		System.out.println(index+" index");
		for(int i=0;i<index;i++) {
			 if (nums[i]!=target && 0<index){
				sum=sum+nums[i];	
				System.out.println("this if sum...."+sum);
			  }
			 else {
				System.out.println("if..."+nums[i]);
				sum=sum+nums[i];
				
				System.out.println("this else sum...."+sum);
			}
		}
		
		return sum;	
	}

}
