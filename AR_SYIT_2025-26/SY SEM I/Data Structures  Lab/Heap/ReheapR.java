public class ReheapR {
    private int heap[];
    private int capacity;
    private int size;
    ReheapR(int capacity){
        this.capacity = capacity;
        heap = new int[capacity]; // FIX: initialize the heap array
        size = 0;
    }
    private int parent(int i){
        return (i-1)/2;
    }
    private int left(int i){
        return 2*i+1;
    }
    private int right(int i){
        return 2*i+2;
    }
    public void insert(int key){
        if(size == capacity){
            System.out.println("Full! you can't insert new element "+key);
            return;
        }
        heap[size] = key;
        int current = size;
        size++;
        while (current>0 && heap[current]>heap[parent(current)]) {
            int temp = heap[current];
            heap[current] = heap[parent(current)];
            heap[parent(current)] = temp;
            current = parent(current);
        }
    }
    public void reheap(int i){
        int left = left(i);
        int right = right(i);
        int largest = i;
        if(left<size && heap[left]>heap[largest]){
            largest = left;
        }
        if(right<size && heap[right]>heap[largest]){
            largest = right;
        }
        if(largest!=i){
            int temp = heap[i];
            heap[i] = heap[largest];
            heap[largest] = temp;
            reheap(largest);
        }
    }
    public void buildHeap(){
        int start = (size-1)/2;
        for(int i=start;i>=0;i--){
            reheap(i);
        }
    }
    public void delete(){
        if(size == 0){
            System.out.println("Heap is empty");
            return;
        }
        heap[0] = heap[size - 1];
        size--;
        reheap(0);
    }
    public void printHeap(){
        for(int i=0;i<size;i++){
            System.out.print(heap[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ReheapR r = new ReheapR(10);
        r.insert(3);
        r.insert(5);
        r.insert(1);
        r.insert(8);
        r.insert(2);
        r.printHeap();
        r.reheap(0);
        r.printHeap();
        r.delete();
        r.printHeap();

    }
}