public class maximumdifference {
    static int maxdiff(int arr[]){
        int n =arr.length;
        int min=arr[0],res=arr[1]-arr[0];
        for(int i=1;i<n;i++){
            res=Math.max(res,arr[i]-min);
            min=Math.min(min, arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={4,6,1,2,8,10};
        System.out.println(maxdiff(arr));
    }
}
