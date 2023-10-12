import java.util.Collection;
import java.util.List;

public interface Model {
    List<Animal> getAnimals();
    void addAnimal(Animal animal) throws CloseCounterException;
    boolean removeAnimal(Animal animal);

}
