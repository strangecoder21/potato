import java.util.*;
public class nextgreaterelement {
    public static void nextGreater(int arr[],int n){
        Stack<Integer> s= new Stack<>();
        s.add(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while(s.isEmpty()==false && s.peek()<=arr[i]){ s.pop();}
            int nextg=s.isEmpty()?-1:s.peek();
            System.out.print(nextg+" ");
            s.add(arr[i]);
        }
        Collections.reverse(s);
    }
    public static void main(String[] args) {
        int arr[]= new int[]{};
        nextGreater(arr, arr.length);
    }
}
