package problems;

import java.util.Arrays;

public class Plus_One {

	static public int[] plusOne(int[] digits) {
    	
    	int leng = digits.length; 
    	int leng2 = leng;
 
    	for(int i=leng-1; i>=0; i--){
    		
    		//System.out.println("digits["+i+"] = "+digits[i]);
	        
    		if(digits[i]<9)
	        		{digits[i]++;
	        		break;
	        		}
	        	
	        	else if(digits[i]==9 && i>0)
	        		{
	        		digits[i] = 0;
	        		}
	        	
	        	else if(digits[i]==9 && i==0)
	    		{
	    		digits[i] = 1;
	    		leng2 = leng+1;
	    		break;
	    		}	
        	
        }
    	
		int[] d = new int [leng2];
		
		for(int i = 0; i<leng; i++)
			d[i] = digits[i];
		
		return d;
		 

		
		
    }
	
	public static void main(String[] args) {
		
		int[] nums = {1, 2, 3};
		
		System.out.println(Arrays.toString(plusOne(nums)));
		
		int[] nums2 = {9};
		
		System.out.println(Arrays.toString(plusOne(nums2)));
		
		int[] nums3 = {9,9,9};
		
		System.out.println(Arrays.toString(plusOne(nums3)));
	}

}
