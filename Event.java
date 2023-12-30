import java.util.ArrayList;
public class Event {
String name;
int id;

    Date date;
    String theme;
    ArrayList<User> participants = new ArrayList<User>();

    public Event( int id,String name, Date date,String theme) {
        this.theme = theme;
        this.name = name;
        this.date = date;
        this.id=id;
    }

    public void addParticipant(User user) {
        participants.add(user);
    }
}
