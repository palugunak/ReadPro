import java.util.HashSet;
import java.util.Set;



public class character {


    Set<Character> set = new HashSet<>();

    public  char findfirstrepeatedChar(String str) {
          for(Character ch: str.toCharArray()){

              if(set.contains(ch))
                  return ch;

              set.add(ch);
          }

          return Character.MIN_VALUE;
    }
}
