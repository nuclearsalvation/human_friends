import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Integer flag = 1;
        Integer id = 0;
        Counter counter = new Counter();
        String name = new String();
        String type = new String();
        String dobString = new String();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dob = new Date();
        String command = new String();
        ArrayList<String> commands = new ArrayList<>();
        String flagString = new String();
        ArrayList<Animal> animalsList = new ArrayList<>();
        System.out.println(commands);
        Scanner scanner = new Scanner(System.in);
        while (flag != 0){
            System.out.println("0 -- выход");
            System.out.println("1 -- завести новое животное");
            System.out.println("2 -- узнать команды животного");
            System.out.println("3 -- научить животное команде");
            System.out.println("4 -- вывести число животных");
            flagString = scanner.nextLine();
            flag = Integer.parseInt(flagString);
            if (flag == 1){
                commands.clear();
                System.out.println("Введите кличку");
                name = scanner.nextLine();
                System.out.println("Введите вид животного");
                type = scanner.nextLine();
                System.out.println("Введите дату рождения, формат yyyy-MM-dd");
                dobString = scanner.nextLine();
                dob = sdf.parse(dobString);
                System.out.println("Введите команды животного, exit - выход");
                while (!command.equals("exit")){
                    command = scanner.nextLine();
                    if (!command.equals("exit")){
                        commands.add(command);
                    }
                }
                id = id + 1;
                counter.add();
                
                Animal animal = new Animal(id, name, type, dob);
                if (type.equals("dog")){
                    animal = new Dog(id, name, dob);
                }
                if (type.equals("cat")){
                    animal = new Cat(id, name, dob);
                }
                if (type.equals("hamster")){
                    animal = new Hamster(id, name, dob);
                }
                if (type.equals("horse")){
                    animal = new Horse(id, name, dob);
                }
                if (type.equals("donkey")){
                    animal = new Donkey(id, name, dob);
                }
                if (type.equals("camel")){
                    animal = new Camel(id, name, dob);
                }
                for (String str: commands){
                    animal.learnCommand(str);
                }
                name = null;
                type = null;
                dobString = null;
                command = "";
                animalsList.add(animal);
            }
            else if (flag == 2){
                System.out.println("Введите ID животного");
                String idString = scanner.nextLine();
                Integer idRequested = Integer.parseInt(idString);
                for (Animal a: animalsList){
                    if (a.getId() == idRequested){
                        for (String str: a.getCommands()){
                            System.out.println(str);
                        }
                    }
                } 
            }
            else if (flag == 3){
                System.out.println("Введите ID животного, далее -- команду");
                String idRequested = scanner.nextLine();
                for(Animal a: animalsList){
                    if (a.getId() == Integer.parseInt(idRequested)){
                        String str = scanner.nextLine();
                        a.learnCommand(str);
                    }
                }

            }
            else if (flag == 4){
                System.out.println(counter.getCount());
            }
        }
        scanner.close();

    }

}