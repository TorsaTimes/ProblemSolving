class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> addAble = new HashSet<Integer>();
        Set<Integer> removeAble = new HashSet<Integer>();
        if(nums.length == 1){
            return nums[0];
        }
        for(int i = 0;i<nums.length;i++){
            if(addAble.contains(nums[i])){
                removeAble.add(nums[i]);
            }else{
                addAble.add(nums[i]);
            }
        }
        for(Integer ele : removeAble){
            addAble.remove(ele);
        }
        return addAble.stream().findFirst().get();
    }
}
