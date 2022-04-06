public class Student extends Person {
    private int studentBonNumber;
    private int studentRoomNumber;
    private int studentFlatNumber;

    

    @Override
    public int getAge() {
        // TODO Auto-generated method stub
        return age;
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
    public void setName(String name) {
        // TODO Auto-generated method stub
        this.name=name;
    }
    public int getStudentBonNumber() {
        return studentBonNumber;
    }
    public void setStudentBonNumber(int studentBonNumber) {
        this.studentBonNumber = studentBonNumber;
    }
    public int getStudentRoomNumber() {
        return studentRoomNumber;
    }
    public void setStudentRoomNumber(int studentRoomNumber) {
        this.studentRoomNumber = studentRoomNumber;
    }
    public int getStudentFlatNumber() {
        return studentFlatNumber;
    }

    
}
