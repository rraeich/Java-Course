
public class Worker {
    private String nameSurname;
    private String phoneNumber;
    private String eMail;

    Worker(String nameSurname,String phoneNumber, String eMail){
        this.nameSurname = nameSurname;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
    }

    public String getNameSurname() {
        return this.nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String geteMail() {
        return this.eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void entering(){
        System.out.println(this.nameSurname + " entered the University.");
    }

    public void left(){
        System.out.println(this.nameSurname + " left the University.");
    }

    public void refectory(){
        System.out.println(this.nameSurname + " eating meal in the refectory.");
    }
}
