public class University {

    private String nameUniversity;
    private String address;
    private String email;
    private int fax;

    public University(String name, String address, String email, int fax){
        this.nameUniversity=name;
        this.address=address;
        this.email=email;
        this.fax=fax;
    }
    public String getNameUniversity(){
        return nameUniversity;
    }
    public void setNameUniversity(String name){
        this.nameUniversity=name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(){
        this.email=email;
    }
    public int getFax(){
        return fax;
    }
    public void setFax(int fax){
        this.fax=fax;
    }
    @Override
    public String toString(){
        return "University{"+
                "name from University :"+nameUniversity+'\''+
                ",address from University :" + address+'\''+
                ",email from University :" + email+'\''+
                ",fax from Unuversity: " + fax +'\''+
                '}';
    }}


