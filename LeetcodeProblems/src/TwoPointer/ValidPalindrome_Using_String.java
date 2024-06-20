package TwoPointer;

public class ValidPalindrome_Using_String {

	public static void main(String[] args) {
		String s="aA";
		
		boolean ans=palindrome(s);
		System.out.println(ans);
		
		}

	private static boolean palindrome(String s) {
		String resultStr="";
		for (int i=0;i<s.length();i++)  
		{  
		if (s.charAt(i)>64 && s.charAt(i)<=122) 
		{  
		resultStr=resultStr+s.charAt(i);  
		}  
		}  
		System.out.println("String after removing special characters: "+resultStr);
		int len=resultStr.length();
		  StringBuilder result = new StringBuilder(resultStr);
		for (int i=0;i<=len-1;i++) {
			char ch=resultStr.charAt(i);
			if(Character.isUpperCase(ch)) {
				result.setCharAt(i, Character.toLowerCase(ch));
			}
		}
		System.out.println("result lower convert = "+result);
		String org=result.toString();
		String rev="";
		for(int i=result.length()-1;i>=0;i--) {
			rev=rev+result.charAt(i);
		}
		System.out.print("reverse String = "+rev);
		if(org.equals(rev)) {
			System.out.println("if condtion success");
			return true;
		}
		return false;
	}    
	}
/*
       int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
        	char currFirst = s.charAt(start);
        	char currLast = s.charAt(last);
        	if (!Character.isLetterOrDigit(currFirst )) {
        		start++;
        	} else if(!Character.isLetterOrDigit(currLast)) {
        		last--;
        	} else {
        		if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
        			return false;
        		}
        		start++;
        		last--;
        	}
        }
        return true; 
 
 */


// amanaplanacanalpanama
// amanaplanacanalpanama
