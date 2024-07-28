package TwoPointer;

public class SubStringBinaryCount {

	public static void main(String[] args) {
		String s="0010011";
		int ans =countBinarySubstrings(s);
		System.out.println(ans);
	}

	private static int countBinarySubstrings(String s) {
		System.out.println(s);
		int i;
	    int prev=0;
	    int currentlen=1;
	    int count=0;
	    
	    int len=s.length();
	    for(i=1;i<s.length();i++) {
	    	if(s.charAt(i)==s.charAt(i-1)) {
	    		currentlen++;
	    	}
	    	else {
	    		prev=currentlen;
	    		System.out.println("i..= "+i+" prev..."+prev );
	    		currentlen=1;
	    	}
	    	if(prev>=currentlen) {
	    		count ++;
	    	}
	    }
	    
		return count;
	}

}
