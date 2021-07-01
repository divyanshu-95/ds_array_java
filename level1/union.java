import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class union {
    public static void main(String[] args) {
        Integer a[]={1,2,3,4,5};
        Integer b[]={2,4,6};
        Set<Integer> union=new HashSet<>();
        union.addAll(Arrays.asList(a));
        union.addAll(Arrays.asList(b));
        Integer[] unions = {};
        unions = union.toArray(unions);
        System.out.println(Arrays.toString(unions));
        
        
    }
}
