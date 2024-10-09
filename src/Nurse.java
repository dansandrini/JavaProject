public class Nurse extends Person {
    private String nurseID;
    private int yearsOfPractice;
    private double shiftHours;
    private int numberOfPatients;

    public Nurse(String nurseID, int yearsOfPractice, double shiftHours, int numberOfPatients,
                 String firstName, String lastName, int departmentCode) {
        super(firstName, lastName, departmentCode);

        this.nurseID = nurseID;
        this.yearsOfPractice = yearsOfPractice;
        this.shiftHours = shiftHours;
        this.numberOfPatients = numberOfPatients;
    }

    public String getNurseID() {
        return nurseID;
    }

    public void setNurseID(String nurseID) {
        this.nurseID = nurseID;
    }

    public int getYearsOfPractice() {
        return yearsOfPractice;
    }

    public void setYearsOfPractice(int yearsOfPractice) {
        this.yearsOfPractice = yearsOfPractice;
    }

    public double getShiftHours() {
        return shiftHours;
    }

    public void setShiftHours(double shiftHours) {
        this.shiftHours = shiftHours;
    }

    public int getNumberOfPatients() {
        return numberOfPatients;
    }

    public void setNumberOfPatients(int numberOfPatients) {
        this.numberOfPatients = numberOfPatients;
    }

    @Override
    public String toString() {
        return nurseID + " " + super.toString() + " Years of Practice: " + yearsOfPractice + "\n";
    }
}