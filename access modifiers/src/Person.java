// using of access modifier
// public make the access public to any one ;
// private prevent any one from accsessing the variable
// protected let the classes in the same package and the extended classes to access the variable
// final make it like a constant that have just one value
public class Person {
    public String name;
    private String gender;
    protected String job;
    public final int age;
 public Person(String name , String gender,String job , int age ){
    this.name = name;
    this.gender = gender;
    this.job = job;
    this.age = age;
 }
 void printInfo(){
     System.out.println("Name:" + name);
     System.out.println("Age:" + age);
     System.out.println("GEnder:" + gender);
     System.out.println("Job:" + job);

 }

}
