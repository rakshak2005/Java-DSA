
public class MAXIMUMSUBARRAY {
  public static int maxarray(int[] nums) {
	
	  int currentsum = nums[0];
	  int maxsum = nums[0];
	  
	  for (int i=1 ;i< nums.length; i++ ) {
		  currentsum = Math.max(nums[i], currentsum + nums[i]);
		  maxsum = Math.max(maxsum, currentsum);
		  
	  }
	  
	  return maxsum;
	  
  }
	
  
  public static void main (String[] args) {
	  
	  int[] nums = {5,4,-1,7,8};
	  int ans = maxarray(nums);
	  
	 System.out.println(ans);
	  
  }
	
}
