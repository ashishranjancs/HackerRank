package Algo.String;

import java.util.Scanner;

public class Super_Reduced_String {
	
	static String super_reduced_string(String s){
        // Complete this function
        int count = 1;
       StringBuffer sb = new StringBuffer(s);
        boolean flag = true;
        while(flag){
            flag = false;
            for(int i = 0; i < sb.length()-1; i++){
                if(sb.charAt(i)== sb.charAt(i+1)){
                    sb.deleteCharAt(i);
                    sb.deleteCharAt(i);
                    flag = true;
                }
            }
        }
        String text = sb.toString();
       if(text.isEmpty())
        {
            text = "Empty String";
        }
        return text;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
        
            
       
    }

}
