public class largestelementinArray {
    static int largestelement(int arr[]){
        int n = arr.length;
        int res=0;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[res]){
                res=i;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={3,27,36,23,73};
        System.out.println(largestelement(arr));
    }
}
