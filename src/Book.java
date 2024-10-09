import java.util.Objects;

public class Book {
    private Author author;
    private int year;
    private String nameBook;

    public Book(Author author, int year, String nameBook) {
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

    @Override
    public String toString() {
        return "Издатель " + author + " произведение " + nameBook + " год издания " + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return year == book.year && Objects.equals(author, book.author) && Objects.equals(nameBook, book.nameBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, year, nameBook);
    }
}
