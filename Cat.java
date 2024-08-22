import java.util.ArrayList;
import java.util.Date;
public class Cat extends Pet{
    public Cat(Integer id,String name, Date dob, ArrayList<String> commands){
        super(id, name, "Cat", dob, commands);
    }
    public Cat(Integer id,String name, Date dob){
        super(id, name, "Cat", dob);
    }
}