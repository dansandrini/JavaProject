import java.util.Scanner;

public class Hospital {
    public Doctors myDoctors = new Doctors();
    public Nurses myNurses = new Nurses();
    public Patients myPatients = new Patients();


    public void addPatient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a Patient ID:");
        String patientID = scanner.nextLine();
        if (patientID.length() != 5) {
            System.out.println("Invalid Input - PatientID should be 5 chars");
        } else {
            if (patientVerifier(patientID)) {
                System.out.println("Error! There is already one patient with this ID.");
            } else {
                System.out.println("Please enter Firstname: ");
                String fname = scanner.nextLine();
                System.out.println("Please enter Lastname: ");
                String lname = scanner.nextLine();
                System.out.println("Please enter Department Code:");
                int departmentCode = scanner.nextInt();
                System.out.println("Please enter Section Number:");
                String sectionNumber = scanner.next();
                System.out.println("Please enter Balance:");
                double balance = scanner.nextDouble();
                System.out.println("Please enter Discharge Status:");
                String dischargeStatus = scanner.next();
                if (fname.length() + lname.length() <= 30) {
                    Patient patient = new Patient(patientID, sectionNumber, balance, dischargeStatus,
                            fname, lname, departmentCode);
                    myPatients.addPatients(patient);
                    System.out.println("Success! Patient has been added to the List");
                } else {
                    System.out.println("Error! Firstname and Lastname should have below 30 characters");
                    return;
                }
            }
        }
    }

    public boolean patientVerifier(String patientID) {
        boolean flag = false;
        for (Patient patient : myPatients) {
            if (patient.getPatientID().equals(patientID)) {
                flag = true;
                break;
            }
        }
        return flag;
    }


    public void addDoctor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a Doctor ID:");
        String doctorID = scanner.nextLine();
        if (doctorID.length() != 5) {
            System.out.println("Invalid Input - DoctorID should be 5 chars");
        } else {
            if (doctorVerifier(doctorID)) {
                System.out.println("Error! There is already one doctor with this ID.");
            } else {
                System.out.println("Please enter Firstname: ");
                String fname = scanner.nextLine();
                System.out.println("Please enter Lastname: ");
                String lname = scanner.nextLine();
                System.out.println("Please enter Department Code:");
                int departmentCode = scanner.nextInt();
                System.out.println("Please enter Years of Practice:");
                int yearsOfPractice = scanner.nextInt();
                System.out.println("Please enter Shift Hours:");
                double shiftHours = scanner.nextDouble();
                if (fname.length() + lname.length() <= 30) {
                    Doctor doctor = new Doctor(doctorID, yearsOfPractice, shiftHours, fname, lname, departmentCode);
                    myDoctors.addDoctors(doctor);
                    System.out.println("Success! Doctor has been added to the List");
                } else {
                    System.out.println("Error! Firstname and Lastname should have below 30 characters");
                    return;
                }
            }
        }
    }

    public boolean doctorVerifier(String doctorID) {
        boolean flag = false;
        for (Doctor doctor : myDoctors) {
            if (doctor.getDoctorID().equals(doctorID)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public void addNurse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a Nurse ID:");
        String nurseID = scanner.nextLine();
        if (nurseID.length() != 5) {
            System.out.println("Invalid Input - NurseID should be 5 chars");
        } else {
            if (nurseVerifier(nurseID)) {
                System.out.println("Error! There is already one nurse with this ID.");
            } else {
                System.out.println("Please enter Firstname: ");
                String fname = scanner.nextLine();
                System.out.println("Please enter Lastname: ");
                String lname = scanner.nextLine();
                System.out.println("Please enter Department Code:");
                int departmentCode = scanner.nextInt();
                System.out.println("Please enter Years of Practice:");
                int yearsOfPractice = scanner.nextInt();
                System.out.println("Please enter Shift Hours:");
                double shiftHours = scanner.nextDouble();
                System.out.println("Please enter Number of Patients:");
                int numberOfPatients = scanner.nextInt();
                if (fname.length() + lname.length() <= 30) {
                    Nurse nurse = new Nurse(nurseID, yearsOfPractice, shiftHours, numberOfPatients,
                            fname, lname, departmentCode);
                    myNurses.addNurses(nurse);
                    System.out.println("Success! Nurse has been added to the List");
                } else {
                    System.out.println("Error! Firstname and Lastname should have below 30 characters");
                    return;
                }
            }
        }
    }

    public boolean nurseVerifier(String nurseID) {
        boolean flag = false;
        for (Nurse nurse : myNurses) {
            if (nurse.getNurseID().equals(nurseID)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public void dischargePatientFromHospital(String patientID) {
        for (Patient patient : myPatients) {
            if (patient.getPatientID().equals(patientID)) {
                myPatients.remove(patient);
                System.out.println("Patient with ID " + patientID + " has been discharged from the hospital.");
                return;
            }
        }
        System.out.println("Patient with ID " + patientID + " not found in the hospital.");
    }

    public void addBalanceToPatientProfile(String patientID, double amount) {
        for (Patient patient : myPatients) {
            if (patient.getPatientID().equals(patientID)) {
                patient.setBalance(patient.getBalance() + amount);
                System.out.println("Balance of $" + amount + " added to the patient's profile (ID: " + patientID + ").");
                return;
            }
        }
        System.out.println("Patient with ID " + patientID + " not found in the hospital.");
    }

    public void deductBalanceFromPatientProfile(String patientID, double amount) {
        for (Patient patient : myPatients) {
            if (patient.getPatientID().equals(patientID)) {
                if (patient.getBalance() >= amount) {
                    patient.setBalance(patient.getBalance() - amount);
                    System.out.println("Deducted $" + amount + " from the patient's profile (ID: " + patientID + ").");
                } else {
                    System.out.println("Insufficient balance in the patient's profile (ID: " + patientID + ").");
                }
                return;
            }
        }
        System.out.println("Patient with ID " + patientID + " not found in the hospital.");
    }

    public void changePatientSectionNumber(String patientID, String newSectionNumber) {
        for (Patient patient : myPatients) {
            if (patient.getPatientID().equals(patientID)) {
                patient.setSectionNumber(newSectionNumber);
                System.out.println("Section number for patient with ID " + patientID + " changed to " + newSectionNumber + ".");
                return;
            }
        }
        System.out.println("Patient with ID " + patientID + " not found in the hospital.");
    }

    public void incrementTheDoctorYearsOfPractice(String doctorID, int years) {
        for (Doctor doctor : myDoctors) {
            if (doctor.getDoctorID().equals(doctorID)) {
                doctor.setYearsOfPractice(doctor.getYearsOfPractice() + years);
                System.out.println("Years of practice for doctor with ID " + doctorID + " incremented by " + years + ".");
                return;
            }
        }
        System.out.println("Doctor with ID " + doctorID + " not found in the hospital.");
    }

    public void incrementTheDoctorShiftHours(String doctorID, double hours) {
        for (Doctor doctor : myDoctors) {
            if (doctor.getDoctorID().equals(doctorID)) {
                doctor.setShiftHours(doctor.getShiftHours() + hours);
                System.out.println("Shift hours for doctor with ID " + doctorID + " incremented by " + hours + ".");
                return;
            }
        }
        System.out.println("Doctor with ID " + doctorID + " not found in the hospital.");
    }

    public void incrementTheNurseShiftHours(String nurseID, double hours) {
        for (Nurse nurse : myNurses) {
            if (nurse.getNurseID().equals(nurseID)) {
                nurse.setShiftHours(nurse.getShiftHours() + hours);
                System.out.println("Shift hours for nurse with ID " + nurseID + " incremented by " + hours + ".");
                return;
            }
        }
        System.out.println("Nurse with ID " + nurseID + " not found in the hospital.");
    }

    public void printAllPatientsList() {
        System.out.println("List of Patients:");
        for (Patient patient : myPatients) {
            System.out.println(patient.toString());
        }
    }

    public void printAllNursesList() {
        System.out.println("List of Nurses:");
        for (Nurse nurse : myNurses) {
            System.out.println(nurse.toString());
        }
    }

    public String getAllNursesList() {
        StringBuilder result = new StringBuilder();
        result.append("List of Nurses:\n");
        for (Nurse nurse : myNurses) {
            result.append(nurse.toString()).append("\n");
        }
        return result.toString();
    }
    public void printAllDoctorsList() {
        System.out.println("List of Doctors:");
        for (Doctor doctor : myDoctors) {
            System.out.println(doctor.toString());
        }
    }

    public void findNursesWithAboveSixYearsPractice() {
        System.out.println("Nurses with more than six years of practice:");
        for (Nurse nurse : myNurses) {
            if (nurse.getYearsOfPractice() > 6) {
                System.out.println(nurse.toString());
            }
        }
    }
}
