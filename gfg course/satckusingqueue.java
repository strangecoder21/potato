import java.util.LinkedList;
import java.util.Queue;

public class satckusingqueue {
    static class stack{
        static Queue<Integer> q1= new LinkedList<>();
        static Queue<Integer> q2= new LinkedList<>();
        static int cursize;
        static void push(int x){
            q2.add(x);
            while(!q1.isEmpty()){
                q2.add(q1.peek());
                q1.remove();
            }
            Queue<Integer> q =q1;
            q1=q2;
            q2=q;
        }
        static void pop(){
            if(q1.isEmpty()){ return ;}
            int x=q1.remove();
            System.out.println(x);
        }
        static int top(){
            if(q1.isEmpty()){ return -1;}
            return q1.peek();
        }
        static int size(){ return q1.size();}
    }
    public static void main(String[] args) {
        stack s = new stack();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
    }
}
