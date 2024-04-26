package src;
import java.util.List;

public class Cinema {
    private String nama;
    private List<User> user;
    private List<Studio> studio;
    private int studioCapacity;

    public Cinema (String nama, int studiocapacity){
        this.nama = nama;
        this.studioCapacity = studioCapacity;
    }

    private void init(){}

    public boolean registerUser(User user){
        return registerUser;
    }

    public authenticateUser(String email, String password){

    }

    public void displayListStudio(){

    }

    public void displaystudioDetail(int studioNumber){

    }

    public boolean addStudiowithMovies(String studioType, String movie title, dounle movieRating, String[] movieGenres){

    }

    public boolean bookTicket(User user, int studioNumber, char row, int col){

    }
 
    public String getName(){
        return name;
    }
}
