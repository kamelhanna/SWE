import java.util.ArrayList;

public class CollegeTown {
    private  final String NAME = "Menofia Univeristy";
    private final String PHONENUMBER = "+20220000";
    private final String LOCATION = "Menofia, Menouf";
    private ArrayList<Flat> flats = new ArrayList<Flat>();
    private ArrayList<Admin> admins = new ArrayList<Admin>();
    private ArrayList<Worker> workers = new ArrayList<Worker>();
    private Security  security;
    private RoomService roomService;
    private Resturant resturant;
    private ArrayList<Student> students; 

    public CollegeTown(ArrayList<Flat> flats, ArrayList<Admin> admins, ArrayList<Worker> workers, Security security,
            RoomService roomservice, Resturant resturant) {
        this.flats = flats;
        this.admins = admins;
        this.workers = workers;
        this.security = security;
        this.roomService = roomservice;
        this.resturant = resturant;
        students = new ArrayList<Student>();
    }
 
}
