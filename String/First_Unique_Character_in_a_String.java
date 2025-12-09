package problems;

public class First_Unique_Character_in_a_String {
	
	    public static int firstUniqChar(String s) {
			 
	    	int[] alphabet = new int[26];
			 
			 for(int i=0; i<26; i++)
				 alphabet[i] = 0;
			 
			 for(int i=0; i<s.length(); i++)
			 {
				 alphabet[s.charAt(i)-'a']++;
				 }
			 
			 for(int i=0; i<s.length(); i++)
			 {
				 if(alphabet[s.charAt(i)-'a'] == 1)
					 return i;
				 }		 
			  
			 return -1;
			 }


	public static void main(String[] args) {
		
		System.out.println(firstUniqChar("loveleetcode")); //exp 2 
		System.out.println(firstUniqChar("leetcode")); //exp 0

	}

}
