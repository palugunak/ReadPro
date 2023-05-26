//Initial Template for Java

import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}// } Driver Code Ends


//User function Template for Java


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        String nstr ="";
        char ch;
        for(int i=0;i < str.length();i++){
            ch= str.charAt(i); //extracts each character
            nstr = ch + nstr;
        }
        return nstr;



    }
} 