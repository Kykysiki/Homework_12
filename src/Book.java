import java.util.Objects;

public class Book {
    private final String nameBook;
    private final Autor autor;
    private int year;

    public Book(String nameBook, Autor autor, int year) {
        this.nameBook = nameBook;
        this.year = year;
        this.autor = autor;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Название книги: " + getNameBook() + " Год выпуска: " + getYear() + " Автор: " + getAutor();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Book)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Book book = (Book) obj;
        return year == book.year && this.nameBook.equals(book.nameBook) && this.autor.equals(book.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, autor, year);
    }
}
