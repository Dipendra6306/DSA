class  Pair{
    int num;
    int freq;
    Pair(int num,int freq){
        this.num=num;
        this.freq=freq;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr=new int[k];
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>((p,q)->Integer.compare(q.freq,p.freq));
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            pq.add(new Pair(entry.getKey(),entry.getValue()));
        }
        for(int i=0;i<k;i++){
            Pair p=pq.poll();
            arr[i]=p.num;
        }
        return arr;
    }
}