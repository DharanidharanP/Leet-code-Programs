package BinaryPrograms;

public class KthSmallestElementSortedMatrix {

	public static void main(String[] args) {
		int num[][]= {{1,5,9},{10,11,13},{12,13,15}};
		int len= num.length *num[0].length;
		int len1 =num[0].length;
		int[] nums = new int[len];
		System.out.println("len1...."+len1+" [..overlength..."+len+" ]");
		int index=0;
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				nums[index++]=num[i][j];
			}
		}
		int k=8;
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
			//System.out.print(nums[i]+" ");
			if(k-1==i) {
		    int ans=nums[i];
		    System.out.println(ans+".");
		    break;
			}			
		}
	}

}
