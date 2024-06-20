package TwoPointer;

import java.util.Arrays;

public class NextPermutation {

	public static void main(String[] args) {
		int nums[]= {1,2};
	nextPermutation(nums);
	for(int i=0;i<nums.length;i++) {
		System.out.print("This final number ="+nums[i]+" ");
		
	}

	}

	private static void nextPermutation(int[] nums) {
		int []temp=nums;
		int last=0;
		for(int i=0;i<temp.length;i++) {
			//System.out.print("This sort swap no ="+nums[i]+" ");
			last=temp[temp.length-1];
			}
		String num=" ";
		Arrays.sort(nums);
		if(nums==temp && last==nums[nums.length-1] && nums.length>=2) {
			System.out.println("if success");
			for(int i=0;i<nums.length;i++) {
				if(nums.length==2) {
					//System.out.println("inner if");
					int swap=nums[0];
					System.out.println("inner if swap= "+swap);
					nums[0]=nums[1];
					System.out.println("inner if nums[0]= "+nums[0]);
					nums[1]=swap;
					System.out.println("inner if nums[1]= "+nums[1]);
					break;
				}else {
					System.out.println("this is else");
				int swap=nums[1];
				nums[1]=nums[2];
				nums[2]=swap;
				}
			}
		    for(int i=0;i<nums.length;i++) {
			System.out.print("This change swap no ="+nums[i]+" ");
			
			}
		System.out.println();
		}
		else {
			for(int i=0;i<nums.length;i++) {
				//System.out.print("This already swap ="+nums[i]);
				num=num+nums[i];
				
			}
		}	
		System.out.println();
	}

}
