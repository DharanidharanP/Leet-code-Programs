package BinaryPrograms;

public class SelectionSort {

	public static void main(String[] args) {
		
		 String originalString1 = "example";
		 String originalString2 = "xerox";
		 
	     System.out.println("Original String: " + originalString1);
	     System.out.println("Original String: " + originalString2);
	     
	     char[] charArray1 = originalString1.toCharArray();
	     char[] charArray2=originalString2.toCharArray();
	     selectionSort(charArray1);
	     selectionSort(charArray2);
	     String sortedString1 = new String(charArray1);
	     String sortedString2 = new String(charArray2);
	     System.out.println(sortedString1);
	     System.out.println(sortedString2);
	}

	private static void selectionSort(char[] arr) {
		int len=arr.length;
		int midIndex=0;
		for(int i=0;i<len-1;i++) {
			 midIndex=i;
			for(int j=i+1;j<len;j++) {
				if(arr[midIndex] > arr[j]) {
					midIndex=j;
				}
			}
			
			char temp=arr[midIndex];
			arr[midIndex]=arr[i];
			arr[i]=temp;
		}
	}

	

}
