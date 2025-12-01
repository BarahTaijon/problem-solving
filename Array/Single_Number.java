package problems;

import java.util.HashMap;
import java.util.Map;

public class Single_Number {

    public static int singleNumber(int[] nums) {
    
    	Map<Integer, Integer> countMap = new HashMap<>();
    	
    	for(int i = 0; i<nums.length; i++)
    		countMap.put(nums[i], 0);

    	for(int i = 0; i<nums.length; i++)
    		countMap.put(nums[i], countMap.get(nums[i])+1);
    	
    	for(int i = 0; i<nums.length; i++)
    		if(countMap.get(nums[i]) == 1)
    				return nums[i];
    				
    	return -1;
    }
    
	public static void main(String[] args) {
		int[] nums = {4,1,2,1,2};
		System.out.println(singleNumber(nums));

		int[] nums2 = {2,2,1};
		System.out.println(singleNumber(nums2)); 
	}

}
