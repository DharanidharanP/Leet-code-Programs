package TwoPointer;

public class HappyNumbers {

	public static void main(String[] args) {
		int num=19;
		int result =num;
		while (result!=1 && result!=4) {
			System.out.println("result ...."+result);
			result=happyNumber(result);
		}
		if(result ==1) {
			System.out.println("happy number "+ result );
		}
		else {
			System.out.println("not happy ");
		}	
	}

	private static int happyNumber(int result) {
	    int sum =0;
	    int rem =0;
	    while(result>0) {
	    	rem=result%10;
	    	sum=sum+(rem*rem);
	    	int remmulti=rem*rem;
	    	System.out.println(" (rem*rem) {} "+rem+"*"+rem+"...{} "+remmulti);
	    	result=result/10;
	    }
	 
		return sum;
	}

}
