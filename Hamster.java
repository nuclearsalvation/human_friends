import java.util.ArrayList;
import java.util.Date;
public class Hamster extends Pet{
    public Hamster(Integer id,String name, Date dob, ArrayList<String> commands){
        super(id, name, "Hamster", dob, commands);
    }
    public Hamster(Integer id,String name, Date dob){
        super(id, name, "Hamster", dob);
    }
}