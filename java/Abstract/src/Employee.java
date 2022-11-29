public class Employee extends Person{
    public String Job;
    public Employee (String n,String g,String b,Boolean m,String J){
        super(n,g,b,m);
        this.Job =J;
    }
    @Override
    public void displayInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Gender: " + getGender());
        System.out.println("Birthday: " + getBirthday());
        System.out.println("Specialization: " + Job);
        System.out.println("---------------------------------");
    }
}
