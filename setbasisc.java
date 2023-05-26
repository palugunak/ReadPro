import java.util.HashSet;
import java.util.Set;

public class setbasisc {

    public static void main(String args[]){
        Set<Integer> set = new HashSet<>();

        int[] numbers ={1,2,3,3,2,1,4};

        for(int num:numbers){
            set.add(num);

        }
        System.out.println(set);
    }
}
