import java.util.ArrayList;

public class Admin extends Employee {

    private ArrayList<Worker> workers;
    private ArrayList<Student> students;

    public Admin(){
        workers = new ArrayList<Worker>();
        students = new ArrayList<Student>();
    }
    @Override
    public int getEmpId() {
        // TODO Auto-generated method stub
        return 0;
    }

    public ArrayList<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(ArrayList<Worker> workers) {
        this.workers = workers;
    }

    @Override
    public void setEmpId(int empId) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int getAge() {
        // TODO Auto-generated method stub
        return age ;
    }

    @Override
    public int getId() {
        // TODO Auto-generated method stub
        return id;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }

    @Override
    public void setAge(int age) {
        // TODO Auto-generated method stub
        this.age=age;
    }

    @Override
    public void setId(int id) {
        // TODO Auto-generated method stub
        this.id=id;

    }
    @Override
    public void setName(String name){
        this.name=name;
    }

    public void addWorker(Worker worker){
        workers.add(worker);
    }

    public void deleteWorker(Worker worker) {
        workers.remove(worker);
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void deleteStudent(Student student) {
        students.remove(student);
    }
    
}
