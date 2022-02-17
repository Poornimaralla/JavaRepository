package Inheritance;
import java.util.*;

public class Company {
    public static void main(String[] args) {
        President P1 = new President("Manoj", "Java", "Manager");
        President P2 = new President("Raja sekhar", "Mulesoft", "Manager");
        President P3 = new President("Ravi krishna", "Service_now", "Manager");
        President P4 = new President("Ramarao", "AWS", "Manager");
        President P5 = new President("Trinath", "Azure", "Manager");
        List<President> managers = new ArrayList<>();
        managers.add(P1);
        managers.add(P2);
        managers.add(P3);
        managers.add(P4);
        managers.add(P5);
        Manager M1 = new Manager("Poornima", "Developer", "Java");
        Manager M2 = new Manager("Hema latha", "Developer", "Java");
        Manager M3 = new Manager("Shivani", "Developer", "Mulesoft");
        Manager M4 = new Manager("Deepthi", "Developer", "Muleosft");
        Manager M5 = new Manager("Akhila", "Developer", "Service_now");
        Manager M6 = new Manager("Lalitha", "Developer", "Service_now");
        Manager M7 = new Manager("Sravani", "Developer", "AWS");
        Manager M8 = new Manager("Radhika", "Developer", "AWS");
        Manager M9 = new Manager("Mallika", "Developer", "Azure");
        Manager M10 = new Manager("Shivani singh", "Developer", "Azure");
        List<Manager> developers = new ArrayList<>();
        developers.add(M1);
        developers.add(M2);
        developers.add(M3);
        developers.add(M4);
        developers.add(M5);
        developers.add(M6);
        developers.add(M7);
        developers.add(M8);
        developers.add(M9);
        developers.add(M10);
        Developer D1 = new Developer("Srikar", "It_staff");
        Developer D2 = new Developer("Roopali", "Hr");
        Developer D3 = new Developer("Hari sankar", "Sales");
        Developer D4 = new Developer("Balaji", "Marketing");
        List<Developer> employees = new ArrayList<>();
        employees.add(D1);
        employees.add(D2);
        employees.add(D3);
        employees.add(D4);
        int size=employees.size();
        System.out.println("Count of other employees : "+size);
        int size1=managers.size();
        System.out.println("Count of Department managers: "+size);
        int size2=developers.size();

        System.out.println("Count of developers :"+size);

        for (President manage : managers) {

            System.out.println(manage.m_name + " is " + manage.m_designation + " of " + manage.department);}



        System.out.println("List of Developers :");
        for (Manager develop : developers) {
            System.out.println(develop.d_name + " is " + develop.d_designation + " of " + develop.d_department);
        }
        System.out.println("List of other Employess");
        for(Developer develop:employees){
            System.out.println(develop.e_name+" for "+develop.e_department);

        }



    }
}