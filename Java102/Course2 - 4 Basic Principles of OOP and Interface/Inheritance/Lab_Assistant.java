
public class Lab_Assistant extends Assistant{

    public Lab_Assistant(String nameSurname, String phoneNumber, String eMail, String section, String degree, String officeHours) {
        super(nameSurname, phoneNumber, eMail, section, degree, officeHours);
    }

    public void enterLabs(){
        System.out.println(this.getNameSurname() + " is entered the " + this.getSection() + "'s lab lesson.");
    }
}
