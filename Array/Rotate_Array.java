package problems;

import java.util.ArrayDeque;
import java.util.Deque;

public class Rotate_Array {

    public static void rotate(int[] nums, int k) {
    	
    	//define deque
    	Deque<Integer> deque = new ArrayDeque<>();
    	
    	//copy arr into deque print arr & deque before
    	for(int i=0; i<nums.length; i++)
    			{deque.addLast(nums[i]);
    			 //System.out.print(nums[i]+", ");
    			}
   
     
    	for(int i=0; i<k;i++) 
    	{
    		deque.addFirst(deque.getLast());
    		deque.removeLast();
    	} 	
  	  /*for (Integer value : deque) {
	        System.out.print(value+", ");}
	  System.out.println();
	  */
    	int count = 0;
    	for (Integer num : deque)  		
    	    {
    		nums[count++] = num;
    	   // System.out.print(num+", ");
    	    }


    }
	
	public static void main(String[] args) {
		

		/*
		 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
		 * Input: nums = [-1,-100,3,99], k = 2
		 * Output: [3,99,-1,-100]
		 */
		
		int [] arr = {-1,-100,3,99};
		rotate(arr,2);
	}

}
