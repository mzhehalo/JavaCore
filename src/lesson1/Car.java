package lesson1;

public class Car {
    private int id;
    private String model;
    private Double volume;
    private int power;

    public Car(int id, String model, Double volume, int power) {
        this.id = id;
        this.model = model;
        this.volume = volume;
        this.power = power;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", volume=" + volume +
                ", power=" + power +
                '}';
    }
}
