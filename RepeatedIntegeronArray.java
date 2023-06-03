import java.util.HashMap;
import java.util.Map;

/* longest repated integer on an array*/
public class RepeatedIntegeronArray {

    public static void main(String[] arg){

        int array[] = { 2, 7,7, 4, 9, 1 };


        System.out.println(repeatedElement(array));

    }


    public static int repeatedElement(int[] array){

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i< array.length;i++){

            if(map.containsKey(array[i])){

                int count = map.get(array[i]);
                map.put(array[i], count+1);
            }
            else{

                map.put(array[i],1);
            }


          /*  for(int j=0;j< map.size();j--){
              int max =-1;
              int result = array[0];

              if(){ */
            int max =-1;
            int result = array[0];

            for(Map.Entry<Integer, Integer> item : map.entrySet()){

              if(item.getValue() > max)  {

                  max = item.getValue();
                  result = item.getKey();
              }




              }
            return  result;

        }

        return 0;
    }
}
