public class leftrotatebyone {
    static void lRotateone(int arr[]){
        int n= arr.length;
        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
    }
    public static void main(String[] args) {
        int arr[]={3,27,36,23,73};
        lRotateone(arr);
    }
}
