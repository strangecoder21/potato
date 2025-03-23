import java.util.*;
public class quicksort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Harshit Saha 219303016");
        System.out.print("Enter no of elements ");
        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        QuickSort(array,0,array.length-1);
        for(int i : array){
            System.out.print(i+" ");
        }
        sc.close();
    }
    static void QuickSort(int arr[],int start,int end){
        if(end<=start) return;

        int pivot = partition(arr,start,end);
        QuickSort(arr, start, pivot-1);
        QuickSort(arr, pivot+1, end);
    }
    static int partition(int arr[],int start,int end){
        int pivot = arr[end];
        int i= start-1;
        for(int j=start;j<=end-1;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[end];
        arr[end]=temp;
        return i;
    }
}
