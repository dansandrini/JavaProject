import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Login extends JFrame {
    private JTextField textFieldUsername;
    private JButton LoginButton;
    private JButton exitButton;
    private JFormattedTextField formattedTextPassword;
    private JPanel loginPanel;
    public JPanel HospitalPanel;


    public Login() {
        LoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textFieldUsername.getText().equals("admin") && formattedTextPassword.getText().equals("admin")){
                    JOptionPane.showMessageDialog(LoginButton, "Welcome Admin!");
                    MainForm_Hospital hpt = new MainForm_Hospital();
                    hpt.setContentPane(hpt.HospitalPanel);
                    hpt.setTitle("HOSPITAL MAIN");
                    hpt.setSize(400, 300);
                    hpt.setLocationRelativeTo(null);
                    hpt.setVisible(true);
                    dispose();
                }
                else {
                    JOptionPane.showMessageDialog(LoginButton, "Error! Credentials are incorrect!");
                }
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        Login login = new Login();
        login.setContentPane(login.loginPanel);
        login.setTitle("Hospital Management System");
        login.setSize(350, 200);
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
