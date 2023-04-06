class Solution {
    public int majorityElement(int[] nums) {
            if(nums.length == 1){
                return nums[0];
            }
            Map<Integer, Integer> containNum = new HashMap<>();
            int temp = 1;
            int tempY = 0;
            int res = 0;
            for(int i = 0;i<nums.length;i++){
                if(containNum.containsKey(nums[i])){
                    int y = containNum.get(nums[i]) + 1;
                    containNum.put(nums[i], y);
                    if(y > tempY){
                        tempY = y;
                        res = nums[i];
                    }
                }
                else{
                    containNum.put(nums[i], temp);
                }
            }  
            return res;
    }
}
