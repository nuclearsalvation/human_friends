import java.util.ArrayList;
import java.util.Date;
public class Dog extends Pet{
    public Dog(Integer id,String name, Date dob, ArrayList<String> commands){
        super(id, name, "Dog", dob, commands);
    }
    public Dog(Integer id,String name, Date dob){
        super(id, name, "Dog", dob);
    }
}