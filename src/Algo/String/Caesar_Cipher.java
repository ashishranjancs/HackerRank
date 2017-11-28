package Algo.String;

import java.util.Scanner;

public class Caesar_Cipher {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
         if(k > 26){
        	k = k%26;
        }
        char[] ch = s.toCharArray();
         for(int i = 0; i < s.length(); i++){
            int asci = (int)ch[i];
            if(asci>=65 && asci <=90){
                if((asci + k )> 90 ){
                    int j = (asci+k)-90;
                    ch[i] = (char)(64 + j); 
                }else{
                	ch[i] = (char)(asci + k );
                }
            }
            if(asci>=97 && asci <=122){
                if ((asci + k )> 122){
                    int j = (asci+k)-122;
                    ch[i] = (char)(96 + j);     
                }else{
                	ch[i] = (char)(asci + k );
                }
            }
          } 
        String text = String.valueOf(ch);
        System.out.println(text);
        }

}
