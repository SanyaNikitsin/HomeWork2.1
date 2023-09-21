package HomeWork8;//массив из пациентов

public class main2 {
    public static void main(String[] args) {
        Patient[] patients = new Patient[5];
        patients[0] = new Patient(1);
        patients[1] = new Patient(4);
        patients[2] = new Patient(2);
        patients[3] = new Patient(3);
        patients[4] = new Patient(2);
        Therapist thera = new Therapist();
        thera.treat();
        //Dentist dent = new Dentist();
        //dent.treat();
        //Surgeon surg = new Surgeon();
        //surg.treat();
        for (int i = 0; i < 5; i++)
            thera.Patient(patients[i]);
    }
}
