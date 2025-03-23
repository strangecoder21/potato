public class maxlenevenoddsubarray {
    static int maxsubarr(int arr[]){
        int n = arr.length;
        int res=1;
        int curr=1;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0 && arr[i-1]%2!=0 || arr[i]%2!=0 && arr[i-1]%2==0 ){
                curr++;
                res++;
            }
        }
    }
}
