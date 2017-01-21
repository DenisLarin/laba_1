package ru.larin.laba1;

import java.util.Scanner;
import java.util.Vector;

/**
 * Created by denislarin on 21.01.17.
 */
public class BookBase {
    Vector<Book> bookVector = new Vector();
    Scanner scanner = new Scanner(System.in);

    public void show_book_baze() {
        for (int i = 0; i < bookVector.size(); i++) {
            System.out.println("Книга #" + (i + 1));
            System.out.println("Название: " + bookVector.get(i).getName());
            System.out.println("Автор: " + bookVector.get(i).getAuthor());
            System.out.println("Количество страниц: " + bookVector.get(i).getPages());
        }
    }

    public void addnewbook() {
        System.out.println("Введите название книги");
        String name = scanner.nextLine();
        System.out.println("Введите автора книги");
        String author = scanner.nextLine();
        System.out.println("Введите количество страниц в книге");
        String p = scanner.nextLine();
        int page = Integer.parseInt(p);
        Book book_new = new Book(author, name, page);
        bookVector.add(book_new);
    }

    public void remake_by_number() {
        System.out.println("Введите номер книги, которую надо отредактировать (нумерация начинается от 1!)");
        String p = scanner.nextLine();
        int num = Integer.parseInt(p);
        System.out.println("Выбрана книга №" + num);
        Show_one_book(num);
        System.out.println("___________________");
        System.out.println("1.Отредактировать автора");
        System.out.println("2.Отредактировать название");
        System.out.println("3.Отредактировать количество сраниц");
        System.out.println("0.Закончить правку");
        p = scanner.nextLine();
        int step;
        step = Integer.parseInt(p);
        switch (num) {
            default:
                break;
            case 0:
                break;
            case 1:
                System.out.println("Введите нового автора книги №" + num);
                String athor = scanner.nextLine();
                bookVector.get(num - 1).setAuthor(athor);
                break;
            case 2:
                System.out.println("Введите новое название книги №" + num);
                String name = scanner.nextLine();
                bookVector.get(num - 1).setName(name);
                break;
            case 3:
                System.out.println("Введите новое количество страниц книги №" + num);
                String nume = scanner.nextLine();
                int number = Integer.parseInt(nume);
                bookVector.get(num - 1).setPages(number);
                break;
        }
    }

    private void Show_one_book(int num) {
        System.out.println("Книга #" + (num));
        System.out.println("Название: " + bookVector.get(num - 1).getName());
        System.out.println("Автор: " + bookVector.get(num - 1).getAuthor());
        System.out.println("Количество страниц: " + bookVector.get(num - 1).getPages());
    }

    public void delete_by_number() {
        System.out.println("Введите номер книги, которую надо удалить (нумерация начинается от 1!)");
        String p = scanner.nextLine();
        int num = Integer.parseInt(p);
        System.out.println("Выбрана книга №" + num);
        Show_one_book(num);
        System.out.println("Удалить? y n");
        String step = "n";
        step = scanner.nextLine();
        switch (step) {
            default:
                break;
            case "n":
                break;
            case "y":
                bookVector.remove(num - 1);
        }
    }

    public void delete_all() {
        System.out.println("Будут удалены все книги из БД. продолжить? y n");
        String step = scanner.nextLine();
        switch (step) {
            default:
                break;
            case "n":
                break;
            case "y":
                int i = 0;
                while (!bookVector.isEmpty()) {
                    bookVector.remove(i);
                }
                break;
        }
    }

    public void find_by_number() {
        System.out.println("Введите номер книги, который нужно найти (нумерация начинается от 1!)");
        String n = scanner.nextLine();
        int number = Integer.parseInt(n);
        Show_one_book(number);
    }

    public void find_by_name() {
        System.out.println("Введите название книги, которую надо найти");
        String name = scanner.nextLine();
        boolean have = false;
        for (int i = 0; i < bookVector.size(); i++) {
            if (bookVector.get(i).getName().equals(name)) {
                have = true;
                Show_one_book(i + 1);
            }
        }
        if (have == false) {
            System.out.println("Книги с названием " + name + " не было найдено!");
        }
    }

    public void find_by_author() {
        System.out.println("Введите автора книги, которую надо найти");
        String name = scanner.nextLine();
        boolean have = false;
        for (int i = 0; i < bookVector.size(); i++) {
            if (bookVector.get(i).getAuthor().equals(name)) {
                have = true;
                Show_one_book(i + 1);
            }
        }
        if (have == false) {
            System.out.println("Книги с автором " + name + " не было найдено!");
        }
    }

    public void find_by_page() {
        System.out.println("Введите количество страниц книги, которую надо найти");
        String name = scanner.nextLine();
        int page = Integer.parseInt(name);
        boolean have = false;
        for (int i = 0; i < bookVector.size(); i++) {
            if (bookVector.get(i).getPages() == page) {
                have = true;
                Show_one_book(i + 1);
            }
        }
        if (have == false) {
            System.out.println("Книги с " + page + " старниц не было найдено!");
        }
    }
}
