//import java.util.Collection;
//import java.util.Date;
//
///*
//    Класс взаимодействия между всеми элементами программы
// */
//public class Presenter implements UserInterface {
//
//    private final Model model;
//    private final UserInterface view;
//
//    public Presenter(Model model, UserInterface view) {
//        this.model = model;
//        this.view = view;
//        this.model.addPrestenter(this);
//
//    }
//
//    public void showAnimals(Collection<Animal> animals) {
//        for (Animal animal : animals) {
//            view.showMessage(animal.toString());
//        }
//    }
//
//    public void showAnimals() {
//        this.showAnimals(model.getAnimals());
//    }
//
//    public void addAnimal() {
//        int count = view.getUnsignedInt("How many toys would you like to create?");
//        model.addAnimal();
//    }
//
//    public int getInt(String str) {
//        return view.getInt(str);
//    }
//
//    public int getUnsignedInt(String str) {
//        return view.getUnsignedInt(str);
//    }
//
//    public String getString(String str) {
//        return view.getString(str);
//    }
//    public Date getDate(Date date){return view.getDate(str);}
//
//    public void showMessage(String msg) {
//        view.showMessage(msg);
//    }
//
//
//}
