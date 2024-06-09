package BinaryPrograms;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int [] arr= {2,3,0,-1,4};
		int len=arr.length;
		
		insertionSort(arr,len);
		System.out.print(Arrays.toString(arr));
		
	}

	private static void insertionSort(int[] arr, int len) {
		for(int i=1;i<len;i++) {
			for(int j=i;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
				else {
					break;
				}
			}
		}
	}

}
