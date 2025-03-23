public class equipoint{
    static boolean epoint(int arr[]){
        int n=arr.length;
        int r=0;
        for(int i=0;i<n;i++){
            r=arr[i]+r;
        }
        int ls=0;
        for(int i=0;i<n;i++){
            r-=arr[i];
            if(ls==r){
                return true;
            }
            ls+=arr[i];
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={3,4,8,-9,9,7};
        System.out.println(epoint(arr));
    }
}