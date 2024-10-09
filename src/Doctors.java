import java.util.ArrayList;
public class Doctors extends ArrayList<Doctor> {
    public void addDoctors(Doctor doctor){this.add(doctor);
    }
    public Doctor getDoctor(int index){return this.get(index);}
    public void setDoctor(int index, Doctor doctor){
        this.set(index, doctor);
    }
}