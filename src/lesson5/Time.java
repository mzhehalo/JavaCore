package lesson5;

import java.util.Objects;

public class Time {
    private int hours;
    private int minutes;

//    public Time(int hours, int minutes) {
//        if (minutes >= 0 && minutes <= 60 && hours >= 0 && hours <= 23) {
//            this.hours = hours;
//            this.minutes = minutes;
//        } else {
//            System.out.println("Set Minutes or Hours are less zero or more their true values!");
//        }
//    }

    public Time(int hours, int minutes) {
            this.hours = hours;
            this.minutes = minutes;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes <= 60) {
            this.minutes = minutes;
        } {
            System.out.println("Set Minutes less zero or more its true value!");
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours <= 23) {
            this.hours = hours;
        } {
            System.out.println("Set Hours less zero or more its true value!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return minutes == time.minutes &&
                hours == time.hours;
    }

    @Override
    public int hashCode() {
        return Objects.hash(minutes, hours);
    }

    @Override
    public String toString() {
        return "Time{" +
                "hours=" + hours +
                ",minutes=" + minutes +
                '}';
    }
}
