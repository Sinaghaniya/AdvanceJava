
import java.util.ArrayList;

//Suppress Warning will suppress the yellow
// error which is shown by compiler

public class AnnotationsSuppressWarning {

    @SuppressWarnings("unchecked")

    public static void main(String[]args){

        ArrayList list = new ArrayList();

        list.add("sonoo");
        list.add("vimal");
        list.add("Jack");


        for(Object obj:list){
            System.out.println(obj);
        }

    }
}
