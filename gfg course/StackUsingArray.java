public class StackUsingArray {
    int arr[];
    int cap,top;
    StackUsingArray(int c){
        top=-1;
        cap=c;
        arr=new int[cap];
    }
    void push(int x){
        if(top==cap-1){ System.out.println("Stack full");}
        top++;
        arr[top]=x;
    }
    int pop(){
        int res=arr[top];
        top--;
        return res;
    }
    int peek(){
        if(top==-1){
            System.out.println("Stack empty");
        }
        return arr[top];
    }
    int size(){
        return top+1;
    }
    boolean isEmpty(){
        return (top==-1);
    }
}
class Test{
    public static void main(String args[]){
        StackUsingArray s = new StackUsingArray(5);
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        s.push(30);
    }
}
