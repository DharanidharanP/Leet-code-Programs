package BinaryPrograms;

public class ValidTriangleNumber {

	public static void main(String[] args) {
		int nums[]= {4,2,3,4}; // a+b >c (ex 4+2 >3) 
		int len =nums.length;
		int add=0;
		int count =0;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				add=nums[i]+nums[j];
				for(int k=j+1;k<len;k++) {
					if(add>nums[k]) {
						count++;						
					}
					 else{
	                        break;
	                   }
				}
			}
		}
		System.out.println(count);
	}

}
