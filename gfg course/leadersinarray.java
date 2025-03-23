public class leadersinarray {
    static void leader(int arr[]){
        int n = arr.length;
        int lead=arr[n-1];
        System.out.print(lead);
        for(int i=n-2;i>=0;i--){
            if(lead<arr[i]){
                lead=arr[i];
                System.out.println(lead);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={3,27,36,23,73};
        leader(arr);
    }
}
