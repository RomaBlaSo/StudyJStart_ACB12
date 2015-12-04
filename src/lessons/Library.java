package lessons;

public class Library {

    Book[] books = new Book[3];
    String name;

    public void fillBooks(Book b1, Book b2, Book b3){

        books[0] = b1;
        books[1] = b2;
        books[2] = b3;
    }

    public void showBooks(){

        for (int i = 0; i < books.length; i++) {

            System.out.println(books[i].getInfo());

        }

    }
}
