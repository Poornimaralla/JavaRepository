package Inheritance;
import java.util.*;
public class Company {
    public static void main(String[] args) {
        Developer D1 = new Developer("Poornima", "Service_now", "Manager");
        Developer D2 = new Developer("Hema latha", "Mulesoft", "Manager");
        Developer D3 = new Developer("Deepthi", "Java", "Manager");
        Developer D4 = new Developer("Sravani", "AWS", "Developer");
        Developer D5 = new Developer("Lalitha", "Azure", "Developer");
        Developer D6 = new Developer("Shivani", "Service_now", "Developer");
        Developer D7 = new Developer("Akhila", "Java", "Developer");
        Developer D8 = new Developer("Naresh", "Mulesoft", "Developer");
        List<Developer> Mulesoft = new ArrayList<>();
        Mulesoft.add(D2);
        Mulesoft.add(D8);
        List<Developer> Service_now = new ArrayList<>();
        Service_now.add(D1);
        Service_now.add(D6);
        List<Developer> Java = new ArrayList<>();
        Java.add(D3);
        Java.add(D7);
        List<Developer> AWS = new ArrayList<>();
        AWS.add(D4);
        List<Developer> Azure = new ArrayList<>();
        Azure.add(D5);
        Manager M1 = new Manager("Hemalatha",Mulesoft);
        Manager M2 = new Manager("Poornima", Service_now);
        Manager M3 = new Manager("Deepthi",Java);
        List<Manager> managers = new ArrayList<>();
        managers.add(M1);
        managers.add(M2);
        managers.add(M3);
        President P = new President(managers);
        System.out.println("Total number of Departments :"+P.getManagersFromDepartment());
        System.out.println("Mulesoft Departmant :");
        for(Developer D:Mulesoft) {

            System.out.println(D.name + " is " + D.designation + " of " + D.department);}
            System.out.println("Java Department : ");


            for(Developer dev:Java){

            System.out.println(dev.name+" is "+dev.designation+" of "+dev.department );
        }
            System.out.println("Service-now Department : ");
            for(Developer dev1:Service_now){
                System.out.println(dev1.name+" is "+dev1.designation+" of "+dev1.department);
            }System.out.println("Azure Department : ");
            for(Developer dev2:Azure){
                System.out.println(dev2.name+" is "+dev2.designation+" of "+dev2.department);
            }for(Developer dev3:AWS){
                System.out.println(dev3.name+" is "+dev3.designation+" of "+dev3.department);

        }

            }
    }









