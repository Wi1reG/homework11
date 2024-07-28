public class Book {
    private String author;
    private int year;
    private String nameBook;

    public Book (String author, int year, String nameBook) {
        this.author = author;
        this.year = year;
        this.nameBook = nameBook;

    }

    public String getAuthor() {
        return this.author;
    }
    public int getYear() {
        return this.year;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public int setYear(int year) {
        this.year = year;
        return year;
    }

    public void authorVerification () {
        if (author.length() == 0) {
            System.out.println("Необходимо ввести автора");
        }
    }



}
