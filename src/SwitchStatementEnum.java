
public class SwitchStatementEnum {

    enum Day{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
    }

    public static void main(String[]args){

    Day day = Day.Sunday;

    switch(day){

        case Sunday:

            System.out.println("Sunday");
        break;

        case Monday:

            System.out.println("Monday");
        break;

        default:
            System.out.println("The other Day");
        break;
    }

    }
}
