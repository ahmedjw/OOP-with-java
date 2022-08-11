//creating Enum And show it's data
//
public class Main {
    enum Days {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
    public static void main (String[] args){
    for (Days D:Days.values()){
        System.out.println(D);
    }

    }


}
