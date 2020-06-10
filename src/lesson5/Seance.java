package lesson5;

public class Seance implements Comparable<Seance> {
    private Movie movie;
    private Time startTime;
    private Time endTime;

    public Seance(Movie movie, Time startTime) {
        this.movie = movie;
        this.startTime = startTime;
        int hour = this.startTime.getHours() + this.movie.getDuration().getHours();
        int minute = this.startTime.getMinutes() + this.movie.getDuration().getMinutes();
        // First Way
//        if (hour >= 24) {
//            hour = hour - 24;
//        }

        // SecondWay

        if (minute >= 60 && minute <= 119) {
            minute = minute - 60;
            hour += 1;
        } else if (minute >= 120 && minute <= 179) {
            minute = minute - 60 * 2;
            hour += 2;
        } else if (minute >= 180 && minute <= 239) {
            minute = minute - 60 * 3;
            hour += 3;
        }

        if (hour >= 24 && hour <= 47) {
            hour = hour - 24;
        } else if (hour >= 48 && hour <= 71) {
            hour = hour - 24 * 2;
        } else if (hour >= 72 && hour <= 95) {
            hour = hour - 24 * 3;
        }

        this.endTime = new Time(
                hour,
                minute
        );

        System.out.println(this.endTime + " end time..................." + movie.getTitle());
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Seance{" +
                "movie=" + movie +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    @Override
    public int compareTo(Seance o) {
        return this.startTime.getHours() - o.startTime.getHours();
    }
}
