package BinaryPrograms;

public class MaximumLengthRepeatedSubarray {

	public static void main(String[] args) {
		int nums1[] = {1, 2, 3, 2, 1}; //find sub array ex -321 
		int nums2[] = {3, 2, 1, 4, 7};
		int maxLength = 0;

		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				int length = 0;
				int x = i;
				int y = j;
				while (x < nums1.length && y < nums2.length && nums1[x] == nums2[y]) {
					length++;
					x++;
					y++;
				}
				if (length > maxLength) {
					maxLength = length;
				}
			}
		}
		System.out.println(maxLength);
	}
}
