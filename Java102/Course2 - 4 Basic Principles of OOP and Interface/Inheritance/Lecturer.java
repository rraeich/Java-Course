
public class Lecturer extends Academician{

    private int doorNumber;

    public Lecturer(String nameSurname, String phoneNumber, String eMail, String section, String degree, int doorNumber) {
        super(nameSurname, phoneNumber, eMail, section, degree);
        this.doorNumber = doorNumber;
    }

    public int getDoorNumber() {
        return this.doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    public void senateMeeting(){
        System.out.println(this.getNameSurname() + " is currently holding a senate meeting.");
    }

    public void takeExam(){
        System.out.println(this.getNameSurname() + " is giving an exam to the " + this.getSection());
    }
}
