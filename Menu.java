import java.util.Scanner;
public class Menu {
    public void menu() {
        System.out.println("Please choose one of the following options:");
        System.out.println("1. Admin");
        System.out.println("2. User");
        Scanner Sc = new Scanner(System.in);
        int answer = Sc.nextInt();
        if (answer == 1) {
            System.out.println("Please enter your username:");
            Sc.nextLine();

            String username = Sc.nextLine();
            System.out.println("Please enter your password:");
            String password = Sc.nextLine();
            System.out.println("Please enter your id");
            int id = Sc.nextInt();
            Admin admin = new Admin(username, id, password);
            admin.menuAdmin();
        }
        else if (answer==2)
        {
            System.out.println("Do you wanna login or join the library");
            System.out.println("1- Login");
            System.out.println("2- Join");
            Scanner scanner = new Scanner(System.in);
            int answer2 = scanner.nextInt();
            if (answer2==1)
            {
                System.out.println("Please enter your username:");
                Sc.nextLine();
                String username = Sc.nextLine();
                System.out.println("Please enter your password:");
                String password = Sc.nextLine();
                System.out.println("Please enter your id");
                int id = Sc.nextInt();
                Admin admin=new Admin("admin",11,"admin0000");
                User user = new User( id,username,admin);
                user.menuUser();
            }
            else if (answer2==2)
            {
                System.out.println("Please enter your username:");
                Sc.nextLine();
                String username = Sc.nextLine();
                System.out.println("Please enter your password:");
                String password = Sc.nextLine();
                System.out.println("Please enter your id");
                int id = Sc.nextInt();
                Admin admin=new Admin("admin",11,"admin0000");
                User user = new User(id, username, admin);
                user.RequestTojoin();
                user.menuUser();
            }
        }

    }
}
