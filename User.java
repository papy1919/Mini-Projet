
import java.util.ArrayList;
import java.util.Scanner;

public class User {
    int id;
    String username;
    Admin admin;

    public User(int id, String username, Admin admin) {
        this.id = id;
        this.username = username;
        this.admin = admin;
    }

    public void RequestTojoin() {
        System.out.println("Your request has been sent to the admin");
        System.out.println("WELCOME TO THE LIBRARY " + username);
    }

    public void BorrowBook(int id, Date d) {
        admin.removeBook(id, d);
        admin.addBorrowed(id);

    }

    public void ReturnBook(int id, Date date) {
        admin.returnedBook(id, date);

    }


    public void RequestToParticipate(Event e) {
        e.addParticipant(this);
    }

    public void menuUser() {
        int answer;

        do {
            System.out.println("Please choose one of the following options:");
            System.out.println("1. Borrow a book");
            System.out.println("2. Return a book");
            System.out.println("3. Request to participate in an event");
            System.out.println("4. Exit");
            Scanner sc = new Scanner(System.in);
             answer = sc.nextInt();
            if (answer == 1) {
                System.out.println("Please enter the id of the book you want to borrow");
                int id = sc.nextInt();

                System.out.println("Please enter the date of borrowing");
                System.out.println("Day:");
                int day = sc.nextInt();
                System.out.println("Month:");
                int month = sc.nextInt();
                System.out.println("Year:");
                int year = sc.nextInt();
                Date d = new Date(day, month, year);
                BorrowBook(id, d);
            }
            if (answer == 2) {
                System.out.println("Please enter the id of the book you want to return");
                int id = sc.nextInt();
                System.out.println("Please enter the date of returning");
                System.out.println("Day:");
                int day = sc.nextInt();
                System.out.println("Month:");
                int month = sc.nextInt();
                System.out.println("Year:");
                int year = sc.nextInt();
                Date d = new Date(day, month, year);
                ReturnBook(id, d);
            }
            if (answer == 3) {
System.out.println("Please enter the id of the event you want to participate in");
                int id = sc.nextInt();
                System.out.println("Your request has been sent successfully");

            }
            else{
                if (answer!=4)
                    System.out.println("Please enter a valid number");
                else
                    System.out.println("Thank you for using our library");
            }
        }while (answer!=4);
    }
}
