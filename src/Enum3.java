
//Calling Enum from Outside
enum Season{

    Winter,Spring,Summer,Fall
}

public class Enum3 {

    public static void main(String[]args){

        //Individual Call
        Season s = Season.Winter;

        System.out.println("Individual Call:");

        System.out.println(s);

        //Whole Call

        System.out.println("Whole enum Call:");

        for(Season s1:Season.values()){
            System.out.println(s1);
        }

    }
}


