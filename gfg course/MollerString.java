import java.util.Arrays;

public class MollerString {
    public static int longestsubseqs(String str){
        int n= str.length();
        int res=0;
        int i=0;
        int noofchar[]= new int[256];
        Arrays.fill(noofchar, -1);
        for(int j=0;j<n;j++){
            i= Math.max(i, noofchar[str.charAt(j)]+1);
            res=Math.max(res, j-i+1);
            noofchar[str.charAt(j)]=j;
        }
        return res;
    }
    public static int longestpalindsubs(String s){
        StringBuilder r= new StringBuilder(s);
        r.reverse();
        int curr[]= new int[r.length()+1];
        int prev[]= new int[r.length()+1];
        for(int i=1;i<=s.length();i++){
            for(int j=1;j<=s.length();j++){
                if(s.charAt(i-1)==r.charAt(j-1)){
                    curr[j]=1+prev[j-1];
                }else{
                    curr[j]=Math.max(curr[j-1], prev[j]);
                }
                prev=Arrays.copyOf(curr, curr.length);
            }
        }
        return curr[r.length()];
    } 
}
