package Algo.String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Weighted_Uniform_Strings_Using_HashSet {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int n = in.nextInt();
		
		char[] ch = s.toCharArray();
		Set< Integer> m = new HashSet<Integer>();
		int j = 0;
		m.add(((int)(ch[j])-96));
		String sub = ch[j]+"";
		int subValue = ((int)(ch[j]-96));
		for(int i = 1; i < s.length(); i++){
			if(ch[j]==ch[i]){
				sub = sub+""+ch[i];
				subValue = subValue + ((int)(ch[i]-96)) ;
				if(!m.contains(sub)){
					m.add(subValue);
				}
			}else{
				sub = ch[i]+"";
				subValue = ((int)(ch[i]-96));
				if(!m.contains(sub)){
					m.add(subValue);
				}
			}
			j++;
		}
		for (int a0 = 0; a0 < n; a0++) {
			int x = in.nextInt();
			// your code goes here
			if(m.contains(x)){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
			
		}
	}


}
