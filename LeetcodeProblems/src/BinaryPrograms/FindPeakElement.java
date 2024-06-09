package BinaryPrograms;

public class FindPeakElement {

	public static void main(String[] args) {
        int []nums= {1,2,1,3,5,6,4};
        int max=nums[0];
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
         for(int i=0;i<nums.length;i++){ 
          if(max==nums[i]){
           index=i;
          }
         }
         System.out.println(max+" index is = "+index);
	}

}
