public class Main {
    public static void main(String[] args) {
        Autor Joanne = new Autor("Джоан", "Роулинг");
        Book Garry = new Book("Гарри Поттер", Joanne, 1992);
        Garry.setYear(1998);
        System.out.println("Название книги: " + Garry.getNameBook());
        System.out.println("Год публикации: " + Garry.getYear());
        System.out.println("Автор: " + Joanne.getName() + " " + Joanne.getSurname());
        Autor Sergey = new Autor("Сергей", "Лукьяненко");
        Book Dozor = new Book("Ночной Дозор", Sergey, 1998);
        System.out.println("Название книги: " + Dozor.getNameBook());
        System.out.println("Год публикации: " + Dozor.getYear());
        System.out.println("Автор: " + Sergey.getName() + " " + Sergey.getSurname());
    }
}