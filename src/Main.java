// https://github.com/anncode1/curso-de-java-se-poo
import model.Doctor;
import model.Patient;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        /*model.Doctor myDoctor = new model.Doctor();
        myDoctor.name = "Alejandro Gallardo";
        myDoctor.showName();
        myDoctor.showId();

        model.Doctor myDoctorAle = new model.Doctor();
        myDoctorAle.showId();

        showMenu();*/

        Doctor myDoctor = new Doctor("Anahí Salgado", "Pediatria");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }



        System.out.println();
        System.out.println();
        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        Patient patient2 = new Patient("Anahi", "anahi@mail.com");

        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        patient2 = patient;

        System.out.println(patient.getName());
        System.out.println(patient2.getName());

        patient2.setName("Manuel");
        System.out.println(patient.getName());
        System.out.println(patient2.getName());

    }

}
