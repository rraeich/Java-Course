
public class Assistant extends  Academician{

    private String officeHours;

    public Assistant(String nameSurname, String phoneNumber, String eMail, String section, String degree, String officeHours) {
        super(nameSurname, phoneNumber, eMail, section, degree);
        this.officeHours = officeHours;
    }

    public String getOfficeHours() {
        return this.officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public void takeQuiz(){
        System.out.println(this.getNameSurname() + " is giving a quiz to the " + this.getSection() + ".");
    }
}
