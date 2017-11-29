package Algo.String;

import java.util.Scanner;

public class The_Love_Letter_Mystery {
	static int theLoveLetterMystery(String s){
        // Complete this function
		int count = 0;
		int j = s.length()-1;
		for(int i = 0; i < s.length()/2; i++){
			int value = 0;
			if(s.charAt(i) != s.charAt(j)){
				value = Math.abs((int)s.charAt(i)-(int)s.charAt(j));
				count = count + value;
			}
			j--;
		}
		return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = theLoveLetterMystery(s);
            System.out.println(result);
        }
    }

}
