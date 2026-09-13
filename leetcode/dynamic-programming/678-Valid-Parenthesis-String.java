class Solution {
    public boolean checkValidString(String s) {
        int minopen=0;
        int maxopen=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                minopen++;
                maxopen++;
            }
            else if(s.charAt(i)==')'){
                minopen--;
                maxopen--;
            }
            else{
                minopen--;
                maxopen++;
            }
            if(maxopen<0){
                return false;
            }
            if (minopen < 0) minopen = 0;
        }
        return minopen==0;
    }
}