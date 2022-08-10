public abstract class Person {

    private String name;
    private String gender;
    private String birthday;
    private boolean isMarried;

    public Person(String n, String g, String b, boolean i) {
        name = n;
        gender = g;
        birthday = b;
        isMarried = i;
    }


    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public boolean getIsMarried() {
        return isMarried;
    }

    public void setName(String n) {
        name = n;
    }

    public void setGender(String g) {
        gender = g;
    }

    public void setBirthday(String b) {
        birthday = b;
    }

    public void setIsMarried(boolean i) {
        isMarried = i;
    }

    public abstract void displayInfo();

}