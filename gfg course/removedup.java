public class removedup {
    static int remove_duplicate_sorted_array(int arr[]){
        int n=arr.length;
        int res=1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[res-1]){
                arr[res]=arr[i];
                res++;
            }
        }
        return res;
    }
}
