import java.util.ArrayList;
import java.util.Date;
public class Horse extends PackAnimal{
    public Horse(Integer id,String name, Date dob, ArrayList<String> commands){
        super(id, name, "Horse", dob, commands);
    }
    public Horse(Integer id,String name, Date dob){
        super(id, name, "Horse", dob);
    }
}