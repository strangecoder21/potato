import java.lang.*;
import java.util.Arrays;
public class Moller_Maersk {
    int secondlargest(int arr[],int n){
        int res=-1,largest=0;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[largest]){
                res=largest;
                largest=i;
            }else if(arr[i]!=arr[largest]){
                if(res ==-1 || arr[i]>arr[res]){
                    res=i;
                }
            }
        }
        return res;
    }

    int removesduplicates(int arr[],int n){
        int res=1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[res-1]){
                arr[res]=arr[i];
                res++;
            }
        }
        return res;
    }

    void leader(int arr[],int n){
        int curlead=arr[n-1];
        System.out.println(curlead);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>curlead){
                curlead=arr[i];
                System.out.println(curlead);
            }
        }
    }

    int maxbuysell(int arr[],int n){
        int res=0;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                res+=(arr[i]-arr[i-1]);
            }
        }
        return res;
    }

    int getwater(int arr[],int n){
        int res=0;
        int larr[]=new int[n];
        int rarr[]=new int[n];
        larr[0]=arr[0];
        for(int i=1;i<n;i++){
            larr[i]=Math.max(arr[i], larr[i-1]);
        }
        rarr[n-1]=arr[n-1];
        for(int i=n-2;i<n-1;i--){
            rarr[i]=Math.max(arr[i],rarr[i+1]);
        }
        for(int i=1;i<n-1;i++){
            res=res+(Math.min(larr[i],rarr[i])-arr[i]);
        }
        return res;
    }

    int count1sina(int arr[],int n){
        int low=0,high=n-1;
        while(low<high){
            int mid=(low+high)/2;
            if(arr[mid]==0){
                low=mid+1;
            }else{
                if(mid==0 || arr[mid-1]==0 ){
                    return n-mid;
                }else{
                    high=mid-1;
                }
            }
        }
        return n;
    }


    void mergesort(int arr[],int low,int high){
        if(high>low){
        int mid=low+(high-low)/2;
        mergesort(arr, low, mid);
        mergesort(arr, mid+1, high);
        mergefunc(arr, low, mid, high);
        }
    }
    void mergefunc(int arr[],int low,int mid,int high){
        int n1=mid-low+1;
        int n2=high-mid;
        int left[]= new int[n1];
        int right[]= new int[n2];
        for(int i=0;i<n1;i++){
            left[i]=arr[low+i];
        }
        for(int j=0;j<n2;j++){
            right[j]=arr[mid+j+1];
        }
        int i=0,j=0,k=low;
        while(i<n1 & j<n2){
            if(left[i] <= right[j]){
                arr[k]=left[i];
                k++;i++;
            }else{
                arr[k]=right[j];
                k++;j++;
            }
        }
        while(i<n1){
            arr[k]=left[i];
            k++;i++;
        }
        while(j<n2){
            arr[k]=right[j];
            k++;j++;
        }
    }
    void partition(int arr[],int l, int h,int p){
        int temp[]= new int[h-l+1];
        int index=0;
        for(int i=l;i<=h;i++){
            if(arr[i]<=arr[p]){
                temp[index]=arr[i];
                index++;
            }
        }
        for(int i=l;i<=h;i++){
            if(arr[i]>arr[p]){
                temp[index]=arr[i];
                index++;
            }
        }
        for(int i=l;i<=h;i++){
            arr[i]=temp[i];
        }
    }
    void qsort(int arr[],int l,int h){
        if(l<h){
            int p= partition(arr, l, h);
            qsort(arr, l, p);
            qsort(arr, p+1, h);
        }
    }

    
    public static void main(String[] args) {
        
    }
}
