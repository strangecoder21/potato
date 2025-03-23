import java.util.*;
import java.lang.*;
public class selfsufficient {
    static int moneyreq(int n,int earn[],int cost[]){
        int res=0;
        int temp=0;
        for(int i=0;i<n;i++){
            if(cost[i]-earn[i]-temp>=0){
                res+=Math.abs(cost[i]-earn[i]-temp);
                temp=0;
            }
            if(cost[i]-earn[i]<0){
                temp+=Math.abs(cost[i]-earn[i]);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int earn[]=new int[n];
        int cost[]=new int[n];
        for(int i=0;i<n;i++){
            earn[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            cost[i]=sc.nextInt();
        }
        int m=moneyreq(n, earn, cost);
        System.out.println(m);
    }
}
