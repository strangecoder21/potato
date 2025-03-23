public class movezerostoend {
    static void zero(int arr[]){
        int n=arr.length;
        int count = 0;
        for(int i=0;i<n;i++){
            int temp=0;
            if(arr[i]!=0){
                temp=arr[count];
                arr[count]=arr[i];
                arr[i]=temp;
                count++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,4,0,1,4,0};
        zero(arr);
    }
}
