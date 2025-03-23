import java.util.Stack;

public class MaxRectangleswith1sStack {
    static int largest_histogram(int arr[],int n){
        Stack<Integer> s8=new Stack<Integer>();
        int res=0,curr=0;
        for(int i=0;i<n;i++){
            while(s8.isEmpty()==false && arr[s8.peek()]>=arr[i]){
                int tp=s8.pop();
                curr=arr[tp]*(s8.isEmpty()?i:i-s8.peek()-1);
                res=Math.max(res,curr);
            }
            s8.push(i);
        }
        while(!s8.isEmpty()){
            int tp=s8.pop();
            curr=arr[tp]*(s8.isEmpty()?n:n-s8.peek()-1);
            res=Math.max(res,curr);
        }
        return res;
    }
    static int maxRectangle(int mat[][],int R,int C){
        int res=largest_histogram(mat[0],C);
        for(int i=1;i<R;i++){
            for(int j=0;j<C;j++){
                if(mat[i][j]==1){
                    mat[i][j]+=mat[i-1][j];
                }
            }
            res=Math.max(res,largest_histogram(mat[i],C));
        }
        return res;


    }
    public static void main(String []args){
        int arr[][]={{0,1,1,0},
        {1,1,1,1},
        {1,1,1,1},
        {1,1,0,0}};
        System.out.println(maxRectangle(arr,4,4));
    }
}
