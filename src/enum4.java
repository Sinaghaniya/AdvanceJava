public class enum4 {

    //Declared Enum inside the class
    enum Season{
        Winter,Spring,Summer,Fall
    }

    public static void main(String[]args){

        //Individual Call
        System.out.println("Individual Call:");
        Season s = Season.Winter;

        System.out.println(s);

        //Whole Call
        System.out.println("Whole Call:");
        for(Season s1:Season.values()){
            System.out.println(s1);
        }

    }
}
