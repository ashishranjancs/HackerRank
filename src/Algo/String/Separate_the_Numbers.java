package Algo.String;

import java.util.Scanner;

public class Separate_the_Numbers {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            // your code goes here
           
            boolean flag = false;
            long value = 0;
            for(int i = 1; i<=s.length()/2; i++){
            	String s1 = s.substring(0, i);
            	long x = Long.parseLong(s1);
            	value = x;
                
                 String s2 = Long.toString(x);
            	while(s2.length()<s.length()){
            		s2 = s2 +Long.toString(++x);
            	}
            	if(s.equals(s2)){
            		System.out.println("YES "+ value);
            		flag = true;
            		break;
            	}
            }
            if(!flag){
            	System.out.println("NO");
            }
        }
    }

}
