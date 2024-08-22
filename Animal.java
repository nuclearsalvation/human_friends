import java.util.Date;
import java.util.ArrayList;
import java.text.SimpleDateFormat;

public class Animal {
    private String name;
    private Integer id;
    private String type;
    private ArrayList<String> commands = new ArrayList<>();
    private Date dob;

    public Animal(Integer id,String name,String type,Date dob,ArrayList<String> commands){
        this.name = name;
        this.id = id;
        this.type = type;
        this.commands = commands;
        this.dob = dob;

    }

    public Animal(Integer id, String name, String type, Date dob){
        this.id = id;
        this.name = name;
        this.type = type;
        this.dob = dob;
    }

    public String getName(){
        return name;
    }

    public Integer getId(){
        return id;
    }

    public String getType(){
        return type;
    }
    public ArrayList<String> getCommands(){
        return commands;
    }
    public Date getDOB(){
        return dob;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public void setCommands(ArrayList<String> commands){
        this.commands = commands;
    }
    public void setDOB(Date dob){
        this.dob = dob;
    }
    public void printCommands(){
        System.out.println(commands);
    }
    public void learnCommand(String command){
        commands.add(command);
    }
    public String toString(){
        String str = new String();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        str = id.toString() + " "  + name + " " + type + " " + sdf.format(dob) + " " + commands.toString();
        return str;
    }
}