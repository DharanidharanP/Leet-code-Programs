package TwoPointer;

public class RotateArrayFirsttoLast {

	public static void main(String[] args) {
		int nums[]= {1,2,3,4};
		int len=nums.length;
		int n=2;
		int j;
			for(int i=0;i<n;i++) {
				int first=nums[0];
				System.out.println("nums[0]..{} "+nums[0]);
				
			for( j=0;j<len-1;j++) {				
				nums[j]=nums[j+1];
				System.out.println("nums[j]..."+nums[j]);
			}
			System.out.println("first..."+first);
			nums[j]=first;
			}
			for(int i=0;i<len;i++) {
				System.out.print(nums[i]+" ");
			}
		}		
	}

