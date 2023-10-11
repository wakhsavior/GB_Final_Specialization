import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static final DateFormat dateFormatter
            = new SimpleDateFormat("dd-MM-yyyy");
    public static void main(String[] args) {

        AnimalList animals = new AnimalList();
        new Menu(new Scanner(System.in),animals).mainMenu();
    }
}