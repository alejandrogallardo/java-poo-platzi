// https://github.com/anncode1/curso-de-java-se-poo

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor();
        myDoctor.name = "Alejandro Gallardo";
        myDoctor.showName();
        myDoctor.showId();

        Doctor myDoctorAle = new Doctor();
        myDoctorAle.showId();

        showMenu();

    }

}
