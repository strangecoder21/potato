class lomutopartition{
    static void swap(int x,int y){
        int temp=y;
        y=x;
        x=temp;
    }
    static int lomuto(int a[],int l,int h){
        int i=l-1,pivot=a[h];
        for(int j=l;j<=h-1;j++){
            if(a[j]<pivot){
                i++;
                swap(a[i], a[j]);
            }
        }
        swap(a[i+1], h);
        return i+1;
    }
    public static void main(String[] args) {
        int arr[]={10,80,30,90,40,50,70};
        System.out.println(lomuto(arr, 0, arr.length-1));
    }
}