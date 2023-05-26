public class Array {


    private int[] items;
    private int count;
     //understand the constructor
    public Array(int length){
        items = new int[length];
    }

    public void print(){
        for(int i=0;i<count;i++)
            System.out.println(items[i]);

    }

    public void insert(int item){

        // if araay is full we need resize


        if(items.length == count){
            //create an new array of existing size
             int[] newitems = new int[count *2];

             for(int i=0;i< count;i++){
              newitems[i] = items[i];

              items = newitems;
             }
        }
        //add the new item at end of an array




        items[count++] = item;

    }


}
