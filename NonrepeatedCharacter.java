import java.util.HashMap;

public class NonrepeatedCharacter {

    public static void main(String args[]){


       Character ch = nonrepeeatd("a green apple");
        System.out.println(ch);

    }

    static char nonrepeeatd(String str){

        HashMap<Character,Integer> hashMap =new HashMap<>();

        for(Character ch : str.toCharArray()){
            if(hashMap.containsKey(ch)){
                int count = hashMap.get(ch);
                hashMap.put(ch,count+1);


            }

            else hashMap.put(ch,1);
        }




        for(Character chq :str.toCharArray())
            if(hashMap.get(chq) == 1)
                return chq;

        return Character.MIN_VALUE;





    }
}
