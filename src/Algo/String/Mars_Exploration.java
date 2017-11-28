package Algo.String;

import java.util.Scanner;

public class Mars_Exploration {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int count = 0;
        char x = 'S';
        char y = 'O';
        int j = 0; 
        char [] ch = S.toCharArray();
        for( int i = 0; i < S.length(); i++){
        	if(j==0 || j == 2){
        		if(ch[i]!= x){
        			count++;
        		}
        		j++;
        		j = j % 3;
        	}else{
        		if(ch[i]!= y){
        			count++;
        		}
        		j++;
        	}
        }
        System.out.println(count);
    }
}
