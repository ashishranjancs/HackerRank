package Algo.String;

import java.util.Scanner;

public class HackerRank_in_a_String {
	
	 public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int q = in.nextInt();
	        
	        String org = "hackerrank";
	        char[] p = org.toCharArray();
	        
	        for(int a0 = 0; a0 < q; a0++){
	        	 int k = 0;
	            String s = in.next();
	            // your code goes here
	            char[] s1 = s.toCharArray();
	            for(int j =0; j<s.length(); j++){
	            	if(p[k] == s1[j]){
	            		k++;
                     if(k==10){
                         break;
                     }
	            	}
	            }  
             if(k == 10){
	            	System.out.println("YES");
	            }else{
                 System.out.println("NO");
             }
	     }
	 }
}
