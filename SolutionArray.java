import java.io.*;
import java.util.*;

public class SolutionArray {


    public static void main(String[] args) {


        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        ArrayList<ArrayList> listArray = new ArrayList<>();
        for(int i=0;i<N;i++){

            int numOfIntegers = sc.nextInt();
            ArrayList<Integer>  intArraylist= new ArrayList<Integer>();
            for(int j=0;j<numOfIntegers;j++){
                intArraylist.add(new Integer(sc.nextInt()));

            }

            listArray.add(intArraylist);
            sc.nextLine();


        }
        int numQueries = Integer.parseInt(sc.nextLine());
        for(int i=0;i<numQueries;i++){
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            sc.nextLine();
            if(x<listArray.size() && y<listArray.get(x).size()){
                System.out.println(listArray.get(x).get(y));
            }else{
                System.out.println("ERROR!");
            }
        }


    }


}