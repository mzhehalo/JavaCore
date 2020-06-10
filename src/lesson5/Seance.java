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

        if (minute >= 60) {
            hour = hour + (minute / 60);
            minute = minute % 60;
        }

        if (hour >= 24) {
            hour = hour % 24;
        }

        this.endTime = new Time(
                hour,
                minute
        );

        System.out.println(this.endTime + " end time");
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
