import com.sun.corba.se.spi.orbutil.fsm.Guard;

import java.util.HashMap;
import java.util.HashSet;

public class twoSum {


    public static void main(String[] args){

        int A[] = { 2, 7, 4, 9, 1 };
        int target = 9;

        int[] ints = twoSumexplore(A, target);
        System.out.println(ints);


    }

    private static int[] twoSumexplore(int[] A, int target) {



         /*    for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(numbers[i], i);
        }
         *  */

            HashMap<Integer,Integer> map = new HashMap<>();
          //  HashSet<Integer> hashset = new HashSet<>();
            for(int i=0;i<A.length;i++){

                int compliment =   (target -A[i]);
                if( map.containsKey(compliment)){



                   return  new int[]{map.get(compliment), A[i]};


                }
                map.put(A[i],i);


            }


        return null;
    }

    }




