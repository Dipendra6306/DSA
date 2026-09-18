class Solution {
    public boolean canJump(int[] nums) {
        int ind =0;
        for(int i=0;i<=ind;i++){
            ind=Math.max(ind,nums[i]+i);
            
            if(ind>=nums.length-1){
                return true;
            }
        }
        if(ind>=nums.length-1){
            return true;
        }
        return false;
    }
}