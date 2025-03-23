public class MolleQueue {
    static class Queue{
        int front,rear,cap;
        int queue[];
        Queue(int c){
            front=rear=0;cap=c;
            queue=new int[cap];
        }
    int getFront(){
        if(isEmpty()){
            return 0;
        }else{
            return queue[front];
        }
    }
    int getRear(){
        if(isEmpty()){
            return -1;
        }else{
            return queue[rear];
        }
    }
    boolean isEmpty(){
        return (cap==0);
    }
    boolean isFull(){
        return (cap==rear);
    }
    void enqueue(int x){
        if(cap==rear){
            return;
        }
        else{queue[rear]=x;
        rear++;}
        return;
    }
    void deque(){
        if(isEmpty()){
            return ;
        }
        for(int i=0;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        size--;
    }
}
    static class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }
    }
}

