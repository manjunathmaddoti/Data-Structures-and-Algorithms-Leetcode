class Solution {
    public int majorityElement(int[] nums) {
        int count =0, max = 0;
        for( int num : nums){

            if(count == 0){
                max =num;
                count=1;
            }

            else if(max == num){
                count++;
            }else{
                count--;
            }
        }
        return max;
        
    }
}