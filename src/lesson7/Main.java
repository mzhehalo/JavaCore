package lesson7;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // Task1 Integer
        List<Integer> numbersList = new ArrayList<>
                (Arrays.asList(2, 5, 1, 14, 22, 9, 7, 15, 22, 16, 11, 26, 44, 8, 17, 13, 3, 6, 20, 4));

        // Second Way
        // int[] numbersList2 = new int[]{2, 5, 1, 14, 22, 9, 7, 15, 22, 16, 11, 26, 44, 8, 17, 13, 3, 6, 20, 4};
        System.out.println("Task1: " + numbersList);

        // Task2
        List<Integer> collect = numbersList.stream().sorted().collect(Collectors.toList());
        System.out.println("Task2: " + collect);

        // Task3
        List<Integer> collect1 = numbersList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Task3: " + collect1);

        // Task4
        List<Integer> collect2 = numbersList.stream().filter(number -> number % 3 == 0).collect(Collectors.toList());
        System.out.println("Task4: " + collect2);

        // Task5
        List<Integer> collect3 = numbersList.stream().filter(number -> number % 10 == 0).collect(Collectors.toList());
        System.out.println("Task5: " + collect3);

        // Task6
        numbersList.forEach(number -> System.out.println("Task6: " + number));

        // Task7
        List<Integer> collect4 = numbersList.stream().map(number -> number * 3).collect(Collectors.toList());
        System.out.println("Task7" + collect4);

        // Task8 String
        List<String> stringList = new ArrayList<>(Arrays.asList
                ("day", "night", "zero", "infinite", "january", "december", "monday", "sunday",
                        "white", "black", "abc", "xyz", "good", "bad", "tall", "low", "rich", "poor")
        );

        // Task9
        List<String> collect5 = stringList.stream().sorted().collect(Collectors.toList());
        System.out.println("Task9: " + collect5);

        // Task10
        List<String> collect6 = stringList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Task10: " + collect6);

        // Task11
        List<String> collect7 = stringList.stream().filter(word -> word.length() < 4).collect(Collectors.toList());
        System.out.println("Task11: " + collect7);

        // Task12

        List<String> collect8 = stringList.stream().map(word -> word.concat("!")).collect(Collectors.toList());
        System.out.println("Task12: " + collect8);

        // Task12.1
        List<String> collect9 = stringList.stream().map(word -> word.substring(0, 0) + "!" + word).collect(Collectors.toList());
        System.out.println("Task12.1: " + collect9);
        System.out.println("====================");

//         Task13 User Array List
        User user1 = new User("vasya", 31, false);
        User user2 = new User("petya", 30, true);
        User user3 = new User("olya", 28, false);
        User user4 = new User("anya", 31, false);
        User user5 = new User("andrey", 29, true);
        User user6 = new User("olya", 31, false);
        User user7 = new User("kolya", 29, true);
        User user8 = new User("max", 30, true);
        User user9 = new User("oleg", 28, false);
        User user10 = new User("masha", 30, true);
        User user11 = new User("max", 31, true);

        ArrayList<User> userArrayList = new ArrayList<>
                (Arrays.asList(user1, user2, user3, user4, user5, user6, user7, user8, user9, user10, user11));
        userArrayList.forEach(user -> System.out.println("Task13: " + user));
        System.out.println("====================");

        // Task14
        List<User> collect10 = userArrayList.stream().sorted(Comparator.comparing(User::getAge)).collect(Collectors.toList());
        collect10.forEach(user -> System.out.println("Task14: " + user));
        System.out.println("====================");

        // Task15
        List<User> collect11 = userArrayList.stream().sorted(Comparator.comparing(User::getAge).reversed()).collect(Collectors.toList());
        collect11.forEach(user -> System.out.println("Task15: " + user));
        System.out.println("====================");

        // Task16
        List<User> collect12 = userArrayList.stream()
                .sorted(Comparator.comparing(user -> user.getName().length())).collect(Collectors.toList());
        collect12.forEach(user -> System.out.println("Task16: " + user));
        System.out.println("====================");

        // Task17
        List<User> collect13 = userArrayList.stream()
                .sorted(Comparator.comparing(user -> user.getName().length()))
                .collect(Collectors.toList());
        Collections.reverse(collect13);
        collect13.forEach(user -> System.out.println("Task17: " + user));
        System.out.println("====================");

        // Task18

        List<User> usersWithId = userArrayList.stream().map(user -> {
            user.setId(new Random().nextInt(100500));
            return user;
        }).collect(Collectors.toList());

        usersWithId.forEach(user -> System.out.println("Task18: " + user));
        System.out.println("====================");

    }
}

