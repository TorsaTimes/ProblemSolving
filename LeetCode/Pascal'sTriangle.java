class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for(int i = 0;i<numRows;i++){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            temp.removeAll(temp);
            for(int y = 0;y<=i;y++){ 
                temp.add(1);
            }
            res.add(temp);
        }
        for(int i = 2;i<numRows;i++){
            if(i == 2){
                (res.get(2)).set(1, 2);
                continue;
            }
            int indexL = 0;
            int indexR = 1;
            for(int y = 1;y<(res.get(i)).size()-1;y++){
                res.get(i).set(y, res.get(i-1).get(indexL) + res.get(i-1).get(indexR));
                indexL++;
                indexR++;
            }
        }                      
    return res;
    }
}
