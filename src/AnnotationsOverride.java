
//@Override annotation is used for giving info
//about the function ie this function is overridden

class Animal{

    void eatSomething(){

        System.out.println("Eat Something");
    }

}

class Dog extends Animal{

    @Override
    void eatSomething(){

        System.out.println("Eating Food");
    }
}


public class AnnotationsOverride {

    public static void main(String[]args){

        Animal a = new Dog();

        a.eatSomething();

    }
}
