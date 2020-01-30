package leetcode;

public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] nums) {
		if(nums == null || nums.length == 0)
			return 0;
		
        int index = 0;
        for(int i = 1; i < nums.length; i++) {
        	if(nums[i] != nums[index]) {
        		index++;
        		nums[index] = nums[i];
        	}
        }
        return (index+1);
    }
	
	public static void main(String[] args) {
		RemoveDuplicatesFromSortedArray sol = new RemoveDuplicatesFromSortedArray();
		//int[] nums = {1,1,2};
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		
		int len = sol.removeDuplicates(nums);
		System.out.println(len);
		for(int i = 0; i < len; i++)
			System.out.print("" + nums[i] + ", ");
		
	}
}
