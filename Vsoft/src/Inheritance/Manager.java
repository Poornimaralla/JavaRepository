package Inheritance;

public class Manager extends President{
    String d_name;
    String d_designation;
    String d_department;
    Manager(String d_name,String d_designation,String d_department){
        this.d_name=d_name;
        this.d_designation=d_designation;
        this.d_department=d_department;
    }Manager(){}

    public String getD_name() {
        return d_name;
    }

    public String getD_department() {
        return d_department;
    }

    public String getD_designation() {
        return d_designation;
    }
}
