import java.util.Scanner;

public class mergedstringsAlternately{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        char []arr=s1.toCharArray();
        char []arr2=s2.toCharArray();
        int n = s1.length();
        int m = s2.length();
        
            char merged[]= new char[m+n];
            for(int i=0;i<m+n;i+=2){
                if(i<=0){merged[i]=arr[i];}
                else{merged[i]=arr[i-1];}
            }
            for(int i=1;i<m+n;i+=2){
                if(i<=1){merged[i]=arr2[i-1];}
                else{merged[i]=arr2[i-2];}
            }
        System.out.println(merged[3]);
        sc.close();
    }
}