package TwoPointer;

public class MergeSortedArray {

	public static void main(String[] args) {
		int nums1[]= {1};
		int nums2[]= {};
		int m=1;
		int n=0;
		
		
		int index=0;
		for(int i=0;i<m;i++) {
			System.out.print(nums1[i]);
			nums1[index++]=nums1[i];
		}
		System.out.println();
		for(int i=0;i<n;i++) {
			System.out.print(nums2[i]);
			nums1[index++]=nums2[i];
		}
		System.out.println();
		for(int i=0;i<index;i++) {
			for(int j=0;j<index;j++) {
				if(nums1[i]<nums1[j]) {
					int temp=nums1[i];
					nums1[i]=nums1[j];
					nums1[j]=temp;
				}
			}
						
		}
		System.out.println("Final sort output");
		for(int i=0;i<index;i++) {
			System.out.print(nums1[i]+" ");
		}
		
	}

}
