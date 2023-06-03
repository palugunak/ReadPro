import java.util.HashMap;
import java.util.Map;

public class GFGG {

    public static void main(String[] args)
    {
        // given string
        String s = "geeksforgeeks";
        int k = 2;
        // map for the mapping
        Map<Character, Integer> map = new HashMap<>();
        // mapping over the string
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
            else {
                map.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry :
                map.entrySet()) {
            if (entry.getValue() == 1) {
                k--;
                if (k == 0) {
                    System.out.println(
                            "The Kth Non-repeating Character is :");
                    System.out.println(entry.getKey());
                    // break after you get the correct
                    // output
                    break;
                }
            }
        }
    }
}