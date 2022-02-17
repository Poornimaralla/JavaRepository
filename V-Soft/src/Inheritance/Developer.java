package Inheritance;

public class Developer extends Manager {
//    int service_now;
//    int mulesoft;
//    int aws;
//    int azure;
//    int java;
//    public Developer(int service_now,int mulesoft,int aws,int azure,int java){
//        this.service_now=service_now;
//        this.mulesoft=mulesoft;
//        this.aws=aws;
//        this.azure=azure;
//        this.java=java;
    String name;
    String department;
    String designation;
    public Developer(String name,String department,String designation){
        this.name=name;
        this.department=department;
        this.designation=designation;
    }public  Developer(){}

    public String getDepartment() {
        return department;
    }
}

