package HomeWork8;//пациент

public class Patient {
    private int treatPlan;//план лечения
    private String doctor;//доктор
    public Patient(int treatPlan){
        this.treatPlan = treatPlan;
    }

    public int getTreatPlan() {
        return treatPlan;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setTreatPlan(int treatPlan) {
        this.treatPlan = treatPlan;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
}
