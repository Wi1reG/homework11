import java.util.Objects;

public class Author {
    public Author author;
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }


    @Override
    public String toString() {
        return "Имя " + name + ", Фамилия " + surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author author1)) return false;
        return Objects.equals(author, author1.author) && Objects.equals(name, author1.name) && Objects.equals(surname, author1.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, name, surname);
    }
}
