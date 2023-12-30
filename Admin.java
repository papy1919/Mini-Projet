import java.util.Iterator;
import java.util.Scanner ;
import java.util.ArrayList;

public class Admin {
    ArrayList<Book> BookList = new ArrayList<Book>();
    ArrayList<Book> BorrowedBookList = new ArrayList<Book>();
    ArrayList<User> UserList = new ArrayList<User>();
    String name;
    int ID;
    String password;

    Admin(String name, int ID, String password) {
        this.name = name;
        this.ID = ID;
        this.password = password;
    }

    public void addBook(Book book) {
        System.out.println("Do you want to add this book " + book.name + "to the library? (Y/N)");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        if (answer.equals("Y")) {
            if (!find(book.id)) ;
            BookList.add(book);
        } else
            System.out.println("Book request denied");


    }

    public void removeBook(int id, Date d) {
        if (find(id))
            for (Book book : BookList) {
                if (book.id == id) {
                    BookList.remove(book);
                    book.BorrowedBook(d);
                }
            }

        else
            System.out.println("Book already borrowed");
    }

    public void deleteBook(int id) {
        Iterator<Book> iterator = BookList.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.id == id) {
                iterator.remove(); // Remove using iterator
                found = true;
                break; // Exit loop once the book is removed
            }
        }


        if (!found) {
            System.out.println("Book not found or already borrowed");
        }
    }

    public void addUser(User user) {
        System.out.println("Do you want to add this User " + user.username + " to the library?(Y/N)");
        Scanner sc = new Scanner(System.in);
        String reponse = sc.nextLine();
        if (reponse.equals("Y"))
            UserList.add(user);
        else
            System.out.println("User request denied");

    }

    public void removeUser(int id) {
        if (find(id)) {
            for (User user : UserList)
                if (user.id == id)
                    UserList.remove(user);
        } else
            System.out.println("User not found");
    }

    public Event throwEvent() {
        System.out.println("What s the name of the event you want throw?");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("What s the date of the event you want throw?");
        System.out.println("Day:");
        int day = sc.nextInt();
        System.out.println("Month:");
        int month = sc.nextInt();
        System.out.println("Year:");
        int year = sc.nextInt();
        Date date = new Date(day, month, year);
        System.out.println("What s the theme of the event you want throw?");
        String theme = sc.nextLine();
        System.out.println("What s the ID of this event?");
        int id = sc.nextInt();
        Event event = new Event(id, name, date, theme);
        return event;

    }

    public boolean find(int id) {
        for (Book book : BookList)
            if (book.id == id)
                return (true);
        return (false);

    }

    public boolean find(User user) {
        for (User user1 : UserList)
            if (user1 == user)
                return (true);
        return (false);

    }

    public void addBorrowed(int id) {
        if (find(id))
            for (Book book : BookList)
                if (book.id == id)
                    BorrowedBookList.add(book);
                else
                    System.out.println("Book not found");
    }

    public void returnedBook(int id, Date date) {
        for (Book book : BorrowedBookList)
            if (book.id == id) {
                BorrowedBookList.remove(book);
                BookList.add(book);
                book.returnedBook(date);
            } else
                System.out.println("Book not found");
    }

    public void eventrequests(User user, Event e) {
        System.out.println("Do you want to accept this user " + user.username + " to participate in the event?(Y/N)");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        if (answer.equals("Y"))
            e.addParticipant(user);
        else
            System.out.println("Request denied");
    }

    public void menuAdmin() {

        Event e;

        int answer;
        do {
            System.out.println("Please choose one of the following options:");
            System.out.println("1. Add a book");
            System.out.println("2. Remove a book");
            System.out.println("3. Add a user");
            System.out.println("4. Throw an event");
            System.out.println("5. Check event requests");
            System.out.println("6. Exit");
            Scanner sc = new Scanner(System.in);
            answer= sc.nextInt();
            if (answer == 1) {
                System.out.println("Please enter the name of the book you want to add");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.println("Please author of the book you want to add");
                String author = sc.nextLine();
                System.out.println("Please enter the id of the book you want to add");
                int id = sc.nextInt();
                Book book = new Book(name, author, id);
                addBook(book);
            }
            if (answer == 2) {
                System.out.println("Please enter the id of the book you want to remove");
                int id = sc.nextInt();
                deleteBook(id);
            }
            if (answer == 3) {
                System.out.println("Please enter the name of the user you want to add");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.println("Please enter the id of the user you want to add");
                int id = sc.nextInt();
                User user = new User(id, name, this);
                addUser(user);
            }

            if (answer == 4)
                e = throwEvent();

        }while (answer != 5);
    }
}
