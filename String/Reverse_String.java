package problems;

public class Reverse_String {
	
    public static void reverseString(char[] s) {
        
    	
    	int len = s.length;
    	char ch;
    	
    	System.out.println(s);
    	
    	for(int i=0; i<len/2; i++) {
    		ch = s[i];
    		s[i] = s[len-i-1];
    		s[len-i-1] = ch;
    	}    	
    	System.out.println(s);
    }

	public static void main(String[] args) {
		
		
		char[] ch = {'H','a','n','n','a','h'};
		reverseString(ch);
	}

}
