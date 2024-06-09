package BinaryPrograms;

public class FindSmallestLetterGreaterThanTarget {

	public static void main(String[] args) {
		char ch[]= {'c','f','j'};
		char target='d';
		char ans=greaterThanTarget(ch,target);
		System.out.println(ans);
		
	}

	private static char greaterThanTarget(char[] ch, char target) {
		
		 int start=0;
		    int end=ch.length-1;
		    while(start<=end){
		        int mid=start+(end-start)/2;
		        System.out.println("mid..."+mid);
		        if(ch[mid]>target){
		            end=mid-1;
		            System.out.println("end.= "+end);
		        }else{
		            start=mid+1;
		            System.out.println("start.. = "+start);
		        }
		    }
		     return ch[start%ch.length];
		
		
		
		/* char result=' ';
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch.length;j++) {
				if(ch[i]<ch[j]) {
				  char temp=ch[i];
				  ch[i]=ch[j];
				  ch[j]=temp;
				}
			}
		}
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==target) {
				result=ch[i+1];
				return result;
			}
		}
		
		return ch[0]; */
	}


}
