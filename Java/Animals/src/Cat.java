import java.text.Format;
import java.util.Date;
import java.util.List;

public class Cat extends Pet{
    private static int counter;
    private final int id;

    {
        id = ++counter;  // Меняется автоматически для присвоения I
    }

    public int getId() {
        return id;
    }

    public Cat(String name, Date birthDate) {
        this.setAnimalName(name);
        this.setDateBirth(birthDate);
    }

    @Override
    public String toString() {
        return String.format( "Кошка: %s\tдата рождения: %s",this.getAnimalName(),Main.dateFormatter.format(this.getDateBirth()));
    }

    public Cat() {
    }

    public static Cat createCat(String name, Date birthDate){
        Cat cat = new Cat(name,birthDate);
        return cat;
    }
}
