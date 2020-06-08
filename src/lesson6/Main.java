package lesson6;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Power Of Positive Thinking", 400, "USA");
        Book book2 = new Book("Man’s Search for Meaning", 300, "Germany");
        Book book3 = new Book("The Way of the Superior Man", 550, "USA");
        Book book4 = new Book("Rich Dad, Poor Dad", 200, "USA");
        Book book5 = new Book("Way Of The Peaceful Warrior", 420, "USA");

        List<Book> books = Arrays.asList(book1, book2, book3, book4, book5);

        List<Book> stream = books.stream()
                .filter(book -> book.getPageCount() < 400)
                .filter(book -> book.getCountry().equals("Germany"))
                .collect(Collectors.toList());

        for (Book book : stream) {
            System.out.println("Stream: " + book);
        }

        List<String> stringStream = books.stream().map(book6 -> book6.getTitle()).collect(Collectors.toList());
        stringStream.forEach(System.out::println);

        Set<String> collect = books.stream().map(book -> book.getCountry()).collect(Collectors.toSet());
        System.out.println(collect);

        Book.showBooksWithPagesMore400(books);

        books.forEach(book -> System.out.println(book));

        Person person1 = new Person("Vadim", "Huk", 26, Arrays.asList(book3, book1, book5));
        Person person2 = new Person("Maya", "Lubovska", 22, Arrays.asList(book2, book1, book5));
        Person person3 = new Person("Dimon", "Sun", 36, Arrays.asList(book3, book1, book2));
        Person person4 = new Person("Marko", "Aggres", 28, Arrays.asList(book3, book5, book5));
        Person person5 = new Person("Koko", "Shkrapi", 15, Arrays.asList(book4, book1, book5, book2));

        List<Person> persons = Arrays.asList(person1, person2, person3, person4, person5);

        //  Task 1

        Map<Person, Integer> task1 = persons.stream().collect(Collectors.toMap(
                Function.identity(),
                person -> (Integer) person.getBook()
                        .stream()
                        .map(Book::getPageCount).mapToInt(Integer::intValue).sum()
        ));

        task1.forEach((person, integer) -> System.out.println("Task1: " + person + " Integer " + integer));

        //  Task 2

        Map<String, Integer> task2 = persons.stream()
                .collect(Collectors.toMap(
                        Person::getName,
                        person -> person.getBook()
                                .stream().map(Book::getPageCount)
                                .collect(Collectors.summarizingInt(Integer::intValue)).getMax()
//                                // second way
//                                .mapToInt(v -> v)
//                                .max()
//                                // third way
//                                .map(Comparator.comparing(Book::getPageCount))
//                                .mapToInt(Integer::valueOf).sum()
//                                .max(Integer::compare)

                ));

        System.out.println("Task2: " + task2);
    }
}


// В плані домашнього: щоб не вигадувати всяке різне,
// просто візьміть приклад з лекції і пройдіться по ВСІХ операціях стріма, бажано по декілька разів.
// Придумайте щось з ускладнених завдань, працюючи з List<Person>, кожен з об'єктів якого має List<Book>, наприклад:
// 1. згенерувати мапу <Person, Integer>, де Integer - кількість сторінок усіх книжок, які має людина
// 2. згенерувати мапу <String, Book>, де String - ім'я людини, Book - книжка з найбільшою кількістю сторінок
// 3. згенерувати List<Book> відфільтрувавши тільких тих людей, хто старше 25 років і
// книжки які мають більше 500 сторінок
//
// Чим більше таких завдань придумаєте, тим більше плюсиків вам у карму.