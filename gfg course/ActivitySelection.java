import java.util.*;
import java.io.*;
import java.lang.*;
public class ActivitySelection {
    int start;
    int finish;
    ActivitySelection(int s,int f){
        start=s;
        finish=f;
    }
}
class MYCmp implements Comparator<ActivitySelection>{
    public int compare(ActivitySelection a1, ActivitySelection a2){
        return a1.finish-a2.finish;
    }
}
class game{
    static int maxActivity(ActivitySelection arr[],int n){
        Arrays.sort(arr,new MYCmp());
        int res=1;
        int prev=0;
        for(int curr=1;curr<n;curr++){
            if(arr[curr].start>=arr[prev].finish){
                res++;
                prev=curr;
            }
        }
        return res;
    }
    public static void main(String[] args){
        ActivitySelection arr[]= {new ActivitySelection(12,25),
            new ActivitySelection(10,20),
            new ActivitySelection(20,30)};
        int n=3;
        System.out.println(maxActivity(arr, n));
    }
}