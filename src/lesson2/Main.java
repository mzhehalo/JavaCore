package lesson2;

public class Main {
    public static void main(String[] args) {
        Printable[] newArr = new Printable[2];
        Book book1 = new Book("How to code", 200);
        Magazine magazine1 = new Magazine("What is Programming?",100);
        newArr[0] = book1;
        newArr[1] = magazine1;

        for (Printable printable : newArr) {
            printable.print();
        }
    }
}

// а) Определить интерфейс Printable, содержащий метод void print().
// б) Определить класс Book, реализующий интерфейс Printable.
// в) Определить класс Magazine, реализующий интерфейс Printable.
// г) Создать массив типа Printable, который будет содержать книги и журналы.
// д) В цикле пройти по массиву и вызвать метод print() для каждого объекта.
// е) Создать статический метод printMagazines(Printable[] printable) в классе Magazine,
// который выводит на консоль названия только журналов.
// Создать статический метод printBooks(Printable[] printable) в классе Book,
// который выводит на консоль названия только книг. Используем оператор instanceof.
