package BinaryPrograms;

public class ArrangingCoins {

	public static void main(String[] args) {
		int no=8;
		
		int arrange=arranging(no);
		System.out.println(arrange);
	}

	private static int arranging(int no) {
		int count = 0;
		while(no>count){
		count++;
		no = no-count;
		}	
		return count;
	}

}
