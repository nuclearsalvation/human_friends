import java.util.ArrayList;
import java.util.Date;
public class Pet extends Animal{
    public Pet(Integer id,String name, String type, Date dob, ArrayList<String> commands){
        super(id, name, type, dob, commands);
    }
    public Pet(Integer id,String name, String type, Date dob){
        super(id, name, type, dob);
    }
}