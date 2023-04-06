// class Solution {
//     public void moveZeroes(int[] nums) {
//         int l = nums.length;
//         for(int i = 0;i<nums.length;i++){
//             if(nums[i] == 0){
//                 for(int y = i+1;y<nums.length;y++){
//                     int swap = 0;
//                     if(nums[i] == 0 && nums[y] != 0){
//                         swap = nums[i];
//                         nums[i] = nums[y];
//                         nums[y] = swap;
//                     }
//                 }                
//             }
//         }
//     }
// }

class Solution {
    public void moveZeroes(int[] nums) {
        int l = nums.length;
        int y = 0;
        int swap = 0;
        for(int i = 0;i<nums.length;i++){
            y = i + 1;
              if(nums[i] == 0 && nums[y] != 0){
                swap = nums[i];
                nums[i] = nums[y];
                nums[y] = swap;
                y+=1;
              }
        }
    }
}
