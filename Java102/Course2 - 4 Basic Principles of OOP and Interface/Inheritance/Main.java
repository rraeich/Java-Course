
public class Main {
    public static void main(String[] args) {

        Worker worker = new Worker("Patrick Willsmith","0913902942","pat@outlook.com");
        Academician academician = new Academician("Pelin Yaşar","547194934","ph1803@love.com.tr","Medicine","Doctor");
        Officer officer = new Officer("Jack Kallow","0329483810","jk15@gmail.com","Software Engineering","09.00 - 17.15");
        Lecturer lecturer = new Lecturer("Guivilia Maximov","839823984","gui99as@istun.edu.eng","Nursing","Professor",17);
        Assistant assistant = new Assistant("Interla Raloenda","0184192875362","in9414@kamr.cex","English","Associate professor","10.00 - 15.00");
        Computing computing = new Computing("Kara Görmezler","017481984","kardo@hotmail.com","Engineering","11.00 - 18.00","Cleaning Computers");
        Security_Officer securityOfficer = new Security_Officer("Engin Laskarow", "6184878392","soa11vl@chefing.eu","Engineering","08.30 - 19.30","Attendance Paper");
        Lab_Assistant labAssistant = new Lab_Assistant("Haluk Alireisoğlu","91848387332","karimasigim@pelincigim.love.tr","Engineering","Professor","10.00 - 18.45");

        labAssistant.enterLabs();
        lecturer.senateMeeting();
        officer.work();
        computing.refectory();
        securityOfficer.guardDuty();
        academician.enterLesson();
        worker.entering();
        assistant.takeQuiz();
    }
}
