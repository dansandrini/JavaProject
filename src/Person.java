public abstract class Person {
    String FirstName;
    String LastName;
    Integer DepartmentCode;

    //Constructor to be initialized in others classes
    public Person(String FirstName, String LastName, int DepartmentCode){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.DepartmentCode = DepartmentCode;

    }
    public String ToString(){
        return this.FirstName + " " + this.LastName + " Department Code:" + this.DepartmentCode;
    }
}
