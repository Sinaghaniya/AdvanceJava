public class Enum1 {

    //defining enum inside the class
    public enum Season{
        Winter,Spring,Summer,Fall
    }

    public static void main(String[]args){

        //Traversing the Enum using Advance forloop
        //or lets say printing the Enum values
        for(Season s:Season.values())
            System.out.println(s);

    }
}
