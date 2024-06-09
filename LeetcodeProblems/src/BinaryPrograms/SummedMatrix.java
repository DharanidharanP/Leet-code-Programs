package BinaryPrograms;

public class SummedMatrix {

	public static void main(String[] args) {
		int n=4, q = 7;
		int count=0;
		int [][] arr= {{2,3,4,5}, 
				       {3,4,5,6},
				       {4,5,6,7},
				       {5,6,7,8}};
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				int temp=arr[i][j];
				if(temp==q) {
					count++;
				}
				System.out.print(temp+" ");
			}
			System.out.println();
		}
		System.out.println("count = "+count);
	}

}
