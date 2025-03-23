import java.util.*;
public class mergesort {
    static void printArray(int A[])
    {
        int n = A.length;
        for (int i = 0; i < n; ++i)
            System.out.print(A[i] + " ");
        System.out.println();
    }
    void MergeSort(int A[],int l,int h){
        if(l<h){
            int mid=(l+h)/2;
            MergeSort(A, l, mid);
            MergeSort(A, mid+1, h);
            Merge(A,l,mid,h);
        }
    }
    void Merge(int A[],int l,int mid,int h){
        int n1=mid-l+1;
        int n2=h-mid;
        int lA[]=new int[n1];
        int rA[]=new int[n2];
        for(int i=0;i<n1;i++){
            lA[i]=A[l+i];
        }
        for(int j=0;j<n2;j++){
            rA[j]=A[mid+1+j];
        }
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(lA[i]<=rA[j]){
                A[k]=lA[i];
                i++;
            }
            else{
                A[k]=rA[j];
                j++;
            }
            k++;
        }
        // If elements on the right half are still left
        while (i < n1) {
            A[k] = lA[i];
            i++;
            k++;
        }
        // If elements on the left half are still left to 
        // be put in A[]
        while (j < n2) {
            A[k] = rA[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Harshit Saha 219303016");
        System.out.print("Enter no of elements ");
        int n = sc.nextInt();
        int A[] = new int[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        mergesort ob = new mergesort();
        ob.MergeSort(A, 0, n - 1);
        System.out.print("\nSorted array is ");
        printArray(A);
        sc.close();
    }
}
