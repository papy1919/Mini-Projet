import java.util.ArrayList;
public class BookHistory {
    ArrayList<Date> borrowed = new ArrayList<Date>();
    ArrayList<Date> returned = new ArrayList<Date>();

    public void addBorrow(Date date) {
        borrowed.add(date);
    }

    public void addReturned(Date date) {
        returned.add(date);
    }
}
