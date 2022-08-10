public class main {
    public static void main(String[] args) {
        Person p1 = new Person();  // يمثل الشخص محمد مع تحديد كامل خصائصه p1 الكائن
        p1.setName("Mohammed");
        p1.setGender("Male");
        p1.setJob("Programmer");
        p1.setAge(23);
        System.out.println(p1.getName());
        System.out.println(p1.getGender());
        System.out.println(p1.getJob());
        System.out.println(p1.getAge());

    }

}
