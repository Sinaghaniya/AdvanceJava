public class Enum2 {

    public enum Season{

        Winter,Spring,Summer,Fall
    }

    public static void main(String[]args){

        for(Season s:Season.values()){
            System.out.println(s);
        }

        //Printing Index of the enum
        System.out.println("Value of Winter is :"+Season.valueOf("Winter"));
        System.out.println("Index of Winter is :"+Season.valueOf("Winter").ordinal());
        System.out.println("Index of Summer is:"+Season.valueOf("Summer").ordinal());


    }
}
