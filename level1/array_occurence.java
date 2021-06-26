public class array_occurence {
    public static void main(String[] args) {
        int[] a={12,5,5,8,99,5};
        int n=a.length;
        int res=0;
        int num=99;
        for(int i=0;i<n;i++){
            if((a[i])==num){
                res++;
            }
        }
        System.out.println(res);
    }
}
