package TwoPointer;

public class ReverseCharArray {

	public static void main(String[] args) {
		char[] s= {'i','n','a','r','a','h','D'};
		int len =s.length;
		/*
		    int i = 0;
	        int j = s.length-1;
	        while(i < j) {
	            char temp = s[i];
	            s[i] = s[j];
	            s[j] = temp;

	            i++;
	            j--;
	        }
	        for(int k=0;k<len;k++) {
	        	 System.out.print(s[k]);
	        }
		        */
	
		System.out.println(len);
		String rev="";
		for(int i=len-1;i>=0;i--) {
			if(0!=i) {
        		rev=rev+s[i];
        	}
        	else {
        		rev=rev+s[i];
        	}
        }
        System.out.println(rev);
		
		}
		
	}


