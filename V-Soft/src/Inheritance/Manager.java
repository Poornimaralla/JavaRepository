package Inheritance;
import java.util.*;


public class Manager extends President {
//    int technical_department;
//    int hr_department;
//    int it_department;
//    int sales_department;
//    int marketing_department;
  //  public Manager(int technical_department,int hr_department,int it_department,int sales_department,int marketing_department){
//        this.technical_department=technical_department;
//        this.hr_department=hr_department;
//        this.it_department=it_department;
//        this.sales_department=sales_department;
//        this.marketing_department=marketing_department;
    String m_name;
    List<Developer>developers;
    public Manager(String m_name,List<Developer>developers){
        this.m_name=m_name;
        this.developers=developers;

    }public Manager(){}

    public List<Developer> getDevelopers() {
        return developers;
    }
}
