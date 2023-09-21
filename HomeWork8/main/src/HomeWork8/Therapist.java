package HomeWork8;//терапевт

public class Therapist extends Doctor {
    public void treat() {//метод лечить
        System.out.println("Лечение у терапевта");
    }

    public void Patient(Patient patient) {
        switch (patient.getTreatPlan()) {
            case 1:
                Surgeon sur = new Surgeon();
                patient.setDoctor("Хирург");
                sur.treat();
                break;
            case 2:
                Dentist den = new Dentist();
                patient.setDoctor("Дантист");
                den.treat();
                break;
            default:
                patient.setDoctor("Терапевт");
                treat();
        }
    }
}
