package TwoPointer;

public class ReverseString_Usig_K_value {

	public static void main(String[] args) {
     String s="abcdefg";
     char ch[]=s.toCharArray();
     int k=2;
     
     int left=0;
     int right=ch.length-1;
     
     int j=0;
    for(int i=0;i<k;i++) {
    	char temp=ch[i];
    	ch[i]=ch[j];
    	ch[j]=temp;
    }
     for(int i=0;i<ch.length-1;i++) {
    	 System.out.print(ch[i]+" ");
     }
     
	}

}
