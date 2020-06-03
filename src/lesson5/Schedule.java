package lesson5;

import java.util.TreeSet;

public class Schedule {
    private TreeSet<Seance> seances;

    public Schedule(TreeSet<Seance> seances) {
        this.seances = new TreeSet<>();
    }

//    public Schedule(TreeSet<Seance> seances) {
//        seances = new TreeSet<>();
//        this.seances = seances;
//    }

//    public Schedule(TreeSet<Seance> seances) {
//        this.seances = seances;
//    }

    public TreeSet<Seance> getSeances() {
        return seances;
    }

    public void setSeances(TreeSet<Seance> seances) {
        this.seances = seances;
    }

    public void addSeance(Seance seance) {
        this.seances.add(seance);
    }

    public void removeSeance(Seance seance) {
        this.seances.remove(seance);
    }
}
