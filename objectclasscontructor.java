class book {
    String read ;
    int write;

    public void daynight (String read ){
        System.out.println(read);
    }
    public void daynight (int write ){
        System.out.println(write);
    }

}


public class objectclasscontructor {
    public static void main (String args[]){
        book book1 = new book();
//        book book2 = new book();
        book1.read ="first";
        book1.write= 35 ;
//        book2.read ="third";
//        System.out.println(book1.read+" "+book1.write+book2.read);

        book1.daynight(book1.write);


}

        }