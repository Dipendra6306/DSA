class Pair{
    int ind;
    int ratio;
    Pair(int ind,int ratio){
        this.ind=ind;
        this.ratio=ratio;
    }
}
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        PriorityQueue<Pair> pq=new PriorityQueue<>((p,q)->Integer.compare(q.ratio,p.ratio));
        for(int i=0;i<boxTypes.length;i++){
            pq.add(new Pair(i,boxTypes[i][1]));
        }
        int ans=0;
        while(truckSize!=0){
            Pair p=pq.poll();
            int i=p.ind;
            if(truckSize>=boxTypes[i][0]){
                truckSize=truckSize-boxTypes[i][0];
                ans+=boxTypes[i][0]*boxTypes[i][1];
            }
            else{
                ans+=truckSize*boxTypes[i][1];
                break;
            }
            if(pq.isEmpty()){
                break;
            }
        }
        return ans;
    }
}