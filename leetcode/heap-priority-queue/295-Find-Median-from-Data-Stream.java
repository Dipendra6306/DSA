class MedianFinder {
    PriorityQueue<Integer> min;
    PriorityQueue<Integer> max;
    int cnt;
    public MedianFinder() {
        min=new PriorityQueue<>();
        max=new PriorityQueue<>(Collections.reverseOrder());
        cnt=0;
    }
    
    public void addNum(int num) {
        cnt++;
        if(cnt==1){
            max.add(num);
            return;
        }
        if(cnt==2){
            min.add(num);
            if(max.peek()>min.peek()){
                int a=max.poll();
                int b=min.poll();
                min.add(a);
                max.add(b);
            }
            return;
        }
        if(cnt%2==1){
            int a=max.peek();
            int b=min.peek();
            if(num<=b){
                max.add(num);
            }
            else{
                min.add(num);
                max.add(min.poll());
            }
        }
        else{
            int a=max.peek();
            int b=min.peek();
            if(num>=a){
                min.add(num);
            }
            else{
                max.add(num);
                min.add(max.poll());
            }
        }
    }
    
    public double findMedian() {
        if(cnt%2==1){
            return (double)max.peek();
        }
        else{
            return (max.peek()+min.peek())/2.0;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */