class MedianFinder {
    private PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());
    private PriorityQueue<Integer> right = new PriorityQueue<>();
    private boolean even = true;
    
    public void addNum(int num) {
        if(even){
            left.offer(num);
            right.offer(left.poll());
        }else{
            right.offer(num);
            left.offer(right.poll());
        }
        even =! even;
    }
    
    public double findMedian() {
        if(even){
            return (left.peek() + right.peek()) / 2.0;
        }else{
            return right.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */