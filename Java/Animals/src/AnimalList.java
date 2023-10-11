import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class AnimalList {
    private List<Animal> animals;

    /**
     * добавить животное в список
     */

    public void addAnimal(Animal animal) {
        if (animals == null) {
            animals = new ArrayList<>();
        }
        animals.add(animal);
        animal.setAnimalName();
        animal.setDateBirth();
    }

    /**
     * удалить животное из списка
     *
     * @param animal
     * @return
     */
    public boolean removeAnimal(Animal animal) {
        return animals.remove(animal);
    }

    /**
     * Получить список животных
     *
     * @return
     */
    public List<Animal> getAnimals() {
        return animals;
    }

    public void showAllAnimals() {
        int i = 0;
        if (animals != null) {
            for (Animal animal : animals) {
                System.out.printf("%d: %s\n", i+1, animal);
                i++;
            }
        } else {
            System.out.println("Животные еще не добавлены.");
        }
    }
}
