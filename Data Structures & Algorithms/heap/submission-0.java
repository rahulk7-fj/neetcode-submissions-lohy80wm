class MinHeap {

    private List<Integer> heap;

    public MinHeap() {
        heap = new ArrayList<Integer>();
        heap.add(0);
    }

    public void push(int val) {
       heap.add(val);
       bubbleUp();
    }

    public Integer pop() {
        if(heap.size() == 1) return -1;
        if(heap.size() == 2) return heap.remove(1);
        int res = heap.get(1);
        heap.set(1, heap.remove(heap.size()-1));
        bubbleDown(1);
        return res;
    }

    public Integer top() {
          return heap.size() > 1 ? heap.get(1) : -1;
    }

    public void heapify(List<Integer> nums) {
        heap = new ArrayList<Integer>();
        heap.add(0);
        heap.addAll(nums);
        int curr = (heap.size()-1)/2;
        while(curr > 0){
            int i = curr;
            bubbleDown(i);
            --curr;
        }
    }

    private void bubbleUp(){
        int i = heap.size() -1;
        while( i> 1 && heap.get(i) < heap.get(i/2)){
               swap( i, i/2);
               i = i/2;
        }
    }

    private void bubbleDown(int i){
        while( 2 * i < heap.size()){
            if(2*i+1 < heap.size() && (heap.get(2*i+1) < heap.get(2*i)) && heap.get(2*i+1) < heap.get(i)){
                swap(i, 2*i+1);
                i = 2*i+1;
            }else if( heap.get(2*i) < heap.get(i)){
                swap(i, 2*i);
                i = 2*i;
            }else{
                break;
            } 
        }
    }

    private void swap( int i , int j){
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
}
