import java.util.Date;
import java.util.List;

public class Dog extends Pet {
    private static int counter;
    private final int id;

    {
        id = ++counter;  // Меняется автоматически для присвоения ID
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("Собака: %s\tдата рождения: %s", this.getAnimalName(), Main.dateFormatter.format(this.getDateBirth()));

    }

    public Dog() {
    }

    public Dog(String name, Date birthDate) {
        this.setAnimalName(name);
        this.setDateBirth(birthDate);
    }

    public static Dog createDog(String name, Date birthDate) {
        Dog dog = new Dog(name, birthDate);
        return dog;
    }
}
