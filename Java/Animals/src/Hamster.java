import java.util.Date;

public class Hamster extends Pet{
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
        return String.format("Хомяк: %s\tдата рождения: %s", this.getAnimalName(), Main.dateFormatter.format(this.getDateBirth()));
    }

    public Hamster() {
    }

    public Hamster(String name, Date birthDate) {
        this.setAnimalName(name);
        this.setDateBirth(birthDate);
    }

    public static Hamster createHamster(String name, Date birthDate){
        Hamster hamster = new Hamster(name,birthDate);
        return hamster;
    }
}

