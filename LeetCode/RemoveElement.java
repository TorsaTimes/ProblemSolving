class Solution {
    public int removeElement(int[] nums, int val) {
        
        int c = 0;
        int index = nums.length;
        while(c<index){
            if(nums[c] == val){
               nums[c] = nums[index -1];
               index--;
            }
            else {
                c++;
            }
        }
        return index;
    }
}
