package Inheritance;

import java.util.List;

public class President {
    String m_name;
    String department;
    String m_designation;
    President(String m_name,String department,String m_designation){
        this.m_name=m_name;
        this.department=department;
        this.m_designation=m_designation;
   }President(){}


    public String getM_name() {
        return m_name;
    }

    public String getDepartment() {
        return department;
    }
}
