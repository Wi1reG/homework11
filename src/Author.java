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
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }

        Author that = (Author) other;
        return surname.equals(that.surname);

    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name);
    }


}
