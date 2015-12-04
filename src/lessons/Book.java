package lessons;

public class Book {

    String name;
    String author;
    int pages;

    public Book(String author, String name, int pages){

        this.author = author;
        this.name = name;
        this.pages = pages;

    }

    public String getInfo(){

        return author + " - " + name + " (pages " + pages + ")" ;

    }
}
