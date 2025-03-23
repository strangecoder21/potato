public class swapparity {
    public static String swapp(String s){
        char[] arr = s.toCharArray();
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i] && arr[i-1]%2==arr[i]%2){
                char temp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
            }
        }
        String string = new String(arr);
        return string;
    }
    public static void main(String[] args) {
        String s ="7956801";
        String t=swapp(s);
        System.out.println(t);
    }
}
