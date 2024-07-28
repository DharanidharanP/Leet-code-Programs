package TwoPointer;

public class SwapAdjacent_LR_String {

    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(s);
        char[] ch = s.toCharArray();
        int len = ch.length;
        for (int i = 0; i < len - 1; i+=2) {
            char temp = ch[i];
            ch[i] = ch[i + 1];
            ch[i + 1] = temp;
        }
        for (int i = 0; i < len; i++) {
            System.out.print(ch[i]);
        }
        System.out.println();
       
    }
}
