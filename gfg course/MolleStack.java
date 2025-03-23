import java.io.*;
import java.util.*;
public class MolleStack{
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    Node head;
    int size;
    MolleStack(){
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
        Node temp=new Node(x);
        size++;
        temp.next=head;
        head=temp;
    }
    int pop(){
        if(head==null){
            return -1;
        }
        int res=head.data;
        head=head.next;
        size--;
        return res;
    }
    int peek(){
        return head.data;
    }
    public static void main(String[] args) {
        MolleStack s= new MolleStack();
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s.peek());
    }

    boolean matching(char a , char b){
        return((a=='(' && b==')') || (a=='{' && b=='}')|| (a=='[' && b==']'));
    }
    boolean isBalanced(String str){
        Deque <Character> s = new ArrayDeque<>();
        for(int i=0;i<str.length();i++){
            char x =str.charAt(i);
            if(x=='(' || x=='{'||x=='['){
                s.push(x);
            }else{
                if(s.isEmpty()==true){
                    return false;
                }
                else if(matching(s.peek(), x)==false){
                    return false;
                }
                else{
                    s.pop();
                }
            }
        }
        return(s.isEmpty()==true);
    }
}
