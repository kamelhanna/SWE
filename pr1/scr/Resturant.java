import java.sql.Time;
import java.util.ArrayList;

public class Resturant extends Department {
    private Time time ;
    private ArrayList<String> foodType =new ArrayList<>();
    private String depName;
    private ArrayList<Worker> workers = new ArrayList<Worker>();
    private Admin admin;
    
    public Resturant(String depName, ArrayList<Worker> workers, Admin admin) {
        this.depName = depName;
        this.workers = workers;
        this.admin = admin;
    }
    @Override
    public void setDepartmentName(String depName) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void setDepartmentAdmin(Admin admin) {
        // TODO Auto-generated method stub
        
    }
    public void Meal (ArrayList <String> foodType ,Time time){
        this.foodType=foodType;
        this.time=time;

    }
    
    
}
