package LogicalPrograms;

import java.util.HashMap;
import java.util.Set;

public class remove_duplicate_charector_from_string {
	
	public static void main(String[] args) {
		
		
	String str = "yabbxyyabbabbbaaa";
		
		//1.create hashmap
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		//2.
		for(int i=0;i<=str.length()-1;i++) {
			char ch = str.charAt(i);
			
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			} else {
				map.put(ch, 1);
			}
			
		}
		System.out.println(map);//{a=6, b=7, x=1, y=3}

		 Set<Character> keys = map.keySet();
		 
		 for(Character key:keys) {
			 System.out.println(key);
		
		
		
		
		
		
		
		 }
		
		
		
		
	}

}
