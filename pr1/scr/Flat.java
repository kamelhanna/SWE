/**
 * Flat
 */
public class Flat {
    private int flatNumber;
    private int roomNumber;
    private double roomSalary;

    
    public Flat(int flatNumber, int roomNumber, double roomSalary) {
        this.flatNumber = flatNumber;
        this.roomNumber = roomNumber;
        this.roomSalary = roomSalary;
    }
    public int getFlatNumber() {
        return flatNumber;
    }
    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }
    public int getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    public double getRoomSalary() {
        return roomSalary;
    }
    public void setRoomSalary(double roomSalary) {
        this.roomSalary = roomSalary;
    }
    
    
}