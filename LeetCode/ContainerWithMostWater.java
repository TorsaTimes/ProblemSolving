class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int sum = 0;
        int temp = 0;
        int h = 0;
        while (left < right) {
             if(height[left] > height[right]){
                    h = height[right];
                }
                else{
                    h = height[left];
                }
                temp = h * (right - left);
                if(temp > sum){
                    sum = temp;
                }
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return sum;
    }
}
