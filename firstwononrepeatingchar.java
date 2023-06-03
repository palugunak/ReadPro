import java.util.HashSet;

public class firstwononrepeatingchar {


    public static void main(String[] args){

        int arr[] = {2, 3, 7, 9, 11, 2, 3, 11,8};
        int n = arr.length;
        firstwononrepnum(arr);



    }


    public static void firstwononrepnum( int[]arr){

        HashSet<Integer> hashSet = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            if(hashSet.contains(arr[i])){

                hashSet.remove(arr[i]);
            }
            else

            hashSet.add(arr[i]);

        }


        for(int i: hashSet){


            System.out.println(i);
        }



    }
}


