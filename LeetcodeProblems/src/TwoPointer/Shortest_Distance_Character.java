package TwoPointer;

public class Shortest_Distance_Character {

	public static void main(String[] args) {
		String s="loveleetcode";
	    char c='e';
	    int previndex=-1;
	    int index=-1;
	    String str="";
	    int temp;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==c) {
				index=i;
				previndex=index;
			}
			for(int j=0;j<=previndex;j++) {
				temp=index-j;
				str=str+temp;
				//previndex=index;
			}
		}
		//str=str+0;
		System.out.println(str);
		System.out.println("3,2,1,0,1,0,0,1,2,2,1,0");
	}

}
