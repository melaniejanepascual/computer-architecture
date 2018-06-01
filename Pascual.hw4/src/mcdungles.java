//Change the program so that it prints out the specific denominations of 12, 5, 1

// Received help from Emma/Prof Christman/Nick/Brendan

import java.util.Scanner;
import java.util.*;

public class mcdungles {
	public static void main(String[] args) {
		int[] test = {5, 4, 0, 2, 5, 7, 10, 2, 5, 4, 3, 1};
		restaurant(test);
	}

	public static int restaurant(int[] nums){
		//splitting up the array
		int miles = nums[0];
		int k = nums[1];
		int[] location = new nums[2...k];
		int[] p = new nums[2+k...nums.length];
		
		int maxProfit = nums[nums.length-1] ;
		
		//iterate through the array i
		for(int i = 1; i < location.length; i++) {
			profit[i] = 0;
		}
		
		for(int i = 2; i < location.length; i++) {
			for(int j = 1; j < location.length; j--) {
				int check  = p[j] + checkDistance(location[i], k) * p[i];
					if(check > p[i]) {
						check = p[i];
					} 
			}
			
		}
		
	
		
		return maxProfit;
		
	}
	
	
	
	// helper that checks if it's k distance away
	public static int checkDistance(int[] m, int k) {
	 int status;
		for(int i = 0; i < m.length; i++) {
			for(int j = 1; i < m.length; j++) {
				if(m[i] - m[j] < k) {
					status =  0;
				} else {
					status = 1;
				}
			}
		}
	
	}
	


}