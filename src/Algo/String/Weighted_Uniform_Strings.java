package Algo.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Weighted_Uniform_Strings {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int n = in.nextInt();
		
		char[] ch = s.toCharArray();
		Map<String, Integer> m = new HashMap<String, Integer>();
		int j = 0;
		String sub1 = String.valueOf(ch[j]);
		m.put(sub1, ((int)(ch[j])-96));
		String sub = ch[j]+"";
		int subValue = ((int)(ch[j]-96));
		for(int i = 1; i < s.length(); i++){
			if(ch[j]==ch[i]){
				sub = sub+""+ch[i];
				subValue = subValue + ((int)(ch[i]-96)) ;
				if(!m.containsKey(sub)){
					m.put(sub, subValue);
				}
			}else{
				sub = ch[i]+"";
				subValue = ((int)(ch[i]-96));
				if(!m.containsKey(sub)){
					m.put(sub, subValue);
				}
			}
			j++;
		}
		for (int a0 = 0; a0 < n; a0++) {
			int x = in.nextInt();
			// your code goes here
			if(m.containsValue(x)){
				System.out.println("Yes");
			}else{
				System.out.println("NO");
			}
			
		}
	}

}
