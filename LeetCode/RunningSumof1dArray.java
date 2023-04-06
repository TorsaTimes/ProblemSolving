class Solution {
    public int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        int res = 0;
        for(int i = 0;i<nums.length;i++){
            // iterate ex. i = 2 --> y/0 --> i/2
            for(int y = 0;y<=i;y++){
                res = res + nums[y];
            }
            arr[i] = res;
            res = 0;
        }
        return arr;
    }
}
