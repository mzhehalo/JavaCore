package lesson7;

import java.util.*;
import java.util.stream.Collectors;

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

        List<String> collect8 = stringList.stream().map(word -> "!" + word).collect(Collectors.toList());
        System.out.println("Task12: " + collect8);

        // Task13 User Array List
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
                .sorted((o1, o2) -> o2.getName().length() - o1.getName().length())
                .collect(Collectors.toList());

        collect13.forEach(user -> System.out.println("Task17: " + user));
        System.out.println("====================");

        // Task18
        List<User> usersWithId = userArrayList.stream().map(user -> {
            user.setId(new Random().nextInt(100500));
            return user;
        }).collect(Collectors.toList());

        usersWithId.forEach(user -> System.out.println("Task18: " + user));
        System.out.println("====================");

        //Task19
        List<User> collect14 = usersWithId.stream().sorted(Comparator.comparing(User::getId)).collect(Collectors.toList());
        collect14.forEach(user -> System.out.println("Task19: " + user));
    }
}

//  1.-- создать массив с 20 числами.
//  2.-- при помощи метода sort и колбека  отсортировать массив.
//  3.-- при помощи метода sort и колбека отсортировать массив в ниспадающем напралении.
//  4.-- при помощи filter получить числа кратные 3
//  5.-- при помощи filter получить числа кратные 10
//  6.-- перебрать (проитерировать) массив при помощи foreach()
//  7.-- перебрать массив при помощи map() и получить новый массив в котором все значения будут в 3 раза больше
//
//  8.-- создать массив со словами на 15-20 элементов.
//  9.-- отсортировать его по алфавиту в восходящем порядке.
//  10.-- отсортировать его по алфавиту  в нисходящем порядке.
//  11.-- отфильтровать слова длиной менее 4х символов
//  12.-- перебрать массив при помощи map() и получить новый массив
//  в котором все значения будут со знаком "!" в конце
//
//  Все робити через функції масивів (foreach, map ...тд)
//  13.Дан масив :
//  let users = [ {name: 'vasya', age: 31, status: false},
//  {name: 'petya', age: 30, status: true}, {name: 'kolya', age: 29, status: true},
//  {name: 'olya', age: 28, status: false}, {name: 'max', age: 30, status: true},
//  {name: 'anya', age: 31, status: false}, {name: 'oleg', age: 28, status: false},
//  {name: 'andrey', age: 29, status: true}, {name: 'masha', age: 30, status: true},
//  {name: 'olya', age: 31, status: false}, {name: 'max', age: 31, status: true} ];
//  14-15.- відсортувати його за  віком (зростання , а потім окремо спадання)
//  16-17.- відсортувати його за кількістю знаків в імені  (зростання , а потім окремо спадання)
//  18.- пройтись по ньому та додати кожному юзеру поле id - яке характеризує унікальний індентифікатор
//  (По якому принципу його створювати - ваше рішення), та зберегти це в новий масив
//  (первинний масив залишиться без змін)
//  19.- відсортувати його за індентифікатором
