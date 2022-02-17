package Inheritance;
import java.util.*;

public class President {
    List<Manager> managers;

    public President(List<Manager> managers) {
        this.managers = managers;

    }public President(){}

    public  int getManagersFromDepartment() {
        int total_managers = 0;
        List<Developer> developers;
        for(Manager manage:managers){
            developers=manage.getDevelopers();{
                for(Developer develop:developers){
                    total_managers++;
                }

            }}
          return total_managers;
        }


    }
