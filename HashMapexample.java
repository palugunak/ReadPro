import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMapexample {

    public static void main(String args[]){

        HashSet<Integer> set = new HashSet<>();

        HashMap<String,String> courseTeacher = new HashMap<>();

        courseTeacher.put("History", "Ben");
        courseTeacher.put("Mathematics", "Jeanette");
        courseTeacher.put("Physics", "Lily");

        System.out.println("course offered online");
        System.out.println("=================================");
        for(String i: courseTeacher.keySet()){
            System.out.println(i);
        }

        System.out.println("course offered online");

        for(String j:courseTeacher.values()){
            System.out.println(j);
        }



        System.out.println("java program");


        System.out.println("=========================================================");
        HashMap<Integer,String > map = new HashMap<>();
        map.put(2,"g");
        map.put(3,"a");
        map.put(3,"t");
        map.put(4,"s");
     //   map.containsKey(4);
     //   map.containsValue("palugun");



        System.out.println(map);


        //iteration over the hashmap
        System.out.println("==============================");
        for( int item :map.keySet())
        System.out.println(item);



        for(Map.Entry<Integer, String> value:map.entrySet()){


            System.out.println(value.getValue());
        }

































    }
}
