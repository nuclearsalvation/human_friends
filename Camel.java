import java.util.ArrayList;
import java.util.Date;
public class Camel extends PackAnimal{
    public Camel(Integer id,String name, Date dob, ArrayList<String> commands){
        super(id, name, "Camel", dob, commands);
    }
    public Camel(Integer id,String name, Date dob){
        super(id, name, "Camel", dob);
    }
}