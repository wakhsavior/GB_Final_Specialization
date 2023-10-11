import java.util.Date;

public interface UserInterface {
    void showMessage(String msg);
    int getInt(String str);
    int getUnsignedInt(String str);
    String getString(String str);
    Date getDate(String str);
}
