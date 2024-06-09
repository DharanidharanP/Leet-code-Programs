package BinaryPrograms;

import java.util.Arrays;
import java.util.ArrayList;

public class Intersection_of_TwoArrays {

	public static void main(String[] args) {
		int nums1[] = { 4, 9, 5 };
		int nums2[] = { 9, 4, 9, 8, 4 };
		int len1 = nums1.length;
		int len2 = nums2.length;
		int[] twoarray = intersection(nums1, nums2, len1, len2);
		System.out.println(Arrays.toString(twoarray));
		
	}

	private static int[] intersection(int[] nums1, int[] nums2, int len1, int len2) {
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0;i< nums1.length; i++) {
				if (nums1[i] < nums1[j]) {
					int temp = nums1[i];
					nums1[i] = nums1[j];
					nums1[j] = temp;
				}
			}
		}
		for (int i = 0; i < nums2.length; i++) {
			for (int j = 0;j< nums2.length; j++) {
				if (nums2[i] < nums2[j]) {
					int temp = nums2[i];
					nums2[i] = nums2[j];
					nums2[j] = temp;
				}
			}
		}
		 int i=0,j=0;
		ArrayList<Integer> list = new ArrayList<>();
		while (i < nums1.length && j<nums2.length) {
			// 4 5 9
			// 4,4,8, 9, 9 
			if (nums1[i] < nums2[j]) {
				i++;
			} else if (nums2[j] < nums1[i]) {
				j++;
			} else {
				list.add(nums1[i]);
				i++;
				j++;
			}
		}
		int arr[] = new int[list.size()];
		for (i = 0; i < arr.length; i++) {
			arr[i] = list.get(i);
		}
		return arr;
	}
}
