package lesson5;

import java.util.Objects;

public class Time {
    private int minutes;
    private int hours;

    public Time(int minutes, int hours) {
        if (minutes >= 0 && minutes <= 60 && hours >= 0 && hours <= 23) {
            this.minutes = minutes;
            this.hours = hours;
        } else {
            this.minutes = minutes - 60;
            this.hours = hours + 1;
//            System.out.println("Minutes or Hours are less zero or more their values!");
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes <= 60) {
            this.minutes = minutes;
        } {
            System.out.println("Minutes are less zero or more its value!");
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours <= 23) {
            this.hours = hours;
        } {
            System.out.println("Hours are less zero or more its value!");
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
                "minutes=" + minutes +
                ", hours=" + hours +
                '}';
    }
}
