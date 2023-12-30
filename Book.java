import java.util.ArrayList;

public class Book {
    String name;
    String author;
    int id;
    BookHistory b;

    public Book(String title, String author,int id) {
        this.name = title;
        this.author = author;
        this.id=id;
        b=new BookHistory();
    }

    public void BorrowedBook(Date date)
    {
        b.addBorrow(date);
    }

    public void returnedBook(Date date)
    {
        b.addReturned(date);
    }

}
