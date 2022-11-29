
public class Person {
    private String name;
    private String gender;
    private String job;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public  void setGender(String gender){
        this.gender = gender;
    }
    public void setJob(String job){
        this.job = job;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public String getGender(){
        return this.gender;
    }
    public String getJob(){
        return this.job;
    }
    public int getAge(){
        return this.age;
    }

}
