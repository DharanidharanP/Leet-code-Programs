package BinaryPrograms;

public class MissingNumber {

	public static void main(String[] args) {
		int [] nums= {0,1};
		int len =nums.length;
		int len1=len+1;
		int sum=0;
		int sum1=0;
		int miss=0;
		for(int i=0;i<nums.length;i++) {
			sum=sum+nums[i];
		}
		System.out.println("sum..."+sum);
      for(int i=0;i<len1;i++) {
			sum1=sum1+i;
		}
      miss=sum1-sum;
     System.out.println("miss..."+miss);
	}

}
