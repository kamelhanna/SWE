import java.util.ArrayList;

public class Security extends Department {

    private String depName;
    private ArrayList<Worker> workers = new ArrayList<Worker>();
    private Admin admin;

    
    public Security(String depName, ArrayList<Worker> workers, Admin admin) {
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
        this.admin = admin;
        
    }

    public boolean checkStudentId(int studentId) {
        Student s = new Student();
        if (s.getId() == studentId) {
            return true;
        }
        return false;
    }
    
}
