public class EnumConstants {

    enum Season{
        Winter(5),Spring(10),Summer(15),Fall(20);

        private int value;

        private Season(int value){

        this.value = value;
        }
    }
    public static void main(String[]args){

        for(Season s:Season.values()){

            //Printing the enums with its integer value
            // ie s.value or Winter 5
            System.out.println(s+" "+s.value);
        }

    }
}
