package Algo.String;

import java.util.Scanner;

public class Funny_String {
	static String funnyString(String s){
		// Complete this function
		boolean flag = false;
		String reverse = new StringBuffer(s).reverse().toString();
		for(int i = 0; i < s.length()-1; i++){
			int result = ((int)s.charAt(i) - (int)s.charAt(i+1));
			int revResult = ((int)reverse.charAt(i) - (int)reverse.charAt(i+1));
			if(Math.abs(result)==Math.abs(revResult)){
				flag = true;
			}else{
				flag = false;
				break;
			}
		}
		if(flag){
			return "Funny";
		}else{
			return "Not Funny";
		}
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }
    }

}
