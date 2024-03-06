
public class Computing extends Officer{

    private String mission;

    public Computing(String nameSurname, String phoneNumber, String eMail, String department, String hours, String mission) {
        super(nameSurname, phoneNumber, eMail, department, hours);
        this.mission = mission;
    }

    public String getmission() {
        return mission;
    }

    public void setmission(String mission) {
        this.mission = mission;
    }

    public void networkSetup(){
        System.out.println(this.getNameSurname() + " setuping the network.");
    }
}
