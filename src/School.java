public class School {

    private String schoolName;
    private String address;
    private String email;
    private int fax;

    public School(String name, String address, String email, int fax){
        this.schoolName=name;
        this.address=address;
        this.email=email;
        this.fax=fax;
    }
    private String getSchoolName(){
        return schoolName;
    }
    public void setSchoolName(String name){
        this.schoolName=schoolName;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(){
        this.address=address;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public int getFax(){
        return fax;
    }
    public void setFax(int fax){
        this.fax=fax;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", fax=" + fax +
                '}';
    }
}
