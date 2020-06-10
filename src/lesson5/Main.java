package lesson5;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("The one living boy in new york", new Time(2, 30));
        Movie movie2 = new Movie("The hunt", new Time(1, 40));
        Movie movie3 = new Movie("The Call of the Wild", new Time(2, 0));

        Movie movie4 = new Movie("Dolittle", new Time(1, 35));
        Movie movie5 = new Movie("Extraction", new Time(1, 56));
        Movie movie6 = new Movie("1917", new Time(2, 25));

        Seance seance1 = new Seance(movie1, new Time(20, 1));
        Seance seance2 = new Seance(movie2, new Time(9, 0));
        Seance seance3 = new Seance(movie3, new Time(17, 0));

        Seance seance4 = new Seance(movie4, new Time(10, 1));
        Seance seance5 = new Seance(movie5, new Time(14, 20));
        Seance seance6 = new Seance(movie6, new Time(16, 0));

        Schedule schedule1 = new Schedule();
        Schedule schedule2 = new Schedule();
        schedule1.addSeance(seance1);
        schedule1.addSeance(seance2);
        schedule1.addSeance(seance3);

        TreeMap<Days, Schedule> scheduleForCinema1 = new TreeMap<>();
        scheduleForCinema1.put(Days.MONDAY, schedule1);

        Cinema cinema1 = new Cinema(scheduleForCinema1,
                new Time(8, 20), new Time(22, 30));

        TreeMap<Days, Schedule> scheduleForCinema2 = new TreeMap<>();
        scheduleForCinema2.put(Days.TUESDAY, schedule2);
        Cinema cinema2 = new Cinema(scheduleForCinema2, new Time(7, 30),
                new Time(20, 40));

        cinema1.addSeances("Monday", seance1, seance2, seance3);
        System.out.println("========Added Seances or Seance. Cinema1==========");
        System.out.println(cinema1);

        cinema2.addSeances("Tuesday", seance4, seance5, seance6);
        System.out.println("========Added Seances or Seance. Cinema2==========");
        System.out.println(cinema2);

        cinema1.removeMovie(movie1);
        System.out.println("=========Removed Movie1=========");
        System.out.println(cinema1);

        cinema1.removeSeance(seance2,  Days.MONDAY);
        System.out.println("=========Removed Seance2=========");
        System.out.println(cinema1);
    }
}

//   1. Розібратись як працює compareTo в String
//   2. Розібратись як загалом працює compareTo :)
//
// Даний проект має такі сутності: Days, Time, Movie, Seance, Schedule, Cinema.
//   enum Days:
// - прописати дні тижня;
//   Time:
// - int min, int hour;
// - передбачити межі для цих полів (для min 0..59, для hour 0..23);
//   Movie:
// - String title, Time duration;
//   Seance:
// - Movie movie, Time startTime, Time endTime;
// - в конструктор має надходити параметрами значення для перших двох полів,
// третє поле повинне обчислюватись (start + duration);
//   Schedule:
// - TreeSet <Seance> (в полі пишемо Set <Seance>, а в конструкторі вже =new TreeSet <Seance>() );
// - Сортування по startTime.
// - методи: addSeance (Seance), removeSeance (Seance);
//   Cinema:
// - TreeMap<Days, Schedule>, Time open, Time close;
// - врахувати час відкриття і закриття при формуванні сеансів!
// - методи: addSeances (String day, Seance...seance) (додає набір сеансів в конкретний день),
// addSeance (Seance, String) (додає один сеанс в конкретний день), removeMovie(Movie)
// (повністю видаляє усі сеанси вказаного фільму з розкладу), removeSeance (Seance, String)
// (видаляє конкретний сеанс фільму в конкретний день, який задається параметром String).
//
//   Main class:
// - створення об'єкту Cinema;
// - викликаємо всі методи Cinema
//
// Для кожного класу зробити адекватний toString, щоб все було читабельно і доступно.
// Там де потрібно, зробити compareTo(). Маєте якісь власні ідеї для розробки - будь-ласка.
// Це моделювання роботи кінотеатру, тому все що наблизить програму до реальності вітається.