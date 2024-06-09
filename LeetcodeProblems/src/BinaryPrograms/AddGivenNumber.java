package BinaryPrograms;

public class AddGivenNumber {

	public static void main(String[] args) {
		int arr[]= {3,24,50,79,88,150,345};
		int target=200;
		int a=0;
		int b=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			    int add=arr[i]+arr[j];
			    if(target==add) {
			    	i++;
			    	j++;
			    	a=i;
			    	b=j;
			    	System.out.println("i..."+a);
			    	System.out.println("j..."+b);
			    	System.out.println("add..."+add);
			    }
			}
		}

	}

}
