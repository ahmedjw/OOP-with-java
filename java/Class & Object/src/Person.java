public class Person {
    String name;
    String gender;
    String job;
    int age;
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
