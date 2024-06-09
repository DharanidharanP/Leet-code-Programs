package BinaryPrograms;

public class Find_Minimum_in_Rotated_Sorted {

	public static void main(String[] args) {
		int []nums = {3,4,5,1,2};
		int index=nums[0];
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums.length;j++) {
			if(nums[i]<nums[j]) {
				int temp=nums[i];
				nums[i]=nums[j];
				nums[j]=temp;
				
			}
		}
	}
		for(int i=0;i<nums.length;i++) {
			index=nums[0];
		}
		System.out.println("index.4."+index);
	}
}


