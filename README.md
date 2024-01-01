# Main Class (mainLib):
##### Entry point of the application.
##### Creates instances of Novel, Textbook, Library, Student, and Teacher.
##### Adds books to the library and lists all available books.
##### Allows students and teachers to borrow books.
# Menu Class:
##### Represents the user interface.
##### Provides options for the admin and user.
##### Admin options include logging in, adding users/books, throwing events, and checking event requests.
##### User options include login/joining the library, borrowing/returning books, and participating in events.#  # BookHistory Class:
##### Manages the borrowing and returning history of books.
##### Stores borrowed and returned dates for each book.
# Book Class:
##### Represents a book with attributes like name, author, and ID.
##### Tracks the borrowing and returning status using BookHistory.
# User Class:
##### Represents a user with attributes such as ID, username, and admin reference.
##### Allows users to request joining the library, borrow/return books, and participate in events.
# Event Class:
##### Represents an event with attributes like name, ID, date, theme, and participants.
##### Allows users to participate in events by adding them as participants.
# Admin Class:
##### Manages the library system, including book and user management.
##### Handles adding/removing books and users, handling event requests, and throwing events.
##### Allows for book borrowing and returning as well as managing event participation requests.
