package problems;

import java.util.HashSet;

public class Remove_Duplicates_from_Sorted_Array {
	
	
	/* 
	 * Given an integer array nums sorted in non-decreasing order
	 * remove the duplicates in-place.
	 * The relative order of the elements should be kept the same.
	 * Consider the number of unique elements = k​​​​​​​​​​​​​​. 
	 * After removing duplicates, return the number of unique elements k.
	 * The first k elements of nums should contain the unique numbers in sorted order. 
	 * The remaining elements beyond index k - 1 can be ignored.
	 */
		 
	 /*
	  * int k = removeDuplicates(nums); // Calls your implementation
	  * 
	  * assert k == expectedNums.length;
	  * for (int i = 0; i < k; i++) {
	  * assert nums[i] == expectedNums[i];
	  * }
	  */
		
	/*
	 * Input: nums = [1,1,2]
	 * Output: 2, nums = [1,2,_]
	 * 
	 * Input: nums = [0,0,1,1,1,2,2,3,3,4]
	 * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
	 * */
	

	
	HashSet<Integer> s = new HashSet<>();
	
    public int removeDuplicates(int[] nums) {
      
    	// To maintain the new size of the array
    	int size = 0; 
    	
    	for (int i=0; i<nums.length; i++) {
    		if(!s.contains(nums[i]))
    		{
    			s.add(nums[i]);
    			nums[size++] = nums[i];
    		}
    	}
    	// Return the size of the array 
        // with unique elements
        return size;
    	
    }

	public static void main(String[] args) {

	}

}
