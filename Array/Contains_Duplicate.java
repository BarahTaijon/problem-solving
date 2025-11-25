package problems;

import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate {

    public static boolean containsDuplicate(int[] nums) {
        
    	Set<Integer> hashS = new HashSet<>();
    	
    	int len = nums.length;
    	
    	for(int i=0; i<len; i++)
    	{
    		if(hashS.contains(nums[i]))
    			return true;
    		else 
    			hashS.add(nums[i]);
    	}
    	
    	return false;
    }
    
	public static void main(String[] args) {
   	//Given an integer array nums, 
	//return true if any value appears at least twice in the array, 
	//and return false if every element is distinct.

        int[] arr = { 4, 5, 6, 4 };
        System.out.println(containsDuplicate(arr));
		
	}

}
