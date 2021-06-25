import java.io.*;
public class min_max_array {
    public void max(int[] a){
        int max=0;
        int n=a.length;
        for(int i=0;i<n;i++){
            if(a[max]<a[i]){
                max=i;
            }
        }
        System.out.println("max: "+a[max]);
    }
    public void min(int[] a){
        int min=0;
        int n=a.length;
        for(int i=0;i<n;i++){
            if(a[min]>a[i]){
                min=i;
            }
        }
        System.out.println("min: "+a[min]);
    }
    public static void main(String[] args) {
        min_max_array obj = new min_max_array();
        int[] a ={12,45,6,88,99};
        obj.max(a);
        obj.min(a);
    }
}
