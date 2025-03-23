public class KStacksinArray {
    int arr[],top[],next[];
    int free_top=0,K,cap;
    KStacksinArray(int K,int n){
        this.K=K;
        cap=n;
        arr=new int[n];
        top=new int[K];
        next=new int[n];
        for(int i=0;i<K;i++){
            top[i]=-1;
        }
        for(int i=0;i<n-1;i++){
            next[i]=i+1;
        }
        next[n-1]=-1;
    }
    void push(int sn,int x){
        int i=free_top;
        free_top=next[i];
        next[i]=top[sn];
        top[sn]=i;
        arr[i]=x;
    }
    int pop(int sn){
        int i=top[sn];
        top[sn]=next[i];
        next[i]=free_top;
        free_top=i;
        return arr[i];
    }
    boolean isEmpty(int sn){
        return top[sn]==-1;
    }
}
