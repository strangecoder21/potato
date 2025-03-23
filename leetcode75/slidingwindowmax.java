public class slidingwindowmax{
    static int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int arr[]=new int [n-k+1];
        int curr=nums[0];
        for(int i=1;i<k;i++){
            if(nums[i]>curr){
                curr=nums[i];
            }
        }
        arr[0]=curr;
        int j=1;
        for(int i=k;i<n;i++){
            if(nums[i]>curr){
                curr=nums[i];
            }
            arr[j]=curr;
            j++;
        }
        return arr;
    }
    public static void main(String[] args) {
        int nums[]={1,3,-1,-3,5,3,6,7};
        System.out.println(maxSlidingWindow(nums,3)); 
    }
}