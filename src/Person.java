public class Person {

    private String name;
    private int age;
    private String email;
    private int phoneNumber;

    public Person(String name,int age, String email, int phoneNumber){
        this.name=name;
        this.age=age;
        this.email=email;
        this.phoneNumber=phoneNumber;


    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
