class Solution {
    public long countCommas(long n) {
        String s=String.valueOf(n);
        if(s.length()<4){
            return 0l;
        }
        long ans=0l;
        long k=1l;
        for(int i=4;i<=s.length();i=i+3){
            if(s.length()>i+2){
                ans+=k*999l*(long)Math.pow(10,i-1);
                k=k+1l;
            }
            else{
                ans+=k*(n-(long)Math.pow(10,i-1)+1l);
                break;
            }
        }
        return ans;
    }
}