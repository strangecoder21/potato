public class Hoarepartition {
    static void swap(int x,int y){
        int temp=y;
        y=x;
        x=temp;
    }
    static int Hoare(int a[],int l,int h){
        int pivot=a[l],i=l-1,j=h+1;
        while(true){
            do{
                i++;
            }while(a[i]<pivot);
            do{
                j--;
            }
            while(a[j]>pivot);{
                if(i>=j) return j;
                swap(a[i],a[j]);
            }
        }
    }
}
