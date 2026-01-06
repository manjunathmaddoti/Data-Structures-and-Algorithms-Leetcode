class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int expectedSum= n*(n+1)/2;
        int currentSum=0;
        for(int i=0;i<n;i++){
            currentSum+=nums[i];
        }
      return( expectedSum - currentSum);
        
        // int n=nums.length;
        // int x=n;
        // for(int i=0;i<n;i++){
        //     x=x^i^nums[i];
        // }
        // return x;
    }
}