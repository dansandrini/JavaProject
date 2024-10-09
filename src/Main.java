import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please select one of the following options: \n" +
                    "1. Add Patient \n" + "2. Add Doctor \n" + "3. Add Nurse \n" +
                    "4. Discharge Patient \n" + "5. Add Balance to Patient Profile \n" +
                    "6. Deduct Balance from Patient Profile \n" + "7. Change Patient Section Number \n" +
                    "8. Increment Doctor's Years of Practice \n" + "9. Increment Doctor's Shift Hours \n" +
                    "10. Increment Nurse's Shift Hours \n" + "11. Print All Patients List \n" +
                    "12. Print All Doctors List \n" + "13. Find Nurses with Above Six Years Practice \n" +
                    "14. Exit \n");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    hospital.addPatient();
                    break;
                case "2":
                    hospital.addDoctor();
                    break;
                case "3":
                    hospital.addNurse();
                    break;
                case "4":
                    System.out.println("Enter Patient ID to discharge: ");
                    String patientID = scanner.nextLine();
                    hospital.dischargePatientFromHospital(patientID);
                    break;
                case "5":
                    System.out.println("Enter Patient ID: ");
                    String id1 = scanner.nextLine();
                    System.out.println("Enter Amount to Add: ");
                    double amount1 = scanner.nextDouble();
                    hospital.addBalanceToPatientProfile(id1, amount1);
                    break;
                case "6":
                    System.out.println("Enter Patient ID: ");
                    String id2 = scanner.nextLine();
                    System.out.println("Enter Amount to Deduct: ");
                    double amount2 = scanner.nextDouble();
                    hospital.deductBalanceFromPatientProfile(id2, amount2);
                    break;
                case "7":
                    System.out.println("Enter Patient ID: ");
                    String id3 = scanner.nextLine();
                    System.out.println("Enter New Section Number: ");
                    String sectionNumber = scanner.nextLine();
                    hospital.changePatientSectionNumber(id3, sectionNumber);
                    break;
                case "8":
                    System.out.println("Enter Doctor ID: ");
                    String docID = scanner.nextLine();
                    System.out.println("Enter Years to Increment: ");
                    int years = scanner.nextInt();
                    hospital.incrementTheDoctorYearsOfPractice(docID, years);
                    break;
                case "9":
                    System.out.println("Enter Doctor ID: ");
                    String docID2 = scanner.nextLine();
                    System.out.println("Enter Hours to Increment: ");
                    double hours = scanner.nextDouble();
                    hospital.incrementTheDoctorShiftHours(docID2, hours);
                    break;
                case "10":
                    System.out.println("Enter Nurse ID: ");
                    String nurseID = scanner.nextLine();
                    System.out.println("Enter Hours to Increment: ");
                    double nurseHours = scanner.nextDouble();
                    hospital.incrementTheNurseShiftHours(nurseID, nurseHours);
                    break;
                case "11":
                    hospital.printAllPatientsList();
                    break;
                case "12":
                    hospital.printAllDoctorsList();
                    break;
                case "13":
                    hospital.findNursesWithAboveSixYearsPractice();
                    break;
                case "14":
                    System.exit(0);
            }
        }
    }
}