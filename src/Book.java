public class Book {
    private Author author;
    private int year;
    private String nameBook;

    public Book (Author author, int year, String nameBook) {
        this.author = author;
        this.year = year;
        this.nameBook = nameBook;

    }

    public Author getAuthor() {
        return this.author;
    }


    public int getYear() {
        return this.year;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public void setYear(int year) {
        this.year = year;
    }





}
