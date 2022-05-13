
import java.io.*;

class Person implements Serializable{

    int id;
    String name;

    //Constructor
    Person(int id,String name){

        this.id = id;

        this.name = name;
    }
}

class Student extends Person{

    String course;

    int fee;

     Student(int id,String name,String course,int fee){

         //Super keyword refers to parent class
        super(id,name);
        this.course=course;
        this.fee=fee;
    }
}

public class Serialization {

    public static void main(String[]args){

        try{
            //Creating the object
            Student s1 = new Student(211,"Akash","Gniit",50000);
            //Creating Stream and writing the object
            FileOutputStream fout = new FileOutputStream("f.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            //closing the stream
            out.close();
            System.out.println("Serialization");
        }catch(Exception e){
            System.out.println(e);
        }

        //Deserialization
        try{
            //Creating stream to read the object
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
            Student s =(Student)in.readObject();

            System.out.println(s.id+" "+s.name+" "+s.course+" "+s.fee);

            in.close();
        }catch (Exception e){

        }

    }
}
