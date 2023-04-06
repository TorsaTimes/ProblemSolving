class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
    List<Integer> temp = new ArrayList<Integer>();
    List<Integer> res = new ArrayList<Integer>();
    for(int i = 0;i<nums1.length;i++){
        for(int y = 0;y<nums2.length;y++){
            if(nums1[i] == nums2[y] && !(res.contains(y))){
                temp.add(nums1[i]);
                res.add(y);
                y = y + 1;
                break;
            }
        }
    }
    int[] r = temp.stream().mapToInt(i->i).toArray();
    return r; 
    }
}
