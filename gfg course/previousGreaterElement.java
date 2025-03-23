import java.util.*;
public class previousGreaterElement {
    public static void printprevGreater(int arr[],int n){
        Stack<Integer> s= new Stack<>();
        s.add(arr[0]);
        for(int i=0;i<n;i++){
            while(s.isEmpty()==false && s.peek()<=arr[i]){ s.pop();}
            int pg=s.isEmpty()?-1:s.peek();
            System.out.print(pg+" ");
            s.add(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]= new int[]{};
        printprevGreater(arr, arr.length);
    }
}
