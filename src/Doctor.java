public class Doctor {
    static int id = 0; // Autoincrement
    String name;
    String speciality;

    public Doctor(){
        System.out.println("Construyendo el Objeto Doctor");
        this.name = "Nombre por defecto";
        this.speciality = "Especialidad por defecto";
        id++;
    }

    public Doctor(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
    }

    public void showName() {
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);
    }
}
