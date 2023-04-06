class Solution {
    public int missingNumber(int[] nums) {
        // sort array 
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int r = 0;
        for(int i = 0;i<nums.length;i++){
            System.out.println(nums[i] + " " + i);
            if(!(nums[i] == i)){
                return i;
            }
        }
        return nums.length;
    }
}
