import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm_Hospital extends  JFrame{

    public JTabbedPane HospitalPanel;
    private JTextField textFieldDoctorID;
    private JButton addDoctorButton;
    private JTextField TextFieldDoctorFN;
    private JTextField TextFieldDoctorLN;
    private JTextField TextFieldDoctorDC;
    private JTextField TextFieldDoctorYP;
    private JTextField TextFieldDoctorSH;
    private JButton delDoctorButton;
    private JButton listAllDoctorsButton;
    private JButton exitButtonDoctor;
    private JTextField textFieldNurseID;
    private JTextField textFieldNurseFN;
    private JTextField textFieldNurseLN;
    private JTextField textFieldNurseDC;
    private JTextField textFieldNurseYP;
    private JTextField textFieldNurseSH;
    private JTextField textFieldPatientID;
    private JTextField textFieldPatientFN;
    private JTextField textFieldPatientLN;
    private JTextField textFieldPatientDC;
    private JTextField textFieldPatientSN;
    private JTextField textFieldPatientDS;
    private JButton addNurseButton;
    private JButton deleteNurseButton;
    private JButton listNursePatientsButton;
    private JButton listAllNursesButton;
    private JButton exitButtonNurse;
    private JButton addPatientButton;
    private JButton deletePatientButton;
    private JButton listPatientButton;
    private JButton changeDischargeButton;
    private JButton exitButtonPatient;



    private Hospital hospital;
    public MainForm_Hospital() {
        hospital = new Hospital();
        addDoctorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String doctorID = textFieldDoctorID.getText();
                String FirstName = TextFieldDoctorFN.getText();
                String LastName = TextFieldDoctorLN.getText();
                int departmentCode = Integer.parseInt(TextFieldDoctorDC.getText());
                int yearsOfPractice = Integer.parseInt(TextFieldDoctorYP.getText());
                double shiftHours = Double.parseDouble(TextFieldDoctorSH.getText());

                if (doctorID.length() != 5) {
                    JOptionPane.showMessageDialog(MainForm_Hospital.this, "Invalid Input - DoctorID should be 5 chars");
                } else if (hospital.doctorVerifier(doctorID)) {
                    JOptionPane.showMessageDialog(MainForm_Hospital.this, "Error! There is already one doctor with this ID.");
                } else if (FirstName.length() + LastName.length() > 30) {
                    JOptionPane.showMessageDialog(MainForm_Hospital.this, "Error! Firstname and Lastname should have below 30 characters");
                } else {
                    Doctor doctor = new Doctor(doctorID, yearsOfPractice, shiftHours, FirstName, LastName, departmentCode);
                    //hospital.addDoctor(doctor);
                    JOptionPane.showMessageDialog(MainForm_Hospital.this, "Success! Doctor has been added to the List");
                }
            }
        });

        addNurseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nurseID = textFieldNurseID.getText();
                String fname = textFieldNurseFN.getText();
                String lname = textFieldNurseLN.getText();
                int departmentCode = Integer.parseInt(textFieldNurseDC.getText());
                int yearsOfPractice = Integer.parseInt(textFieldNurseYP.getText());
                double shiftHours = Double.parseDouble(textFieldNurseSH.getText());

                if (nurseID.length() != 5) {
                    JOptionPane.showMessageDialog(MainForm_Hospital.this, "Invalid Input - NurseID should be 5 chars");
                } else if (hospital.nurseVerifier(nurseID)) {
                    JOptionPane.showMessageDialog(MainForm_Hospital.this, "Error! There is already one nurse with this ID.");
                } else if (fname.length() + lname.length() > 30) {
                    JOptionPane.showMessageDialog(MainForm_Hospital.this, "Error! Firstname and Lastname should have below 30 characters");
                } else {
                    Nurse nurse = new Nurse(nurseID, yearsOfPractice, shiftHours, 0, fname, lname, departmentCode);
                    //hospital.addNurse(nurse);
                    JOptionPane.showMessageDialog(MainForm_Hospital.this, "Success! Nurse has been added to the List");
                }
            }

        });

        /*
        listAllNursesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder message = new StringBuilder("List of Nurses:\n");
                for (Nurse nurse : hospital.getAllNursesList()) {
                    message.append(nurse.toString()).append("\n");
                }
                JOptionPane.showMessageDialog(MainForm_Hospital.this, message.toString());
            }
        });

         */

        listPatientButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String patientID = textFieldPatientID.getText();
                String fname = textFieldPatientFN.getText();
                String lname = textFieldPatientLN.getText();
                int departmentCode = Integer.parseInt(textFieldPatientDC.getText());
                String sectionNumber = textFieldPatientSN.getText();
                String dischargeStatus = textFieldPatientDS.getText();

                if (patientID.length() != 5) {
                    JOptionPane.showMessageDialog(MainForm_Hospital.this, "Invalid Input - PatientID should be 5 chars");
                } else if (hospital.patientVerifier(patientID)) {
                    JOptionPane.showMessageDialog(MainForm_Hospital.this, "Error! There is already one patient with this ID.");
                } else if (fname.length() + lname.length() > 30) {
                    JOptionPane.showMessageDialog(MainForm_Hospital.this, "Error! Firstname and Lastname should have below 30 characters");
                } else {
                    Patient patient = new Patient(patientID, sectionNumber, 0, dischargeStatus, fname, lname, departmentCode);
                   //ospital.addPatient(patient);
                    JOptionPane.showMessageDialog(MainForm_Hospital.this, "Success! Patient has been added to the List");
                }
            }

        });
    }

}
