class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[n+m];

        if(m == 0 && n > 0){
            for(int i = 0;i<nums1.length;i++){
            nums1[i] = nums2[i];
            }
        }
 
        else {
        int smallArrLength = n;
        int longArrLength = m;
        int smallArrPosition, longArrPosition, mergedPosition;
        smallArrPosition = longArrPosition = mergedPosition = 0;

        while(smallArrPosition < smallArrLength && longArrPosition < longArrLength) {
            if(nums1[longArrPosition] == nums2[smallArrPosition]){
                res[mergedPosition] = nums1[longArrPosition];
                longArrPosition++;
                mergedPosition++;
                res[mergedPosition] = nums2[smallArrPosition];
                smallArrPosition++;
                mergedPosition++;
            }
             else if (nums2[smallArrPosition] < nums1[longArrPosition]) {
                res[mergedPosition] = nums2[smallArrPosition];
                smallArrPosition++;
                mergedPosition++;
            } else {
                res[mergedPosition] = nums1[longArrPosition];
                longArrPosition++;
                mergedPosition++;
            }
        }

        while (smallArrPosition < smallArrLength) {
            res[mergedPosition] = nums2[smallArrPosition];
            smallArrPosition++;
            mergedPosition++;
        }

        while (longArrPosition < longArrLength) {
            res[mergedPosition] = nums1[longArrPosition];
            longArrPosition++;
            mergedPosition++;
        }
        for(int i = 0;i<nums1.length;i++){
            nums1[i] = res[i];
        }
        }
    }
}
