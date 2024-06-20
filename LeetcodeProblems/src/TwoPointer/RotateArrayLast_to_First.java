package TwoPointer;

public class RotateArrayLast_to_First {

	public static void main(String[] args) {
		int rotate[]= {1,2,3,4};
		int k=2;
		int len=rotate.length;
		int temp=rotate[len-1];
		for(int i=len-1;i>0;i--) {
			rotate[i]=rotate[i-1];
		}
		//rotate[0]=temp;
		for(int i=0;i<k;i++) {
			rotate[0]=temp;
			
		}
		for(int i=0;i<len;i++) {
			System.out.print(rotate[i]+" ");
		}
	}

}
