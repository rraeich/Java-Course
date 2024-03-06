
public class Officer extends Worker{
    private String department;
    private String hours;

    Officer(String nameSurname,String phoneNumber, String eMail, String department, String hours){
        super(nameSurname,phoneNumber,eMail);
        this.department = department;
        this.hours = hours;
    }

    public String getDepartment(){
        return this.department;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public String getHours(){
        return this.hours;
    }

    public void setHours(String hours){
        this.hours = hours;
    }

    public void work(){
        System.out.println(this.getNameSurname() + " is working now.");
    }
}
