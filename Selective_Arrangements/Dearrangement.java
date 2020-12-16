//number of selective arrangements
//Given a number n, find total number of De-arrangements of a set of n elements such that no element appears in its original position

public class Dearrangement {
	public static int arrangement(int input1,int[] input2) {
	
		if(input1==1) {
			return 0;
		}else if(input1==2) {
			return 1;
		}else {
			return (input1-1)*(arrangement(input1-1,input2)+arrangement(input1-2,input2));
		}
		
	}
	public static void main(String[] args) {
		int n = 3;
		int[] arr = {1,2,3};
		System.out.println(arrangement(n,arr));
	}
}
