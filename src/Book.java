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
}
