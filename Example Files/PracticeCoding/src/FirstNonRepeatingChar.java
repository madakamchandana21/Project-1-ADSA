import java.util.*;
public class FirstNonRepeatingChar {
	public static void main(String[] args) {
		String s = "aaabccaacdd";
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch,  1);
			}
		}
		for(int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			
			if(map.get(ch) == 1) {
				System.out.println("First Non Repeating character is: " + ch);
				break;
			}
		}
	}

}