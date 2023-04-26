class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int originalLength = ransomNote.length();
        int rLength = ransomNote.length();
        int mLength = magazine.length();

        if(rLength > mLength){
            return false;
        }

        int countTrue = 0;
        
        for(int i = 0;i<mLength;i++){
            for(int y = 0;y<rLength;y++){
                if(magazine.charAt(i) == ransomNote.charAt(y)){
                    countTrue++;
                    ransomNote = ransomNote.substring(0, y) + ransomNote.substring(y+1);
                    rLength--;
                    break;
                }
                else{
                    continue;
                }
            }
            
        }
        
        if(countTrue != originalLength){
            return false;
        }

        return true;

    }
}
