import java.util.HashMap;
import java.util.Map;

public class HashMapexample {

    public static void main(String args[]){
        HashMap<String,String> courseTeacher = new HashMap<>();

        courseTeacher.put("History", "Ben");
        courseTeacher.put("Mathematics", "Jeanette");
        courseTeacher.put("Physics", "Lily");

        System.out.println("course offered online");

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
        map.put(1,"palugun");
        map.put(2,"ayansh");
        map.put(3,"thoshi");
        map.put(4,"sirisha");
        map.containsKey(4);
        map.containsValue("palugun");



        System.out.println(map);


        //iteration over the hashmap

        for( int item :map.keySet())
        System.out.println(item);

        for(Map.Entry<Integer, String> value:map.entrySet()){
            System.out.println(value.hashCode());
        }



























    }
}
