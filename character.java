import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;



public class character {


    Set<Character> set = new HashSet<>();

    public char findfirstrepeatedChar(String str) {
        for (Character ch : str.toCharArray()) {

            if (set.contains(ch))
                return ch;

            set.add(ch);
        }

        return Character.MIN_VALUE;
    }


    public char nonrepeatedChar(String str) {

        HashMap<Character, Integer> map = new HashMap<>();

        // lets us check first we have character available in hashmap
        // if available count the how many time the char is there


        for (Character cha : str.toCharArray()) {

            if (map.containsKey(cha)) {

                int count = map.get(cha);
                map.put(cha, count + 1);

            } else {
                map.put(cha, 1);
            }


            for (Character chu : str.toCharArray()) {

                if (map.get(chu) == 1)

                    return chu;
            }


        }
        return Character.MIN_VALUE;

    }

    public char lastnonrepeatedChar(String str) {
        int n = str.length();
        HashMap<Character, Integer> hasmap = new HashMap<>();
        for (int i = 0; i < n; i++) {

            if (hasmap.containsKey(str.charAt(i))) {
                int count = hasmap.get(str.charAt(i));
                hasmap.put(str.charAt(i), count + 1);

            } else {
                hasmap.put(str.charAt(i), 1);
            }

        }


        for (int j = hasmap.size(); j >0;j--) {

            if (hasmap.get(str.charAt(j)) == 1) {

                return str.charAt(j);
            }


        }
        return Character.MIN_VALUE;

    }
}
