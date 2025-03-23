public class secondlargetselement {
    static int largestelement(int arr[]){
        int n = arr.length;
        int res=-1,largest=0;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[largest]){
                res=largest;
                largest=i;
            }
            else if(arr[i]!=arr[largest]){
                if(res==-1 || arr[i]>arr[res]){
                    res=i;
                }
            }
        } 
        return res;
    }
    public static void main(String[] args) {
        int arr[]={3,27,36,23,73};
        System.out.println(largestelement(arr));
    }
}
