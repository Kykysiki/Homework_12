public class Main {
    public static void main(String[] args) {
        Book Garry = new Book("Гарри Поттер", 1992);
        Autor Joanne = new Autor("Джоан", "Роулинг");
        Garry.setYear(1998);
        System.out.println("Название книги: " + Garry.getNameBook());
        System.out.println("Год публикации: " + Garry.getYear());
        System.out.println("Автор: " + Joanne.getName() + " " + Joanne.getSurname());
        Book Dozor = new Book("Ночной Дозор", 1998);
        Autor Sergey = new Autor("Сергей", "Лукьяненко");
        System.out.println("Название книги: " + Dozor.getNameBook());
        System.out.println("Год публикации: " + Dozor.getYear());
        System.out.println("Автор: " + Sergey.getName() + " " + Sergey.getSurname());
    }
}