class Solution {
    public int searchInsert(int[] nums, int target) {
        boolean h = false;
        boolean l = false;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == target){
                return i;
            }
            else if(nums[i] < target){
                h = true;
            }
            else if(nums[i] > target){
                l = true;
            }
            if(h && l){
                return i;
            }
            else if(l && i == 0){
                return 0;
            }
            else if(nums.length-1 == i && l == false && h){
                return i + 1;
            }

        }
        return 0;
    }
}
