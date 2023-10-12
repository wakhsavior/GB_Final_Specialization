
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class AnimalList implements Model{
    private List<Animal> animals;
    private Counter counter = new Counter();

    /**
     * добавить животное в список
     */
@Override
    public void addAnimal(Animal animal) throws CloseCounterException {
        if (animals == null) {
            animals = new ArrayList<>();
        }
        try (Counter counter1 = counter){
counter1.openCounter();
            counter1.add();
            animals.add(animal);
            animal.setAnimalName();
            if (animal.getAnimalName() == null || animal.getAnimalName() == ""){
                throw new CloseCounterException("Имя животного задано неверно");
            }
            animal.setDateBirth();
            if ((animal.getDateBirth() == null) || new Date().before(animal.getDateBirth())){
                throw new CloseCounterException("Дата рождения животного задана неверно");
            }
        }catch (CloseCounterException e){
            animals.remove(animal);
            throw new CloseCounterException(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

}

    /**
     * удалить животное из списка
     *
     * @param animal
     * @return
     */
    @Override
    public boolean removeAnimal(Animal animal) {
        return animals.remove(animal);
    }

    /**
     * Получить список животных
     *
     * @return
     */
    @Override
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
