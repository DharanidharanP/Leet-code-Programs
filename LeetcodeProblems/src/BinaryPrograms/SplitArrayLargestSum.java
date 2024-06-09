package BinaryPrograms;

public class SplitArrayLargestSum {

    public static void main(String[] args) {
        int nums[] = {7, 2, 5, 10, 8};
        int k = 2;
        int start=0;
        int end =0;
        for(int i=0;i<nums.length;i++){
            start=Math.max(start,nums[i]);
            end+=nums[i];
        }
        while(start<end){
            int mid=start+(end-start)/2;
            int sum=0;
            int pieces=1;
           // for(int n:nums){
            for(int i=0;i<nums.length;i++) {
            	 int n = nums[i];
                if(sum+n>mid){
                    sum=n;
                    pieces++;
                }
                else{
                    sum+=n;
                }
            }
            if(pieces>k){
                start=mid+1;
              //  System.out.println("start"+start);
            }
            else{
                end=mid;
               // System.out.println("End..."+end);
            }
        }
        
        System.out.println(end);
        
       
         
        
        
        /*
        int secondSum = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < k; j++) {
                secondSum = sum;
                sum = nums[i] + nums[i + 1];
                System.out.println(nums[i]);
                System.out.println("sum..." + sum + "..secondSum " + secondSum);
                if(sum>secondSum) {
                	System.out.println("if condtion....sum higth."+sum);
                }
                break;
            }
        }    */
    }
}
