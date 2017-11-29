package Algo.String;

import java.util.Scanner;

public class Beautiful_Binary_String {
	
	static int minSteps(int n, String B){
		// Complete this function
//		boolean flag = false;
		int count = 0;
		StringBuffer sb = new StringBuffer(B);
		for(int i = 0; i < n-2; i++){
			if(sb.charAt(i)=='0' && sb.charAt(i+1) == '1' && sb.charAt(i+2) == '0'){
//				flag = true;
				sb.setCharAt(i+2, '1');
				count++;
//				i = i+3;
			}
		}
		return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        int result = minSteps(n, B);
        System.out.println(result);
    }

}
