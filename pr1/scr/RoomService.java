import java.util.ArrayList;

public class RoomService extends Department {
    private String depName;
    private ArrayList<Worker> workers = new ArrayList<Worker>();
    private Admin admin;
    
    public RoomService(String depName, ArrayList<Worker> workers, Admin admin) {
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
    public void clean (){

        System.out.println("Room has been cleaned");
    }
    
}
