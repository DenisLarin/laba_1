package ru.larin.laba1;

import java.util.Scanner;
import java.util.StringJoiner;

/**
 * Created by denislarin on 21.01.17.
 */
public class Main {
    private static int pos = 0;
    private static Scanner scanner = new Scanner(System.in);
    private static BookBase bookbase = new BookBase();

    public static void main(String[] args) {
        do{
            System.out.println("*************Меню*************");
            System.out.println("1.Добавить книгу");
            System.out.println("2.Посмотреть все книги в БД");
            System.out.println("3.Отредактировать книгу по порядковому номеру");
            System.out.println("4.Удалить книгу по порядковому номеру");
            System.out.println("5.Очистить БД полностью");
            System.out.println("6.Найти книгу по порядковому номеру");
            System.out.println("7.Найти книгу по названию");
            System.out.println("8.Найти книку по автору");
            System.out.println("9.Найти книку по количеству страниц");
            System.out.println("0.Выход");
            System.out.println("Выбирите пункт меню");
            String p = scanner.nextLine();
            pos = Integer.parseInt(p);
            switch (pos){
                default:
                    break;
                case 0:
                    break;
                case 1:
                    bookbase.addnewbook();
                    break;
                case 2:
                    bookbase.show_book_baze();
                    break;
                case 3:
                    bookbase.remake_by_number();
                    break;
                case 4:
                    bookbase.delete_by_number();
                    break;
                case 5:
                    bookbase.delete_all();
                    break;
                case 6:
                    bookbase.find_by_number();
                    break;
                case 7:
                    bookbase.find_by_name();
                    break;
                case 8:
                    bookbase.find_by_author();
                    break;
                case 9:
                    bookbase.find_by_page();
                    break;
            }
        }while (pos!=0);
    }
}
