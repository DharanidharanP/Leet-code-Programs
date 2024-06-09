package BinaryPrograms;

public class RotatedBy90Degree {

	public static void main(String[] args) {
		int n=3;
		int a[][] =   {{1, 2, 3},           //{{3, 6, 9},       00 01 02
	                   {4, 5, 6},          //  {2, 5, 8},       10 11 10
	                   {7, 8, 9}}  ;       /// {1, 4, 7 }};     20 21 22
				 
		
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				int temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}
		for(int i=0;i<n/2;i++) {
		    int []temp=a[i];
	          a[i]=a[n-i-1];
	          a[n-i-1]=temp;
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
			 System.out.print(a[i][j]+" ");
		}
		System.out.println();
		}
		
		
		
//=========================================================================
		
		
	/*	
	                  logic 2
	 
	  for(int i=0;i<n;i++) {
	            for (int j= 0;j< n / 2; j++) {
	                int temp = a[i][j];
	                a[i][j] =a[i][n - j - 1];
	                a[i][n - j - 1] =temp;
	            }
	        }
		 for(int i =0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print(a[i][j] + " ");
	            }
	            System.out.println();
	        }
		
		
		*/
		
//============================================================================		
		 
		/*      Logic 3               
		      
		   for(int i=n-1;i>0;i--) {
			   for(int j=0;j<i;j++) {
				   int temp=a[i][j];
				   a[i][j]=a[j][i];
				   a[j][i]=temp;
			   }
		   }
		   for(int i=n-1;i<n;i--) {
			   for(int j=0;j<n;j++) {
			   System.out.print(a[i][j]+" ");
		   }
			   System.out.println();
		   }
              */
	}

}
