class Solution {
    public boolean canJump(int[] nums) {
        int ind =0;
        int max=-1;
        for(int i=0;i<=ind;i++){
            max=Math.max(ind,nums[i]+i);
            ind=max;
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