//  1.-- создать массив с 20 числами.
//  -- при помощи метода sort и колбека  отсортировать массив.
//  -- при помощи метода sort и колбека отсортировать массив в ниспадающем напралении.
//  -- при помощи filter получить числа кратные 3
//  -- при помощи filter получить числа кратные 10
//  -- перебрать (проитерировать) массив при помощи foreach()
//  -- перебрать массив при помощи map() и получить новый массив в котором все значения будут в 3 раза больше
//
//  8.-- создать массив со словами на 15-20 элементов.
//  -- отсортировать его по алфавиту в восходящем порядке.
//  -- отсортировать его по алфавиту  в нисходящем порядке.
//  -- отфильтровать слова длиной менее 4х символов
//  12.-- перебрать массив при помощи map() и получить новый массив
//  в котором все значения будут со знаком "!" в конце
//
//  Все робити через функції масивів (foreach, map ...тд)
//  Дан масив :
//  let users = [ {name: 'vasya', age: 31, status: false},
//  {name: 'petya', age: 30, status: true}, {name: 'kolya', age: 29, status: true},
//  {name: 'olya', age: 28, status: false}, {name: 'max', age: 30, status: true},
//  {name: 'anya', age: 31, status: false}, {name: 'oleg', age: 28, status: false},
//  {name: 'andrey', age: 29, status: true}, {name: 'masha', age: 30, status: true},
//  {name: 'olya', age: 31, status: false}, {name: 'max', age: 31, status: true} ];
//  - відсортувати його за  віком (зростання , а потім окремо спадання)
//  17.- відсортувати його за кількістю знаків в імені  (зростання , а потім окремо спадання)
//  - пройтись по ньому та додати кожному юзеру поле id - яке характеризує унікальний індентифікатор
//  (По якому принципу його створювати - ваше рішення), та зберегти це в новий масив
//  (первинний масив залишиться без змін)
//  - відсортувати його за індентифікатором
//
//
//  -- наисать функцию калькулятора с 2мя числами и колбеком
//  -- наисать функцию калькулятора с 3мя числами и колбеком
//
//        =============================================
//        =============================================
//        =============КЛАССНАЯ РАБОТА=================
//        =============================================
//        =============================================
//
//  let cars = [ {producer:"subaru",model: "wrx",year: 2010, color:"blue",type: "sedan",engine: "ej204x",volume: 2,power: 400},
//  {producer:"subaru",model: "legacy",year: 2007, color:"silver",type: "sedan",engine: "ez30",volume: 3,power: 250},
//  {producer:"subaru",model: "tribeca",year: 2011, color:"white",type: "jeep",engine: "ej20",volume: 2,power: 300},
//  {producer:"subaru",model: "leone",year: 1998, color:"yellow",type: "sedan",engine: "ez20x",volume: 2,power: 140},
//  {producer:"subaru",model: "impreza",year: 2014, color:"red",type: "sedan",engine: "ej204x",volume: 2,power: 200},
//  {producer:"subaru",model: "outback",year: 2014, color:"red",type: "hachback",engine: "ej204",volume: 2,power: 165},
//  {producer:"bmw",model: "115",year: 2013, color:"red",type: "hachback",engine: "f15",volume: 1.5,power: 120},
//  {producer:"bmw",model: "315",year: 2010, color:"white",type: "sedan",engine: "f15",volume: 1.5, power: 120},
//  {producer:"bmw",model: "650",year: 2009, color:"black",type: "coupe",engine: "f60",volume: 6,power: 350},
//  {producer:"bmw",model: "320",year: 2012, color:"red",type: "sedan",engine: "f20",volume: 2,power: 180},
//  {producer:"mercedes",model: "e200",year: 1990, color:"silver",type: "sedan",engine: "eng200",volume: 2,power: 180},
//  {producer:"mercedes",model: "e63",year 2017, color:"yellow",type: "sedan",engine: "amg63",volume:3,power: 400},
//  {producer:"mercedes",model: "c250",year: 2017, color:"red",type: "sedan",engine: "eng25",volume: 2.5,power: 230} ];
//  Відфільтрувати масив за наступними крітеріями :
//  - двигун більше 3х літрів
//  - двигун = 2л
//  - виробник мерс
//  - двигун більше 3х літрів + виробник мерседес
//  - двигун більше 3х літрів + виробник субару
//  - сили більше ніж 300
//  - сили більше ніж 300 + виробник субару
//  - мотор серіі ej
//  - сили більше ніж 300 + виробник субару + мотор серіі ej
//  - двигун меньше 3х літрів + виробник мерседес
//  - двигун більше 2л + сили більше 250
//  - сили більше 250  + виробник бмв
//
//  - взять слдующий массив
//  let usersWithAddress =
//  [{id: 1, name: 'vasya', age: 31, status: false, address:
//  {city: 'Lviv', street: 'Shevchenko', number: 16}}, {id: 2, name: 'petya', age: 30, status: true, address:
//  {city: 'Lviv', street: 'Shevchenko', number: 1}}, {id: 3, name: 'kolya', age: 29, status: true, address:
//  {city: 'Lviv', street: 'Shevchenko', number: 121}}, {id: 4, name: 'olya', age: 28, status: false, address:
//  {city: 'Lviv', street: 'Shevchenko', number: 90}}, {id: 5, name: 'max', age: 30, status: true, address:
//  {city: 'Lviv', street: 'Shevchenko', number: 115}}, {id: 6, name: 'anya', age: 31, status: false, address:
//  {city: 'Lviv', street: 'Shevchenko', number: 2}}, {id: 7, name: 'oleg', age: 28, status: false, address:
//  {city: 'Lviv', street: 'Shevchenko', number: 22}}, {id: 8, name: 'andrey', age: 29, status: true, address:
//  {city: 'Lviv', street: 'Shevchenko', number: 43}}, {id: 9, name: 'masha', age: 30, status: true, address:
//  {city: 'Lviv', street: 'Shevchenko', number: 12}}, {id: 10, name: 'olya', age: 31, status: false, address:
//  {city: 'Lviv', street: 'Shevchenko', number: 16}}, {id: 11, name: 'max', age: 31, status: true, address:
//  {city: 'Lviv', street: 'Shevchenko', number: 121}}];
//  -- отсортировать его по id пользователей
//  -- отсортировать его по id пользователей в обратном опрядке
//  -- отсортировать его по возрасту пользователей
//  -- отсортировать его по возрасту пользователей в обратном порядке
//  -- отсортировать его по имени пользователей
//  -- отсортировать его по имени пользователей в обратном порядке
//  -- отсортировать его по названию улицы  в алфавитном порядке
//  -- отсортировать его по номеру дома по возрастанию
//  -- отфильтровать (оставить) тех кто младше 30
//  -- отфильтровать (оставить) тех у кого отрицательный статус
//  -- отфильтровать (оставить) тех у кого отрицательный статус и младше 30 лет
//  -- отфильтровать (оставить) тех у кого номер дома четный
//
//        ===========================
//        ======ДОПОЛНИТЕЛЬНО========
//        ===========================
//
//  Створити обєкт автомобіля з полями:
//  Марка автомобля, потужність двигуна, власник, ціна, рік випуску.
//  Власник автомобіля теж має бути обєкт, у якого є поля
//  Імя, вік, стаж водіння.
//  Створити не менше 7 та не більше 20 машинок.
//  Зробили половину автопарку ремонт мотору, що збільшить потужність автомобілів на 10%
//  (переприсвоєння змінної потужності).
//  На відремонтовані автомобілі найняти нових водіїв (переприсвоїти змінну водій).
//  Для початку вкладіть всі наші створені автомобілі в масив cars.
//  Далі необхідно рати кожну другу машинку (цикл з кроком в 2), та робити їй підвищення потужності
//  двигуна на 10% та ціну на 5%
//  Після того зробити перевірку досвіду ВСІХ наших водіїв. Якщо досвід водія менший за 5 років,
//  але його вік більший за 25, то необідно відправити його на курси підвищення кваліфікації,
//  що збільшить йому досвід на 1 рік.
//  Також спробуйте порахувати суму, яку потрібно потратити для покупки всіх цих авто в циклі
//
//  Задача: дан отсортированный по возрастанию массив целых чисел. Необходимо вернуть наименьший и
//  наибольший индекс заданного элемента.
//  Входные данные: arr — массив целых чисел значения которых по модулю не больше 10.
//  Размер массива не более 10 элементов.
//  Вывод: наибольший и наименьший индекс в массиве заданного элемента.
//  Если такого элемента нет в массиве, выведите -1.
//
//  Пример:
//  Arr = [1, 2, 3, 4, 4, 4, 4, 7, 7, 9, 14]
//  1. Key = 1
//  Answer: MinIndex = 0, MaxIndex = 0.
//  2. Key = 4
//  Answer: MinIndex = 3, MaxIndex = 6.