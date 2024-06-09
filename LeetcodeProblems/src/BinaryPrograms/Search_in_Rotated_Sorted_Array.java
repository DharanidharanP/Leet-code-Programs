package BinaryPrograms;

import java.util.Arrays;

public class Search_in_Rotated_Sorted_Array {

	public static void main(String[] args) {
		int arr[]= {4,5,6,6,0,1,2};
		int target =0;
		 int[] findIndexs=findIndex(arr,target);
		 System.out.println("index.."+Arrays.toString(findIndexs));

	}

	private static int []findIndex(int[] arr, int target) {
	     int first = -1, last = -1;
	        for (int i=0; i<arr.length;i++) {
	            if (arr[i]==target) {
	                if (first==-1) {
	                    first=i;
	                }
	                last = i;
	            }
	        }
	        return new int[]{first, last};
	    }
	}
