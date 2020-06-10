package lesson5;

import java.util.*;

public class Cinema {
    private TreeMap<Days, Schedule> map;
    private Time open;
    private Time close;

    public Cinema(TreeMap<Days, Schedule> map, Time open, Time close) {
        this.map = map;
        Set<Map.Entry<Days, Schedule>> entrySet = map.entrySet();
        for (Map.Entry<Days, Schedule> entry : entrySet) {
            TreeSet<Seance> seances = entry.getValue().getSeances();
            for (Seance seance : seances) {
                // Sorting Work Perfectly
                if (seance.getStartTime().getHours() > open.getHours() && seance.getStartTime().getHours() < close.getHours()) {
                    System.out.println("Ok on open!: " + seance.getMovie().getTitle());
                } else if (seance.getStartTime().getHours() == open.getHours()) {
                    if (seance.getStartTime().getMinutes() >= open.getMinutes()) {
                        System.out.println("Ok on open!: " + seance.getMovie().getTitle());
                    } else {
                        System.out.println("Error on open!: " + seance.getMovie().getTitle());
                    }
                } else {
                    System.out.println("Error on open!: " + seance.getMovie().getTitle());
                }

                if (seance.getEndTime().getHours() < close.getHours() && seance.getEndTime().getHours() > open.getHours()) {
                    System.out.println("Ok on close!: " + seance.getMovie().getTitle());
                } else if (seance.getEndTime().getHours() == close.getHours()) {
                    if (seance.getEndTime().getMinutes() <= close.getMinutes()) {
                        System.out.println("Ok on close!: " + seance.getMovie().getTitle());
                    } else {
                        System.out.println("Error on close!: " + seance.getMovie().getTitle());
                    }
                } else {
                    System.out.println("Error on close!: " + seance.getMovie().getTitle());
                }
            }
        }
        this.open = open;
        this.close = close;
    }

    public TreeMap<Days, Schedule> getMap() {
       return map;
    }

    public void setMap(TreeMap<Days, Schedule> map) {
        this.map = map;
    }

    public Time getOpen() {
        return open;
    }

    public void setOpen(Time open) {
        this.open = open;
    }

    public Time getClose() {
        return close;
    }

    public void setClose(Time close) {
        this.close = close;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cinema cinema = (Cinema) o;
        return Objects.equals(map, cinema.map) &&
                Objects.equals(open, cinema.open) &&
                Objects.equals(close, cinema.close);
    }

    @Override
    public int hashCode() {
        return Objects.hash(map, open, close);
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "map=" + map +
                ", open=" + open +
                ", close=" + close +
                '}';
    }

    public void addSeances(String day, Seance... seances) {
        Days chosenDay = Days.valueOf(day);
        Schedule schedule = map.get(chosenDay);
        for (Seance s : seances) {
            schedule.addSeance(s);
        }
    }

    public void removeMovie(Movie movie) {
        Set<Map.Entry<Days, Schedule>> entrySet = map.entrySet();
        Iterator<Map.Entry<Days, Schedule>> iterator = entrySet.iterator();

        while (iterator.hasNext()) {
            Map.Entry<Days, Schedule> next = iterator.next();
            Schedule schedule = next.getValue();
            TreeSet<Seance> seances = schedule.getSeances();
            Iterator<Seance> seanceIterator = seances.iterator();

//            seances.removeIf(seance -> seance.getMovie().equals(movie));

            while (seanceIterator.hasNext()) {
                Seance seance = seanceIterator.next();
                if (seance.getMovie().equals(movie)) {
                    seanceIterator.remove();
                }
            }
        }
    }

    public void removeSeance(Seance seance, Days days) {
        Set<Map.Entry<Days, Schedule>> entrySet = map.entrySet();
        for (Map.Entry<Days, Schedule> entry : entrySet) {
            if (entry.getKey().equals(days)) {
                entry.getValue().removeSeance(seance);
            }
        }
    }
}
