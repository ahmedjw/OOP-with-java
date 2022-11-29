public class main {
    public static void main(String[] args) {
        Person p1 = new Person("Mohamad", "Male", "Programmer", 21);  // يمثل الشخص محمد مع تحديد كامل خصائصه p1 الكائن
        Person p2 = new Person("Rose", "Female", "Secretary", 22);   // يمثل الشخص روز  مع تحديد كامل خصائصه p2 الكائن
        Person p3 = new Person("Ahmad", "Male", "Doctor", 34);       // يمثل الشخص أحمد مع تحديد كامل خصائصه p3 الكائن
        Person p4 = new Person("Rabih", "Male", "Engineer", 27);

        p1.printInfo();
        p2.printInfo();
        p3.printInfo();
        p4.printInfo();
    }

}
