public class Main {
    public static void main(String[] args) {
        Autor Joanne = new Autor("Джоан", "Роулинг");
        Book Garry = new Book("Гарри Поттер", Joanne, 1992);
        Garry.setYear(1998);
        Autor Sergey = new Autor("Сергей", "Лукьяненко");
        Book Dozor = new Book("Ночной Дозор", Sergey, 1998);
        System.out.println(Garry);
        System.out.println(Dozor);
    }
}