import java.util.ArrayList;
import java.util.Date;
public class Donkey extends PackAnimal{
    public Donkey(Integer id,String name, Date dob, ArrayList<String> commands){
        super(id, name, "Donkey", dob, commands);
    }
    public Donkey(Integer id,String name, Date dob){
        super(id, name, "Donkey", dob);
    }
}