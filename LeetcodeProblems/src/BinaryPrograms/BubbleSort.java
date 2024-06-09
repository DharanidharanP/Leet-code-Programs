package BinaryPrograms;

public class BubbleSort {

	public static void main(String[] args) {
		int [] arr= {2,3,0,-1,4};
		int len=arr.length;
		
		bubbleSort(arr,len);
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void bubbleSort(int[] arr, int len) {
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		
	}

}
