import java.util.Objects;

public class Autor {

    private final String name;
    private final String surname;

    public Autor(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String toString() {
        return getName() + " " + getSurname();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Autor)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Autor autor = (Autor) obj;
        return this.name.equals(autor.name) && this.surname.equals(autor.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
