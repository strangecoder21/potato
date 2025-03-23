public class reverseanarray {
    static void reverse(int arr[]){
        int n=arr.length,low=0,high=n-1;
        while(high>low){
            int temp=arr[high];
            arr[high]=arr[low];
            arr[low]=temp;
            low++;
            high--;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={3,4,2,6,48};
        reverse(arr);
    }
}
