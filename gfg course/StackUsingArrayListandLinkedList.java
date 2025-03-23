import java.util.ArrayList;

public class StackUsingArrayListandLinkedList {
    ArrayList<Integer> al= new ArrayList<>();
    void push(int x){
        al.add(x);
    }
    int pop(){
        int res=al.get(al.size()-1);
        al.remove(al.size()-1);
        return res;
    }
    int peek(){
        return al.get(al.size()-1);
    }
    boolean isEmpty(){
        return al.isEmpty();
    }
    int size(){
        return al.size();
    }
}


/*Linked List Implementation of Stack;
public class Node{
    int data;
    Node next;
    Node{int d}{
        Data=d;
        next=null;
    }
}
class MyStack{
    Node head;
    int size;
    MyStack(){
        head=null;
        size=0;
    }
    int size(){
        return size;
    }
    boolean isEmpty(){
        return (head==null);
    }
    void push(int x){
        Node temp = new Node(x);
        temp.next=head;
        head=temp;
        size++;
    }
    int pop(){
        if(head==null){ return Integer.MAX_VALUE;}
        int res= head.data;
        head=head.next;
        size--;
        return res;
    }
    int peek(){
        if(head==null){ return Integer.MAX_VALUE;}
        return head.data;
    }
    Mystack s = new Mystack();
    head=null,size=0;
    s.push(10);
    s.push(20);
    s.push(30);
    s.pop();
}
*/