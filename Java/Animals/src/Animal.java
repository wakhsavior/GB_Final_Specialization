import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

abstract class Animal {
private String AnimalClass;

    public String getAnimalClass() {
        return AnimalClass;
    }

    public void setAnimalClass(String animalClass) {
        AnimalClass = animalClass;
    }

    private String animalName;
    private List<String> commands;
    private Date dateBirth;


    public void setCommands(List<String> commands) {
        this.commands = commands;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public void setDateBirth() {
        Date dateBirth;
        System.out.print("Введите дату рождения животного (dd-MM-yyyy): ");
        do {
            String dateString = Main.scanner.nextLine();
            try {
                dateBirth = Main.dateFormatter.parse(dateString);
                break;
            } catch (ParseException e) {
                System.out.println("Неверный формат даты dd-MM-yyyy");
            }
        } while (true);
        this.dateBirth = dateBirth;
    }

     public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {

        this.animalName = animalName;
    }

    public void setAnimalName() {
        System.out.print("Введите имя животного: ");
        String name = Main.scanner.nextLine();
        this.animalName = name;
    }

    public List<String> getCommands() {
        return commands;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

     public void addCommand(String command) {
        if (commands == null){
            commands = new ArrayList<>();
        }
        this.commands.add(command);
    }

    public void addCommand() {
        System.out.print("Введите команду: ");
        String command = Main.scanner.nextLine();
        this.addCommand(command);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                ", dateBirth=" + dateBirth +
                '}';
    }

    public void showCommands() {
        String className = this.getClass().getName();
        String animalClass;
        if (className == "Dog"){
            animalClass = "Собака";
        } else if (className == "Cat") {
            animalClass = "Кошка";
        } else if (className == "Hamster") {
            animalClass = "Хомяк";
        }else {
            animalClass = "Животное";
        }

        List<String> curCommands = this.getCommands();
        if (curCommands == null) {
            System.out.printf("%s пока ничего не умеет.\n", animalClass);
        } else {
            System.out.printf("%s %s умеет: ",animalClass, this.getAnimalName());
            for (String command : curCommands) {
                System.out.printf("%s, ", command);
            }
            System.out.println();
        }
    }
}
