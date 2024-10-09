public class Patient extends Person {
    private String patientID;
    private String sectionNumber;
    private double balance;
    private String dischargeStatus;

    public Patient(String patientID, String sectionNumber, double balance, String dischargeStatus,
                   String firstName, String lastName, int departmentCode) {
        super(firstName, lastName, departmentCode);
        this.patientID = patientID;
        this.sectionNumber = sectionNumber;
        this.balance = balance;
        this.dischargeStatus = dischargeStatus;
    }

     public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getSectionNumber() {
        return sectionNumber;
    }

    public void setSectionNumber(String sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDischarge() {
        return dischargeStatus;
    }

    public void setDischarge(String discharge) {
        this.dischargeStatus = discharge;
    }

    @Override
    public String toString() {
        return patientID + " " + super.toString() + " " + sectionNumber + "\n";
    }
}
