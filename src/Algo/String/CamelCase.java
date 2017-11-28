package Algo.String;

import java.util.Scanner;

public class CamelCase {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int count = 1;
        char [] temp = s.toCharArray();
        for(int i = 0; i < s.length(); i++){
            if(temp[i] >= 65 && temp[i] <= 90){
                count++;
            }
        }
        System.out.println(count);
    }

}
