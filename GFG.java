class GFG {
    public static void main (String[] args) {

        String str= "ABBA", nstr="";
        char ch;

        System.out.print("Original word: ");
        System.out.println("Geeks"); //Example word

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }

        System.out.println(nstr);
        if(nstr.equals(str)){
            System.out.println("1");

            
        }
        else System.out.println("0");

    }
}