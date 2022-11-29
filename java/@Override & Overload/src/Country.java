public class Country {
    public String name;
    public String language;
    public void CountryLang(){
        System.out.println("English");
    }
    //overLoad Example
    public void addInfo(String name){
        this.name = name;

    }
    public void addInfo(String name,String languge){
        this.name = name;
        this.language = languge;

    }
}
