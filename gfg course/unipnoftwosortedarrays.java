public class unipnoftwosortedarrays {
    static void union(int a[],int b[],int m,int n){
        m=a.length;
        n=b.length;
        int i=0,j=0;
        while(i<m &&j<n){
            if(i>0 && a[i]==a[i-1]){i++;continue;}
            if(j>0 && b[i]==b[i-1]){j++;continue;}
            if(a[i]<b[j]){System.out.println(a[i]);i++;}
            else if(a[i]>b[j]){System.out.println(b[j]);j++;}
            else{System.out.println(a[i]);i++;j++;}
            while(i<n){
                if(i>0 && a[i]!=a[i-1]){System.out.println(a[i]);i++;}
            }
            while(j<m){
                if(j>0 && b[j]!=b[j-1]){System.out.println(b[j]);j++;}
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,10,20,20};
        int arr1[]={3,20,40};
        union(arr, arr1, 4, 3);
    }
}
