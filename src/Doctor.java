public class Doctor extends Person {
    private String doctorID;
    private int yearsOfPractice;
    private double shiftHours;

    public Doctor(String doctorID, int yearsOfPractice, double shiftHours,
                  String firstName, String lastName, int departmentCode) {
        super(firstName, lastName, departmentCode);
        this.doctorID = doctorID;
        this.yearsOfPractice = yearsOfPractice;
        this.shiftHours = shiftHours;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
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

    @Override
    public String toString() {
        return doctorID + " " + super.toString() + " Years of Practice: " + yearsOfPractice + "\n";
    }
}

