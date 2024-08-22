import java.util.ArrayList;
import java.util.Date;
public class PackAnimal extends Animal{
    public PackAnimal(Integer id, String name, String type, Date dob, ArrayList<String> commands){
        super(id, name, type, dob, commands);
    }
    public PackAnimal(Integer id, String name, String type, Date dob){
        super(id, name, type, dob);
    }
}