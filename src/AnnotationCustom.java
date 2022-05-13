//Creating Annotation
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation{

    int value();
}

//Applying Annotation
class Hello{

    @MyAnnotation(value=10)
    public void sayHello(){
        System.out.println("hello Myannotation");
    }
}

//Accesing Annotation
public class AnnotationCustom {

    public static void main(String[]args)throws Exception{

     Hello h = new Hello();

     h.sayHello();

     Method m = h.getClass().getMethod("sayHello");

     MyAnnotation manno = m.getAnnotation(MyAnnotation.class);

        System.out.println("value is:"+ manno.value());

    }
}
