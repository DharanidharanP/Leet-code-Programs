package BinaryPrograms;

public class FindDublicate {

	public static void main(String[] args) {
		int nums[]= {1,4,2,0,5,2,0};
		  int len =nums.length;
	        int temp=0;
	        for(int i=0;i<len;i++){
	            for(int j=i+1;j<len;j++){
	                if(nums[i]==nums[j]){
	                   temp=nums[j];
	                   System.out.println(temp);
	                }
	            }
	        }
	}

}
