package ds;

public class MyHeap {
    private final int[] a;
    private final boolean reverse;
    private int size = 0;
    public  MyHeap(int capacity){
        this(capacity,false);
    }
    public MyHeap(int capacity,boolean reverse){
        this.reverse = reverse;
        this.a = new int[capacity];
    }
    public void insert(int key){
        a[size] = key;
        swim(size);
        size++;
    }
    private void swim(int i){
        if(i == 0){
            return;
        }
        int p = i/2;
        if(compare(a[i],a[p]) < 0) {
            swap(i, p);
            swim(p);
        }
    }
    private int compare(int i,int j){
        if(reverse){
            return j - i;
        }
        return i - j;
    }
    private void swap(int i,int p){
        int temp = a[i];
        a[i] = a[p];
        a[p] = temp;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    private int getMin(){
        if(reverse){
            throw new RuntimeException("are you stupid? I am max heap");
        }
        if(isEmpty()){
            throw new IllegalStateException("i am empty");
        }
        return a[0];
    }
    private int getMax(){
        if(!reverse){
            throw new RuntimeException("are you stupid? I am min heap");
        }
        if(isEmpty()){
            throw new IllegalStateException("i am empty");
        }
        return a[0];
    }
    public int delMin(){
        int temp = getMin();
        delTop();
        return temp;
    }
    private void delTop(){
        swap(0,size-1);
        size--;
        sink(0);
    }
    private void sink(int i){
        int candidate = i;
        int L = 2 * i;
        if(L >= size){
            return;
        }
        if(compare(a[candidate],a[L]) > 0){
            candidate = L;
        }
        int R = 2 * i + 1;
        if(R < size && compare(a[candidate],a[R]) > 0){
            candidate = R;
        }
        if(candidate != i){
            swap(candidate,i);
            sink(candidate);
        }
    }
    public int delMax(){
        int temp = getMax();
        delTop();
        return temp;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder("Size: "+size+"[ ");
        for(int i = 0;i<size; i++){
            sb.append(a[i]).append(",");
        }
        sb.append(" ]");
        return sb.toString();
    }
}
