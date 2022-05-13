public class enum5 {

    //Declaring Main method/Function inside enum
    enum Season{

        Winter,Spring,Summer,Fall;

        //Semicolon ; is Mandatory here

    public static void main(String[]args){

        Season s = Season.Winter;

        System.out.println(s);

        for(Season s1:Season.values()){
            System.out.println(s1);
        }
    }
    }
}
